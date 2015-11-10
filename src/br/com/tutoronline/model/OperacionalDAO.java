package br.com.tutoronline.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.tutoronline.entity.Coordenador;
import br.com.tutoronline.entity.Operacional;
import br.com.tutoronline.resources.ConnectionFactory;
import br.com.tutoronline.resources.FactoryUtil;
import br.com.tutoronline.resources.IPersistencia;

public class OperacionalDAO implements IPersistencia<Operacional>{

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	@Override
	public boolean GraveDados(Operacional objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = INSERT + INTO + " usuario (nome, matricula, email, id_subtipo, telefone) "+VALUES+" (?,?,?,?,?)";

		try {

			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, objeto.getNome());
			stmt.setString(2, objeto.getMatricula());
			stmt.setString(3, objeto.getEmail());
			stmt.setInt(4, objeto.getIdSubTipo());
			stmt.setString(5, objeto.getTelefone());
			stmt.execute();

			return this.stmt.execute();

		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Operacional> ObtenhaDados(Operacional objeto) {
		List<Operacional> operacionais = null;

		String sql = SELECT + " * " + FROM + " coordenador";
		try {
			stmt = this.conn.prepareStatement(sql);

			rs = stmt.executeQuery();
			operacionais = new ArrayList<>();
			while(rs.next()){
				Operacional operacional = new Operacional();
				operacional.setIdSubTipo(rs.getInt("id_subtipo"));
				operacional.setId(rs.getInt("id"));
				operacional.setNome(rs.getString("nome"));
				operacional.setMatricula(rs.getString("matricula"));
				operacional.setEmail(rs.getString("email"));
				operacional.setTelefone(rs.getString("telefone"));
				operacional.setIdTipo(rs.getInt("id_tipo"));
				operacionais.add(operacional);
			}
			return operacionais;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean AtualizeDados(Operacional objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = UPDATE + " usuario " + 
				SET + " nome = ?, matricula = ?,email = ?, telefone = ?, id_subtipo = ? " + 
				WHERE +" usuario.id_usuario = ?";

		try {
			stmt = this.conn.prepareStatement(sql);

			stmt.setString(1, objeto.getNome());
			stmt.setString(2, objeto.getMatricula());
			stmt.setString(3, objeto.getEmail());
			stmt.setString(4, objeto.getTelefone());
			stmt.setInt(5, objeto.getIdSubTipo());
			stmt.setInt(6, objeto.getId());

			return this.stmt.executeUpdate() > 0 ;

		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public boolean Desative(Operacional objeto) {
		return false;
	}

}
