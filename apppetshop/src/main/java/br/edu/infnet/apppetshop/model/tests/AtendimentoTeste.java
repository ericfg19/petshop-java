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
		
	//	Higiene higiene = new Higiene();
	//	Hospedagem hospedagem = new Hospedagem();
		
		List<Servico> servico = new ArrayList<Servico>();
		servico.add(exame);
	//	servico.add(higiene);
	//	servico.add(hospedagem);
		
		Cliente cliente = new Cliente("Hurley", "048151623-42", "teste@teste.com");
		
		Atendimento atendimento = new Atendimento();
		atendimento.setDescricao("Atendimento Teste Padrão");
		atendimento.setServico(servico);
		atendimento.setCliente(cliente);
		atendimento.setWeb(true);
		
		System.out.println(atendimento);
		
		
	}
	

}
