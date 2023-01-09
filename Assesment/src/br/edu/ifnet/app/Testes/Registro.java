package br.edu.ifnet.app.Testes;


import java.util.Scanner;
import br.edu.ifnet.app.Dominio.Cliente;
import br.edu.ifnet.app.Dominio.Defeito;
import br.edu.ifnet.app.Dominio.Solucao;

public class Registro {
	
	
	public static void main(String[] args) {
		
		MenuTestes menu=new MenuTestes();	
		Solucao solucao=new Solucao();
		Defeito defeito=new Defeito();
		Cliente c1=new Cliente();
		
		
		do {menu.opcoes();
		
		switch (menu.opcao) {
		case 1:	
			
			c1.ImportaCliente();			

			break;						
			
		case 2:
			
			c1.cadastroCliente();
			
			break;
			
		case 3:		

			defeito.regOcorrencia();
			
			break;
			
		case 4:		

			solucao.regOcorrencia();
			
			break;
			
		case 5:		

			c1.ImportaClienteAtivo();
			
			break;

		default:
			break;
		}
		
		}while (menu.opcao!=6);{
			System.out.println("Programa finalizado!");
		}	

	}
		
}

