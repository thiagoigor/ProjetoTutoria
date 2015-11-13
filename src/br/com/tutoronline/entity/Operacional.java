package br.com.tutoronline.entity;

public class Operacional {
	private int id;
	private String nome;
	private String matricula;
	private String email;
	private String telefone;
	private String tipo;
	private String subTipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSubTipo() {
		return subTipo;
	}
	public void setSubTipo(String subTipo) {
		this.subTipo = subTipo;
	}
	
	
	
}
