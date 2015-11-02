package br.com.tutoronline.entity;

public class Coordenador {
	
	private int id;
	private String nome;
	private String matricula;
	private String email;
	private String telefone;
	
	
	public Coordenador setCoordenador(String nome, String matricula, String email, String telefone) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.telefone = telefone;
		return this;
	}
	
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
}
