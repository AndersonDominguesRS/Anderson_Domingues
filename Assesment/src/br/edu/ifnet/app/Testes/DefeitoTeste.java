package br.edu.ifnet.app.Testes;

import br.edu.ifnet.app.Dominio.Cliente;
import br.edu.ifnet.app.Dominio.Defeito;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

public class DefeitoTeste {
	
	public static void main(String[] args) {
		
		
		
		Cliente c1= new Cliente("SHOPPING PIRACICABA", "11.921.565/0001-28", "RUA DOS ESTADOS, "
				+ "51", "CAMPO GRANDE", "SAO PAULO", "BRASIL", "94828-000");
		
		Cliente c2= new Cliente(null, "11.921.565/0001-28", "RUA DOS ESTADOS, "
				+ "51", "CAMPO GRANDE", "SAO PAULO", "BRASIL", "94828-000");		

		
		Defeito df1=new Defeito(c1.getNomeCliente(), "N�O LIGA O MONITOR");
		
		Defeito df2=new Defeito(c2.getNomeCliente(), "N�O LIGA A IMPRESSORA");
		
		Defeito df3=new Defeito(c1.getNomeCliente(), "N�O LIGA A IMPRESSORA");
		

		
		df1.setCliente(c1);	
				
		
		try {
			System.out.println (df1.regOcorrencia("AUTO ATENDIMENTO 2"));
								
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			System.out.println (df2.regOcorrencia("AUTO ATENDIMENTO 3"));
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		
		try {
			System.out.println (df3.regOcorrencia(null));
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
	}

}
