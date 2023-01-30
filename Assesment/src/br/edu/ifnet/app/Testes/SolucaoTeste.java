package br.edu.ifnet.app.Testes;

import br.edu.ifnet.app.Dominio.Solucao;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

public class SolucaoTeste {
	
	public static void main(String[] args) {
		
		
		Solucao atPreventivo1= new Solucao("NOVO SHOPPING", "REALIZADO MANUTENÇÃO PREVENTIVA",
				null, 12, 13);
		Solucao atPreventivo2= new Solucao(null, "REALIZADO MANUTENÇÃO PREVENTIVA",
				null, 12, 13);
		Solucao atPreventivo3= new Solucao("NOVO SHOPPING", null,
				null, 12, 13);
		
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
				null, 12, 13);
		
		atCorretivo1.setHoraAberturaTeste(12);
		atCorretivo1.setHoraRecebimento(13);
		atCorretivo1.setHoraInicioAtendimento(14);
		atCorretivo1.setHoraFimAtendimento(15);
				
		
		try {
			
			
			System.out.println(atCorretivo1.regOcorrencia("TERMINAL DE IMPRESSÃO"));
			atCorretivo1.imprimirCorretivo();
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		Solucao atCorretivo2= new Solucao("NOVO SHOPPING", "TROCA DA FONTE",
				null, 17, 13);
		atCorretivo2.setHoraAberturaTeste(15);
		atCorretivo2.setHoraRecebimento(14);
		atCorretivo2.setHoraFimAtendimento(18);
		
		try {
			
			
			System.out.println(atCorretivo2.regOcorrencia("TERMINAL DE IMPRESSÃO"));
			
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
			

	
	}

}
