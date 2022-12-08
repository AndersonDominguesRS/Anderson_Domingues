package br.edu.ifnet.app.Testes;

import java.util.Scanner;

public class MenuTestes {
	
	public int opcao=0;
	
	public void opcoes(){	
		
		System.out.println("Opcoes de testes:");
		System.out.println("[1] Importar cadastros");
		System.out.println("[2] Cadastrar novo cliente");
		System.out.println("[3] Registrar defeito");
		System.out.println("[4] Registrar solucao");
		System.out.println("[5] Sair.");
		
		Scanner in=new Scanner(System.in);	
		
		System.out.print("Informe a opcao desejada: ");
		opcao=in.nextInt();
		
	}

}


