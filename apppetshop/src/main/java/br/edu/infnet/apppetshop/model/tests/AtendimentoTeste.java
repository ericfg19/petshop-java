package br.edu.infnet.apppetshop.model.tests;

import java.util.List;
import java.util.ArrayList;

import br.edu.infnet.apppetshop.model.domain.Atendimento;
import br.edu.infnet.apppetshop.model.domain.Cliente;
import br.edu.infnet.apppetshop.model.domain.Exame;
import br.edu.infnet.apppetshop.model.domain.Higiene;
import br.edu.infnet.apppetshop.model.domain.Hospedagem;
import br.edu.infnet.apppetshop.model.domain.Servico;

public class AtendimentoTeste {
	
	public static void main(String[] args) {
		
		Exame exame = new Exame("Checkup", 49.50f, 123);
		exame.setConsulta(1);
		exame.setVacina(true);
		exame.setInformacao("Precisará realizar hemograma");
			
		Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199, 456);
		hospedagem.setDiaria(2);
		hospedagem.setGrande(false);
		hospedagem.setCuidados("Animal não possui uma pata");
		
		Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
		higiene.setQuantidade(1);
		higiene.setUnhas(true);
		higiene.setDetalhes("Ter cuidado ao limpar a orelha");
		
		List<Servico> servico = new ArrayList<Servico>();
		servico.add(exame);
		servico.add(higiene);
		servico.add(hospedagem);
		
		Cliente cliente = new Cliente("Hurley", "048151623-42", "teste@teste.com", "Shih-Tzu");
		
		Atendimento atendimento = new Atendimento();
		atendimento.setDescricao("Atendimento Teste Padrão");
		atendimento.setServico(servico);
		atendimento.setCliente(cliente);
		atendimento.setWeb(true);
		
		System.out.println(atendimento);
		
		System.out.println("Informações do Exame: " + exame);
		System.out.println("Valor = " +exame.calcularServico());
		
		System.out.println("Informações de Hospedagem: " +hospedagem);
		System.out.println("Valor = " +hospedagem.calcularServico());
		
		System.out.println("Informações de Higiene: " +higiene);
		System.out.println("Valor = " +higiene.calcularServico());
	}
	

}
