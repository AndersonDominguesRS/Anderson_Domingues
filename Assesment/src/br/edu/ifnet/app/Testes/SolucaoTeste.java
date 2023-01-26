package br.edu.ifnet.app.Testes;

import br.edu.ifnet.app.Dominio.Solucao;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

public class SolucaoTeste {
	
	public static void main(String[] args) {
		
		Solucao atPreventivo=new Solucao("IMPRESSORA", 11, 13, 0, 0);
		
		try {
			atPreventivo.regOcorrencia("SHOPPING", "TERMINAL DE IMPRESSÃO 2", "REALIZADO AJUSTE NA IMPRESSORA", "24/01/2023");
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		System.out.println("--------------------------------------------");
		
		Solucao atCorretivo=new Solucao("LEITOR", 13, 14, 10, 12);
		
		try {
			atCorretivo.regOcorrencia("SHOPPING", "TERMINAL DE IMPRESSÃO 2", "REALIZADO AJUSTE NA IMPRESSORA", "24/01/2023");
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
			
	}

}
