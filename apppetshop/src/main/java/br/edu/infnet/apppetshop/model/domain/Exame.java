package br.edu.infnet.apppetshop.model.domain;



public class Exame extends Servico {
	
	private int consulta;
	private boolean vacina;
	private String informacao;
	

	public Exame(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
		
	}



	@Override
	public float calcularExame() {
		
		if(vacina) 
		{
			return (getValor() + 70) * consulta;
		}

		
		return getValor() * consulta;
	}
	
	public String toString() {
		
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(consulta);
		sb.append(";");
		sb.append(vacina ? "sim" : "nao");
		sb.append(";");
		sb.append(informacao);
		
		
		return sb.toString();
}
	

	public int getConsulta() {
		return consulta;
	}
	public void setConsulta(int consulta) {
		this.consulta = consulta;
	}
	
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	
}
