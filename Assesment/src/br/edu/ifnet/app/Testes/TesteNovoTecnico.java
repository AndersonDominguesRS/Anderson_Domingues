package br.edu.ifnet.app.Testes;

import java.util.Scanner;

import br.edu.ifnet.app.Dominio.Tecnico;

public class TesteNovoTecnico {
	
	public static void main(String[] args) {
		
		
		String nome=null;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite o nome do novo t�cnico: ");
		nome=in.nextLine();		
		Tecnico nt= new Tecnico(nome);
		System.out.println("Digite a fun��o do t�cnico: ");
		nt.setFuncaoTecnico(in.nextLine());
		System.out.println("Digite o c�digo do t�cnico");
		nt.setCodigoTecnico(in.nextLine());
		
		System.out.println(nt);
				

		
	}

}
