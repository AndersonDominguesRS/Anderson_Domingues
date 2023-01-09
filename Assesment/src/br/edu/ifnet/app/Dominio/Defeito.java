package br.edu.ifnet.app.Dominio;

import java.util.Random;
import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;

public class Defeito extends Ocorrencia {
	
	private int numeroChamado=0;
	private String descricaoDefeito=null;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	@Override
	public void regOcorrencia() {
		
		Random rando=new Random();		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a identificação do cliente:");
		cliente.setNome(in.nextLine());
		System.out.println("Selecione um tipo de equipamento:");		
		opcoesEquipamentos();		
		System.out.println("Informe a identificação do equipamento:");
		identificacaoEquipamento=in.nextLine();		
		System.out.println("Informe a descrição do defeito::");
		descricaoDefeito=in.nextLine();		
		System.out.println("Informe a data");
		data=in.nextLine();	
		numeroChamado=rando.nextInt(1000);
		
		
		
	}
	@Override
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
		
		return clienteTeste + " ; " +  tipoEquipamento + " ; " + identificacaoEquipamento + ": " + descricaoDefeito +  " ; " + data + ";" + numeroChamado;
		
	}
	@Override
	public void imprimir() {
		System.out.println(toString());
		
	}
		
		

}
