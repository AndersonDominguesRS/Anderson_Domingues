package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

public class Solucao extends Ocorrencia {
	
	private String peca=null;
	private String descricaoSolucao=null;
	
	public void regSolucao() {
		
		regOcorrencia();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a pe�a danificada:");
		peca=in.nextLine();
		System.out.println("Informe a descricao da solucao:");
		descricaoSolucao=in.nextLine();
		
		imprimir();
		System.out.println("Tipo de pe�a: " + peca);
		System.out.println("Descri��o da solu��o: " + descricaoSolucao);
		System.out.println("---------------------------------------------------------");
		
	}

}
