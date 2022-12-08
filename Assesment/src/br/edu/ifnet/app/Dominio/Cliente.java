package br.edu.ifnet.app.Dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import br.edu.ifnet.app.Auxiliar.Constante;





//Padrão do arquivo de importação = Nome; CNPJ; Rua+numero; Cidade; estado; pais;cep

public class Cliente {
	
	private String nome;
	private String cnpj; 
	private String endereco;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;
	private String[] campos=null;
	private String[] testelista=null;
	
	
	//Métodos get / set
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getPais() {
		return pais;
	}

	public String getCep() {
		return cep;
	}

	
	//Chamando método de importação
	
	public void ImportaCliente() {
		
		testelista=new String[9];
		
		try {
			
			try {

				
				FileReader file=new FileReader(Constante.dir+Constante.arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();


							
				while (linha != null) {
					
					campos = linha.split(";");
					nome=campos[0];
					cnpj=campos[1];
					endereco=campos[2];
					cidade=campos[3];
					estado=campos[4];
					pais=campos[5];
					cep=campos[6];
					
					System.out.println("Nome do empreendimento: " + " " + nome);
					System.out.println("CNPJ	: " + " " + cnpj);
					System.out.println("Endereço:" + " " + endereco);
					System.out.println("Cidade	: " + " " + cidade);
					System.out.println("Estado	: " + " " + estado);
					System.out.println("Pais	: " + " " + pais);
					System.out.println("CEP	: " + " " + cep);
					System.out.println("-----------------------------------");
					

					linha= leitura.readLine();	
					
				}
				
				leitura.close();
				file.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage() );
			}
			
		} finally {
			System.out.println("Importação realizada com sucesso!");
			}
	}
	
	//Método para cadastrar um novo cliente
	
	public void cadastroCliente() {
		
	
		System.out.println("CADASTRO NOVO CLIENTE");
		System.out.println("");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente:");
		nome=in.nextLine();
		System.out.println("Digite o CNPJ do cliente:");
		cnpj=in.nextLine();
		System.out.println("Digite o nome da rua e o número do cliente:");
		endereco=in.nextLine();
		System.out.println("Digite a cidade do cliente:");
		cidade=in.nextLine();
		System.out.println("Digite o estado do cliente:");
		estado=in.nextLine();
		System.out.println("Digite o pais do cliente:");
		pais=in.nextLine();
		System.out.println("Digite o CEP do cliente:");
		cep=in.nextLine();
		
		try {
			
			try {

				
				FileWriter fileW=new FileWriter(Constante.dir+Constante.arqEscrita);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				escrita.write(nome + ":" + cnpj + ":" +endereco + ":" + cidade +":" + estado +";"+ pais + ":" + cep + "\r\n");
					
				escrita.close();
				fileW.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage());
			}
			
		} finally {
			System.out.println("Importação realizada com sucesso!");
			}
		
		System.out.println("Nome do empreendimento: " + " " + nome);
		System.out.println("CNPJ	: " + " " + cnpj);
		System.out.println("Endereço:" + " " + endereco);
		System.out.println("Cidade	: " + " " + cidade);
		System.out.println("Estado	: " + " " + estado);
		System.out.println("Pais	: " + " " + pais);
		System.out.println("CEP	: " + " " + cep);
		System.out.println("-----------------------------------");
		System.out.println("Cliente cadastrado com sucesso!");
		
		
			
		
	}
	
	@Override
	public String toString() {
		
		return nome + " ; " + cep + "; " + pais;
	}
	
	

}
