package br.com.tutoronline.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.tutoronline.entity.Coordenador;
import br.com.tutoronline.resources.ConnectionFactory;
import br.com.tutoronline.resources.FactoryUtil;
import br.com.tutoronline.resources.IPersistencia;

public class CoordenadorDAO implements IPersistencia<Coordenador>{
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	@Override
	public boolean GraveDados(Coordenador objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = INSERT + INTO + " coordenador (COTELCEL, CONOME, COMAT, COEMAIL) "+VALUES+" (?,?,?,?)";

		try {
			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, objeto.getTelefone());
			stmt.setString(2, objeto.getNome());
			stmt.setString(3, objeto.getMatricula());
			stmt.setString(4, objeto.getEmail());
			
			return !this.stmt.execute();

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
	public List<Coordenador> ObtenhaDados(Coordenador objeto) {
		List<Coordenador> coordenadores=null;
		try{
			String sql = SELECT + " * " + FROM + " coordenador";
			stmt = this.conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			coordenadores = new ArrayList<>();
			while(rs.next()){
				Coordenador coordenador = new Coordenador();
				coordenador.setId(rs.getInt("coid"));
				coordenador.setNome(rs.getString("conome"));
				coordenador.setMatricula(rs.getString("comat"));
				coordenador.setEmail(rs.getString("coemail"));
				coordenador.setTelefone(rs.getString("cotelcel"));

				coordenadores.add(coordenador);
			}
			return coordenadores;
		}catch(SQLException e){
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
	public boolean AtualizeDados(Coordenador objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = UPDATE + " coordenador " + SET + " conome = ?, comat = ?, coemail = ?, cotelcel = ?" +WHERE+" coordenador.coid = ?";

		try {
			stmt = this.conn.prepareStatement(sql);

			stmt.setString(1, objeto.getNome());
			stmt.setString(2, objeto.getMatricula());
			stmt.setString(3, objeto.getEmail());
			stmt.setString(4, objeto.getTelefone());
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
	public boolean Desative(Coordenador objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();
		String sql = UPDATE + " COORDENADOR " + SET + " COODENADOR.ATIVADO = ? " + WHERE + " COODENADOR.ID_COORDENADOR = ?";
		try{
		stmt = this.conn.prepareStatement(sql);

		stmt.setBoolean(1, objeto.isAtivado());
		stmt.setInt(2, objeto.getId());

		return this.stmt.executeUpdate() > 0 ;
		}catch(SQLException e){
			
		}
		return false;
	}

}
