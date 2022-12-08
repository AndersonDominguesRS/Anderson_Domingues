package br.edu.ifnet.app.Dominio;

import java.util.Random;
import java.util.Scanner;

public class Defeito extends Ocorrencia {
	
	private int numeroChamado=0;
	private String descricaoDefeito=null;
	
	public void regDefeito() {
		
		Random rando=new Random();		
		regOcorrencia();
		
		Scanner in = new Scanner(System.in);		
		System.out.println("Informe a descrição do defeito::");
		descricaoDefeito=in.nextLine();
		numeroChamado=rando.nextInt(1000);	
		
		imprimir();		

		System.out.println("Descrição do defeito: " + descricaoDefeito);
		System.out.println("Número do chamado: " + numeroChamado);
		System.out.println("---------------------------------------------------------");
		
	}		
		

}
