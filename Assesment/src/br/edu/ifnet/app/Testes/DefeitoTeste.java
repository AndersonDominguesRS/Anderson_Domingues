package br.edu.ifnet.app.Testes;

import br.edu.ifnet.app.Dominio.Cliente;
import br.edu.ifnet.app.Dominio.Defeito;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

public class DefeitoTeste {
	
	public static void main(String[] args) {
		
		Defeito df1=new Defeito();
		
		Cliente c1= new Cliente("SHOPPING PIRACICABA", "teste", "Rua dos estados", "POA",  "RS","Brasil", "94828-000" );
		
		df1.setCliente(c1);		
	
		
		try {
			df1.regOcorrencia(df1.getCliente().getNomeCliente(), "AUTO ATENDIMENTO 2", "NÃO LIGA O MONITOR", "24/01/2023");
			df1.imprimir();
			
		} catch (RegistraOcorrenciaExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}		
		
		
	}

}
