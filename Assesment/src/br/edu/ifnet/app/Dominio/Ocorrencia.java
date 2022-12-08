package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;

public class Ocorrencia {
	
	private String cliente=null;
	private String tipoEquipamento=null;
	private String identificacaoEquipamento=null;
	private String data=null;
	private int opcao=0;
	
	
	public void regOcorrencia() {
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a identificação do cliente:");
		cliente=in.nextLine();
		
		System.out.println("Selecione um tipo de equipamento:");
		
		opcoesEquipamentos();
		
		System.out.println("Informe a identificação do equipamento:");
		identificacaoEquipamento=in.nextLine();
		
		System.out.println("Informe a data");
		data=in.nextLine();		
		

	}
	
	public void opcoesEquipamentos() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("(1) - " + Constante.te);
		System.out.println("(2) - " + Constante.ts);
		System.out.println("(3) - " + Constante.ca);
		System.out.println("(4) - " + Constante.pf);
		
		opcao=in.nextInt();
		
		if (opcao==1) {
			tipoEquipamento=Constante.te;
		}
		else if (opcao==2) {
			tipoEquipamento=Constante.ts;
			
		}
		else if (opcao==3) {
			tipoEquipamento=Constante.ca;
			
		}
		else if (opcao==4) {
			tipoEquipamento=Constante.pf;
			
		}
		else  {
			System.out.println("Opcao invalida!");
			
		}
		
		
	}
	
	@Override
	public String toString() {
		
		return cliente + " ; " +  tipoEquipamento + " ; " + identificacaoEquipamento + " ; " + data;
		
	}
	
	public void imprimir() {
		 
			System.out.println("Registro finalizado!");
			System.out.println("---------------------------------------------------------");
			System.out.println("Cliente: " + cliente);
			System.out.println("Tipo de equipamento: " + tipoEquipamento);
			System.out.println("Identificação do equipamento: " + identificacaoEquipamento);

	 }
	


}
