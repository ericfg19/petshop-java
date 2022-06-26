package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Atendimento {
	
	
	private Cliente cliente;
	private LocalDateTime data;
	private String descricao;
	private List<Servico> servico;
	private boolean web;
	
	public Atendimento() {
		descricao = "Primeiro Atendimento";
		data = LocalDateTime.now();
		web = true;
	}
	
	public String toString() {
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
			StringBuilder sb = new StringBuilder();
			sb.append(descricao);
			sb.append(";");
			sb.append(data.format(formato));
			sb.append(";");
			sb.append(web ? "web" : "loja");
			sb.append(";");
			sb.append(cliente.toString());
			sb.append(";");
			sb.append(servico.size());
			
			
			return sb.toString();
	}
	
	
	public LocalDateTime getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	
	public List<Servico> getServico() {
		return servico;
	}
	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}



}

