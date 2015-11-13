package br.com.tutoronline.entity;

public class Curso {
	private int id;
	private String codigo;
	private String nome;
	private String centro_de_custo;
	private int periodos;
	private boolean ciclo;
	private int coordenador;
	
	
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
	public int getPeriodos() {
		return periodos;
	}
	public void setPeriodos(int periodos) {
		this.periodos = periodos;
	}
	
	public int getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(int coordenador) {
		this.coordenador = coordenador;
	}
	public boolean isCiclo() {
		return ciclo;
	}
	public void setCiclo(boolean ciclo) {
		this.ciclo = ciclo;
	}
	
	
}
