package br.edu.ifnet.app.Testes;

import java.awt.Menu;
import java.util.Arrays;
import java.util.Scanner;
import br.edu.ifnet.app.Dominio.Cliente;
import br.edu.ifnet.app.Dominio.Defeito;
import br.edu.ifnet.app.Dominio.Ocorrencia;
import br.edu.ifnet.app.Dominio.Solucao;
import br.edu.ifnet.app.Exceptions.ImportaCliente;

public class TestePrograma {
	
	
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

			defeito.regDefeito();
			
			break;
			
		case 4:		

			solucao.regSolucao();
			
			break;

		default:
			break;
		}
		
		}while (menu.opcao!=5);{
			System.out.println("Programa finalizado!");
		}	

	}
}
