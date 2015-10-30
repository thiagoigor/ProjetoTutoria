package br.com.tutoronline.resources;

public interface IPersistencia<TObjeto> {

	final String INSERT = "INSERT";
	final String UPDATE = "UPDATE";
	final String DELETE = "DELETE";
	final String SELECT = "SELECT";
	final String FROM = "FROM";
	final String WHERE = "WHERE";
	final String AND = "AND";
	final String OR = "OR";
	
	boolean GraveDados(TObjeto objeto);
	boolean ObtenhaDados(TObjeto objeto);
	boolean AtualizeDados(TObjeto objeto);
	boolean Desative(TObjeto objeto);
}
