package br.edu.ifnet.app.Dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import br.edu.ifnet.app.Auxiliar.Constante;


//Padrão do arquivo de importação = Nome; CNPJ; Rua+numero; Cidade; estado; pais;cep

public class Cliente {
	
	private String statusEmpreemdimento;
	private String nomeCliente;
	private String cnpj; 
	private String endereco;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;
	private String[] campos=null;
	private int qtdeCadastro=0;
	private int qtdeTotalCadastros=0;
	
	List<String> cadastros = new ArrayList<String>();
	
	
	public String getNome() {
		return nomeCliente;
	}
	
	public void setNome(String nome) {
		this.nomeCliente = nome;
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

	
	public void ImportaCliente() {
		
	
		try {
			
			try {

				
				FileReader file=new FileReader(Constante.dir+Constante.arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
							
				while (linha != null ) {
					
					campos = linha.split(";");	
					
					try {
						
						qtdeCadastro=Integer.valueOf(campos[1]);
						
					} catch (Exception e) {
						
						String leituraCadastro=(String.format(
								" Status do empreendimento: %s \n "
								+ "Nome do empreendimento: %s \n "
								+ "CNPJ	: %s \n "
								+ "Endereço: %s \n "
								+ "Cidade	: %s \n "
								+ "Estado	: %s \n "
								+ "Pais	: %s \n "
								+ "CEP	: %s \n "
								+ "_________________ \n "
								+ " ", campos[0], campos[1], campos[2], campos[3], campos[4], campos[5]
										, campos[6], campos[7]));
						
						cadastros.add(leituraCadastro);
						
						
						qtdeTotalCadastros++;				
						
						
					}
					
					linha= leitura.readLine();				
	
					
				}
				
				if (qtdeTotalCadastros==qtdeCadastro) {
					
					for (String cadastro: cadastros) {
						
						System.out.println(cadastro);
						}
					
				} else {
					
					System.out.println("Arquivo inválido");					

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
	
	
	public void cadastroCliente() {
		
	
		System.out.println("CADASTRO NOVO CLIENTE");
		System.out.println("");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente:");
		nomeCliente=in.nextLine();
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
				
				escrita.write(statusEmpreemdimento + ":" + nomeCliente + ":" + cnpj + ":" +endereco + ":" + cidade +":" + estado +";"+ pais + ":" + cep + "\r\n");
					
				escrita.close();
				fileW.close();
				in.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage());
			}
			
		} finally {
			System.out.println("Importação realizada com sucesso!");
			}
		
		System.out.println("Status do empreendimento: " + " " + statusEmpreemdimento);
		System.out.println("Nome do empreendimento: " + " " + nomeCliente);
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
		
		return nomeCliente + " ; " + cep + "; " + pais;
	}

	
	public void ImportaClienteAtivo() {
		
		
		try {
			
			try {

				
				FileReader file=new FileReader(Constante.dir+Constante.arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
							
				while (linha != null ) {
					
					campos = linha.split(";");
					
					switch (campos[0]) {
					case "ATIVO":
						
						statusEmpreemdimento=campos[0];
						nomeCliente=campos[1];
						cnpj=campos[2];
						endereco=campos[3];
						cidade=campos[4];
						estado=campos[5];
						pais=campos[6];
						cep=campos[7];
						
						System.out.println("Status do empreendimento: " + " " + statusEmpreemdimento);					
						System.out.println("Nome do empreendimento: " + " " + nomeCliente);
						System.out.println("CNPJ	: " + " " + cnpj);
						System.out.println("Endereço:" + " " + endereco);
						System.out.println("Cidade	: " + " " + cidade);
						System.out.println("Estado	: " + " " + estado);
						System.out.println("Pais	: " + " " + pais);
						System.out.println("CEP	: " + " " + cep);
						System.out.println("-----------------------------------");		
						
						break;

					default:
						break;
					}
					
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

}
