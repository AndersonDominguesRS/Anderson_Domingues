package br.edu.ifnet.app.Testes;

import java.util.Scanner;

import br.edu.ifnet.app.Dominio.Tecnico;

public class TesteNovoTecnico {
	
	public static void main(String[] args) {
		
		
		String nome=null;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite o nome do novo técnico: ");
		nome=in.nextLine();		
		Tecnico nt= new Tecnico(nome);
		System.out.println("Digite a função do técnico: ");
		nt.setFuncaoTecnico(in.nextLine());
		System.out.println("Digite o código do técnico");
		nt.setCodigoTecnico(in.nextLine());
		
		System.out.println(nt);
				

		
	}

}
