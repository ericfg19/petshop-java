package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Exame;

public class ExameTeste {

		public static void main(String[] args) {
			
		
		Exame exame = new Exame("Checkup", 49.50f, 123);
		exame.setConsulta(1);
		exame.setVacina(true);
		exame.setInformacao("Precisará realizar hemograma");
		System.out.println("Valor = " +exame.calcularExame());
	}

}