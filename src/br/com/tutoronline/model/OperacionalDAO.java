package br.com.tutoronline.model;

import java.util.List;

import br.com.tutoronline.entity.Coordenador;
import br.com.tutoronline.resources.IPersistencia;

public class OperacionalDAO implements IPersistencia<Coordenador>{

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
