package br.edu.infnet.apppetshop.model.domain;

public class Higiene extends Servico {
	




	private int quantidade;
	private boolean unhas;
	private String detalhes;
	
	public Higiene(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
		
	}
	
	
	@Override
	public float calcularServico() {
		if(unhas) 
		{
			return (getValor() + 25) * quantidade;
		}
		return getValor() * quantidade;
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(quantidade);
		sb.append(";");
		sb.append(unhas ? "sim" : "nao");
		sb.append(";");
		sb.append(detalhes);
		
		
		return sb.toString();
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isUnhas() {
		return unhas;
	}
	public void setUnhas(boolean unhas) {
		this.unhas = unhas;
	}
	
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}


}
