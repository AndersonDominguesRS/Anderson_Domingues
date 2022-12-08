package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

public class Solucao extends Ocorrencia {
	
	private String peca=null;
	private String descricaoSolucao=null;
	
	public void regSolucao() {
		
		regOcorrencia();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a peça danificada:");
		peca=in.nextLine();
		System.out.println("Informe a descricao da solucao:");
		descricaoSolucao=in.nextLine();
		
		imprimir();
		System.out.println("Tipo de peça: " + peca);
		System.out.println("Descrição da solução: " + descricaoSolucao);
		System.out.println("---------------------------------------------------------");
		
	}

}
