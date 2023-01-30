package br.edu.ifnet.app.Dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

public class Defeito extends Ocorrencia {
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:MM:SS");	
	private LocalDateTime dataAbertura;
	
	public Defeito(String identificacaoCliente, String observacoes) {
		super(identificacaoCliente, observacoes);
		
		dataAbertura =LocalDateTime.now();

	}
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

	public String getDescricaoDefeito() {
		return descricaoDefeito;
	}

		
	@Override
	public String regOcorrencia (String identificacaoEquipamento) throws RegistraOcorrenciaExceptions {
		
		if (identificacaoCliente==null || identificacaoEquipamento==null || observacoes==null ) {
			
			throw new RegistraOcorrenciaExceptions("Os campos nome do cliente, Identifica��o do equipamento e observa��es devem ser preenhidos");
		}
		
		
		this.identificacaoEquipamento=identificacaoEquipamento;
		
		Random rando=new Random();		
	
		System.out.println("Selecione um tipo de equipamento:");		
		opcoesEquipamentos();		
	
		numeroChamado=rando.nextInt(1000);	
		
		StringBuilder s1=new StringBuilder();
		s1.append(identificacaoCliente);
		s1.append(";");
		s1.append(tipoEquipamento);
		s1.append(";");
		s1.append(identificacaoEquipamento);
		s1.append(";");
		s1.append(observacoes);
		s1.append(";");
		s1.append(dataAbertura.format(formato));
		s1.append(";");
		s1.append(numeroChamado);
		
		return s1.toString();
		
	}
	
	@Override
	public String opcoesEquipamentos() throws RegistraOcorrenciaExceptions {
		
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
		
		if (opcao<0 || opcao>4) {
		
		throw new RegistraOcorrenciaExceptions("Tipo de equipamento informado inv�lido!");
	}
		
		return tipoEquipamento;
		
		
	}
	
	@Override
	public String toString() {
		
		return cliente + " ; " +  tipoEquipamento + " ; " + identificacaoEquipamento + ": " + descricaoDefeito +  " ; " + data + ";" + numeroChamado;
		
	}
	public void imprimir() {
		
				
		System.out.println("Nome do empreendimento: "+ getCliente().getNomeCliente());
		System.out.println("Tipo de equipamento: "+ tipoEquipamento);
		System.out.println("Identifica��o do equipamento: "+ identificacaoEquipamento);
		System.out.println("Descri��o do defeito: "+ observacoes);
		System.out.println("Data da abertura: "+ dataAbertura.format(formato));
		System.out.println("N�mero do chamado gerado: "+ numeroChamado);
			
	
	}
		
		

}
