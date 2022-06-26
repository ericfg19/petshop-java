package br.edu.infnet.apppetshop.model.domain;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String nomepet;

	public Cliente(String nome, String cpf, String email, String nomepet) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nomepet = nomepet;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(nomepet);

		return sb.toString();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomepet() {
		return nomepet;
	}

	public void setNomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	
}
