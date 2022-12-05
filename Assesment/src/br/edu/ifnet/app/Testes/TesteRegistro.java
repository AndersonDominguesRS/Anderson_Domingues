package br.edu.ifnet.app.Testes;

import java.util.Arrays;

import br.edu.ifnet.app.Dominio.Cliente;
import br.edu.ifnet.app.Exceptions.ImportaCliente;

public class TesteRegistro {
	
	
	public static void main(String[] args) {	
		
		Cliente a1=new Cliente();
		
		a1.ImportaCliente();
		
		
		
		Cliente[] novocliente=new Cliente[4];
		
		novocliente[0]=a1;
		


	}
}
