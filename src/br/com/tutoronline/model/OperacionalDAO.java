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

		String sql = INSERT + INTO + " operador (OPNOME, OPMAT, OPEMAIL, OPTELCEL, OPTIPO, OPSUBTIPO) "+VALUES+" (?,?,?,?,?,?)";

		try {

			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, objeto.getNome());
			stmt.setString(2, objeto.getMatricula());
			stmt.setString(3, objeto.getEmail());
			stmt.setString(4, objeto.getTelefone());
			stmt.setString(5, objeto.getTipo());
			stmt.setString(6, objeto.getSubTipo());
			
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

		String sql = SELECT + " * " + FROM + " operador";
		try {
			stmt = this.conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			operacionais = new ArrayList<>();
			while(rs.next()){
				Operacional operacional = new Operacional();
				operacional.setSubTipo(rs.getString("OPSUBTIPO"));
				operacional.setId(rs.getInt("opid"));
				operacional.setNome(rs.getString("OPNOME"));
				operacional.setMatricula(rs.getString("OPMAT"));
				operacional.setEmail(rs.getString("OPEMAIL"));
				operacional.setTelefone(rs.getString("OPTELCEL"));
				operacional.setTipo(rs.getString("OPTIPO"));
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

		String sql = UPDATE + " operador " + 
				SET + " OPNOME = ?, OPMAT = ?, OPEMAIL = ?, OPTELCEL = ?, OPTIPO = ?, OPSUBTIPO = ?" + 
				WHERE +" operador.opid = ?";

		try {
			stmt = this.conn.prepareStatement(sql);

			stmt.setString(1, objeto.getNome());
			stmt.setString(2, objeto.getMatricula());
			stmt.setString(3, objeto.getEmail());
			stmt.setString(4, objeto.getTelefone());
			stmt.setString(5, objeto.getTipo());
			stmt.setString(6, objeto.getSubTipo());
			stmt.setInt(7, objeto.getId());

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
