package br.com.tutoronline.resources;

import java.util.List;

public interface IPersistencia<TObjeto> {

	final String INSERT = " INSERT ";
	final String UPDATE = " UPDATE ";
	final String DELETE = " DELETE ";
	final String SELECT = " SELECT ";
	final String INTO = " INTO ";
	final String VALUES = " VALUES ";
	final String SET = " SET ";
	final String FROM = " FROM ";
	final String WHERE = " WHERE ";
	final String AND = " AND ";
	final String OR = " OR ";
	
	boolean GraveDados(TObjeto objeto);
	List<TObjeto> ObtenhaDados(TObjeto objeto);
	boolean AtualizeDados(TObjeto objeto);
	boolean Desative(TObjeto objeto);
}
