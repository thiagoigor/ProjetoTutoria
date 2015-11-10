package br.com.tutoronline.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.com.tutoronline.entity.Coordenador;
import br.com.tutoronline.resources.IPersistencia;

public class CursoDAO implements IPersistencia<Coordenador>{

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	@Override
	public boolean GraveDados(Coordenador objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Coordenador> ObtenhaDados(Coordenador objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean AtualizeDados(Coordenador objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Desative(Coordenador objeto) {
		// TODO Auto-generated method stub
		return false;
	}

}
