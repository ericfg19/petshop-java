package br.edu.infnet.apppetshop.model.domain;

import java.time.format.DateTimeFormatter;

public abstract class Servico {

	private String nome;
	private float valor;
	private int codigo;
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Servico(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}

	public abstract float calcularExame();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		

		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public float getValor() {
		return valor;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	
}
