package br.com.tutoronline.model;
import br.com.tutoronline.entity.Coordenador;
import br.com.tutoronline.resources.IPersistencia;

public class CoordenadorDAO implements IPersistencia<Coordenador>{

	@Override
	public boolean GraveDados(Coordenador objeto) {
		return false;
	}

	@Override
	public boolean ObtenhaDados(Coordenador objeto) {
		return false;
	}

	@Override
	public boolean AtualizeDados(Coordenador objeto) {
		return false;
	}

	@Override
	public boolean Desative(Coordenador objeto) {
		return false;
	}

}
