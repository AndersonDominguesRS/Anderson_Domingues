package br.edu.ifnet.app.Testes;

import br.edu.ifnet.app.Dominio.Cliente;
import br.edu.ifnet.app.Exceptions.CadastroClienteExceptions;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		
		Cliente c1= new Cliente("Anderson", "000010000", "Rua dos estados", "POA",  "RS","Brasil", "94828-000" );
		
		
		try {
			c1.setStatusEmpreemdimento("ATIVO");
			c1.cadastroCliente();
		} catch (CadastroClienteExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		c1.ImportaCliente();
		
		c1.ImportaClienteAtivo();
		
		
	}

}
