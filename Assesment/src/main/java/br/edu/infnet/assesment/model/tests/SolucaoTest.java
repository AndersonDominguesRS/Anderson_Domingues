package br.edu.infnet.assesment.model.tests;

import br.edu.infnet.assesment.model.domain.Solucao;
import br.edu.infnet.assesment.model.exceptions.RegistraOcorrenciaExceptions;

public class SolucaoTest {
	
	public static void main(String[] args) {
		
		
		Solucao atPreventivo1= new Solucao("NOVO SHOPPING", "REALIZADO MANUTENÇÃO PREVENTIVA",
				null, null, null);
		Solucao atPreventivo2= new Solucao(null, "REALIZADO MANUTENÇÃO PREVENTIVA",
				null, null, null);
		Solucao atPreventivo3= new Solucao("NOVO SHOPPING", null,
				null, null, null);
		
		try {
			System.out.println(atPreventivo1.regOcorrencia("IMPRESSORA ESTOQUE"));
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			System.out.println(atPreventivo2.regOcorrencia("IMPRESSORA ESTOQUE"));
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			System.out.println(atPreventivo3.regOcorrencia("IMPRESSORA ESTOQUE"));
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		System.out.println("----------------------------------");
		
		Solucao atCorretivo1= new Solucao("NOVO SHOPPING", "AJUSTE NA VELOCIDADE DA IMPRESSORA",
				null, null, null);
		
//		atCorretivo1.setHoraRecebimento(13);
//		atCorretivo1.setHoraInicioAtendimento(14);
//		atCorretivo1.setHoraFimAtendimento(15);
				
		
		try {
			
			
			System.out.println(atCorretivo1.regOcorrencia("TERMINAL DE IMPRESSÃO"));
			atCorretivo1.imprimirCorretivo();
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		Solucao atCorretivo2= new Solucao("NOVO SHOPPING", "TROCA DA FONTE",
				null, null, null);
//		atCorretivo2.setHoraRecebimento(14);
//		atCorretivo2.setHoraFimAtendimento(18);
		
		try {
			
			
			System.out.println(atCorretivo2.regOcorrencia("TERMINAL DE IMPRESSÃO"));
			
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
			

	
	}

}
