package br.com.tutoronline.DAO;
import br.com.tutoronline.dto.Coordenador;
import br.com.tutoronline.interfaces.IPersistencia;

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
