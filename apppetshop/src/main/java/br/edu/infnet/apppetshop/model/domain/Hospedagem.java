package br.edu.infnet.apppetshop.model.domain;



public class Hospedagem extends Servico {
	
	private int diaria;
	private boolean grande;
	private String cuidados;
	
	
	public Hospedagem(String nome, float valor, int codigo) {
		super(nome, valor, codigo);

	}
	
	
	@Override
	public float calcularServico() {
		if(grande) 
		{
			return (getValor() + 220) * diaria;
		}
		return getValor() * diaria;
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(diaria);
		sb.append(";");
		sb.append(grande ? "sim" : "nao");
		sb.append(";");
		sb.append(cuidados);
		
		
		return sb.toString();
	}
	
	
	public int getDiaria() {
		return diaria;
	}
	public void setDiaria(int diaria) {
		this.diaria = diaria;
	}
	public boolean isGrande() {
		return grande;
	}
	public void setGrande(boolean grande) {
		this.grande = grande;
	}
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}

}
