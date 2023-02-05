package br.edu.infinet.assesment.model.tests;

import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.exceptions.CadastroClienteExceptions;

public class ClienteTest {
	
	public static void main(String[] args) {
		
		
		Cliente c1= new Cliente("Anderson", "000010000", "Rua dos estados", "POA",  "RS","Brasil", "94828-000" );
		
		
		try {
			c1.setStatusEmpreemdimento("ATIVO");
			c1.cadastroCliente();
		} catch (CadastroClienteExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		Cliente c2= new Cliente(null, "000010000", "Rua dos estados", "POA",  "RS","Brasil", "94828-000" );
		
		
		try {
			c2.setStatusEmpreemdimento("ATIVO");
			c2.cadastroCliente();
		} catch (CadastroClienteExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		Cliente c3= new Cliente("Anderson", null, "Rua dos estados", "POA",  "RS","Brasil", "94828-000" );
		
		
		try {
			c3.setStatusEmpreemdimento("ATIVO");
			c3.cadastroCliente();
		} catch (CadastroClienteExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		
		c1.ImportaCliente();
		
		c1.ImportaClienteAtivo();
		
		
	}

}
