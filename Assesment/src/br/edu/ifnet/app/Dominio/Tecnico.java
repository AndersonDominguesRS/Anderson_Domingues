package br.edu.ifnet.app.Dominio;

import java.util.Random;
import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;
import br.edu.ifnet.app.Exceptions.CadastroTecnicoExceptions;

public class Tecnico {
	
	
	private String funcaoTecnico=null;
	private int codigoTecnico=0;
	private String nomeTecnico=null;
	private int opcao=0;
	
	public String getFuncaoTecnico() {
		return funcaoTecnico;
	}
	public void setFuncaoTecnico(String funcaoTecnico) {
		this.funcaoTecnico = funcaoTecnico;
	}
	public int getCodigoTecnico() {
		return codigoTecnico;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}
	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	public void cadastroTecnico(String nome) throws CadastroTecnicoExceptions {
		
		this.nomeTecnico=nome;
		
		System.out.println("Selecione a função do novo técnico:");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("(1) - " + Constante.residente);
		System.out.println("(2) - " + Constante.volante);
		
		opcao=in.nextInt();
		
		funcaoTecnico=(opcao == 1 ? Constante.residente : Constante.volante);
		
		in.close();
		
		Random randon=new Random();
		
		codigoTecnico=randon.nextInt(100);
		
		imprimir();
		
	}
	
	@Override
	public String toString() {
		
		return funcaoTecnico + ";" + codigoTecnico + ";" + nomeTecnico;
	}
	
	
	public void imprimir() throws CadastroTecnicoExceptions {
		
		if (nomeTecnico==null || opcao<1 || opcao >2) {
			
			throw new CadastroTecnicoExceptions("Necessário informr nome e função do técnico corretamente");
		}
		
		System.out.println("Novo cadastro realizado com sucesso:");
		System.out.println(" ");
		System.out.println("NOME DO NOVO TECNICO: " + nomeTecnico);
		System.out.println("FUNÇÃO DO TECNICO SELECIONADA: " + funcaoTecnico);
		System.out.println("CÓDIGO DE CADASTRO GERADO: "+ codigoTecnico);
	}

}
