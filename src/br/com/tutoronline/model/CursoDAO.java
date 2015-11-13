package br.com.tutoronline.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.tutoronline.entity.Curso;
import br.com.tutoronline.resources.ConnectionFactory;
import br.com.tutoronline.resources.FactoryUtil;
import br.com.tutoronline.resources.IPersistencia;

public class CursoDAO implements IPersistencia<Curso>{

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	@Override
	public boolean GraveDados(Curso objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = INSERT + INTO + " curso (CSCOD, CSCENTROCUSTO, CSNOME, CSPERIODOS, CSCICLO, CSCOID) "+VALUES+" (?,?,?,?,?,?)";

		try {

			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, objeto.getCodigo());
			stmt.setString(2, objeto.getCentro_de_custo());
			stmt.setString(3, objeto.getNome());
			stmt.setInt(4, objeto.getPeriodos());
			stmt.setBoolean(5, objeto.isCiclo());
			stmt.setInt(6, objeto.getCoordenador());

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
	public List<Curso> ObtenhaDados(Curso objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();
		List<Curso> cursos = null;

		String sql = SELECT + " * " + FROM + " CURSO";
		try {
			stmt = this.conn.prepareStatement(sql);

			rs = stmt.executeQuery();
			cursos = new ArrayList<>();
			while(rs.next()){
				Curso curso = new Curso();
				curso.setNome(rs.getString("CSNOME"));
				curso.setCodigo(rs.getString("CSCOD"));
				curso.setCentro_de_custo(rs.getString("CSCENTROCUSTO"));
				curso.setPeriodos(rs.getInt("CSPERIODOS"));
				curso.setCiclo(rs.getBoolean("CSCICLO"));
				curso.setCoordenador(rs.getInt("CSCOID"));;

			}
			return cursos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean AtualizeDados(Curso objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = UPDATE + " curso " + 
				SET + " CSCOD = ?, CSCENTROCUSTO = ?, CSNOME = ?, CSPERIODOS = ?, CSCICLO = ?, CSCOID = ?" + 
				WHERE +" curso.csid = ?";

		try {
			stmt = this.conn.prepareStatement(sql);

			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, objeto.getCodigo());
			stmt.setString(2, objeto.getCentro_de_custo());
			stmt.setString(3, objeto.getNome());
			stmt.setInt(4, objeto.getPeriodos());
			stmt.setBoolean(5, objeto.isCiclo());
			stmt.setInt(6, objeto.getCoordenador());
			stmt.setInt(7, objeto.getId());

			return this.stmt.executeUpdate() > 0;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Desative(Curso objeto) {
		// TODO Auto-generated method stub
		return false;
	}

}
