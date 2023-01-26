package br.edu.ifnet.app.Dominio;

import java.util.Random;
import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

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
	public int getNumeroChamado() {
		return numeroChamado;
	}
	public void setNumeroChamado(int numeroChamado) {
		this.numeroChamado = numeroChamado;
	}
	public String getDescricaoDefeito() {
		return descricaoDefeito;
	}
	public void setDescricaoDefeito(String descricaoDefeito) {
		this.descricaoDefeito = descricaoDefeito;
	}
		
	@Override
	public void regOcorrencia (String nomeCliente, String identificacaoEquipamento, String descricao, String data) throws RegistraOcorrenciaExceptions {
		
		if (nomeCliente==null || identificacaoEquipamento==null || descricao==null || data==null) {
			
			throw new RegistraOcorrenciaExceptions("Os campos nome do cliente, Identificação do equipamento, descrição do defeito e data devem ser preenhidos");
		}
		
		this.identificacaoEquipamento=identificacaoEquipamento;
		this.descricaoDefeito=descricao;
		this.data=data;
		
		Random rando=new Random();		
	
		System.out.println("Selecione um tipo de equipamento:");		
		opcoesEquipamentos();		
	
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
		
		in.close();
		
		
	}
	
	@Override
	public String toString() {
		
		return cliente + " ; " +  tipoEquipamento + " ; " + identificacaoEquipamento + ": " + descricaoDefeito +  " ; " + data + ";" + numeroChamado;
		
	}
	public void imprimir() throws RegistraOcorrenciaExceptions {
		
		if (opcao<0 || opcao>4) {
			
			throw new RegistraOcorrenciaExceptions("Tipo de equipamento informado inválido!");
		}
		
		System.out.println("Nome do empreendimento: "+ getCliente().getNomeCliente());
		System.out.println("Tipo de equipamento: "+ tipoEquipamento);
		System.out.println("IdentificaÃ§Ã£o do equipamento: "+ identificacaoEquipamento);
		System.out.println("Descrição do defeito: "+ descricaoDefeito);
		System.out.println("Data: "+ data);
		System.out.println("Número do chamado gerado: "+ numeroChamado);
		
	}
		
		

}
