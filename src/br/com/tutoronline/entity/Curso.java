package br.com.tutoronline.entity;

public class Curso {
	private int id;
	private String codigo;
	private String nome;
	private String centro_de_custo;
	private String periodos;
	private char siclo_basico;
	private Coordenador coordenador;
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCentro_de_custo() {
		return centro_de_custo;
	}
	public void setCentro_de_custo(String centro_de_custo) {
		this.centro_de_custo = centro_de_custo;
	}
	public String getPeriodos() {
		return periodos;
	}
	public void setPeriodos(String periodos) {
		this.periodos = periodos;
	}
	public char getSiclo_basico() {
		return siclo_basico;
	}
	public void setSiclo_basico(char siclo_basico) {
		this.siclo_basico = siclo_basico;
	}
	public Coordenador getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
}
