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
import br.edu.ifnet.app.Exceptions.CadastroClienteExceptions;
import br.edu.ifnet.app.Exceptions.ImportaClienteExceptions;


//PadrÃ£o do arquivo de importaÃ§Ã£o = Nome; CNPJ; Rua+numero; Cidade; estado; pais;cep

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
	
	public Cliente (String nomeCliente_, String cnpj, String endereco, String cidade, String estado, String pais, String cep) {
		
		this.nomeCliente=nomeCliente_;
		this.cnpj=cnpj;
		this.endereco=endereco;
		this.cidade=cidade;
		this.estado=estado;
		this.pais=pais;
		this.cep=cep;
	}
	
	public String getStatusEmpreemdimento() {
		return statusEmpreemdimento;
	}

	public void setStatusEmpreemdimento(String statusEmpreemdimento) {
		this.statusEmpreemdimento = statusEmpreemdimento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String[] getCampos() {
		return campos;
	}

	public void setCampos(String[] campos) {
		this.campos = campos;
	}

	public int getQtdeCadastro() {
		return qtdeCadastro;
	}

	public void setQtdeCadastro(int qtdeCadastro) {
		this.qtdeCadastro = qtdeCadastro;
	}

	public int getQtdeTotalCadastros() {
		return qtdeTotalCadastros;
	}

	public void setQtdeTotalCadastros(int qtdeTotalCadastros) {
		this.qtdeTotalCadastros = qtdeTotalCadastros;
	}

	public List<String> getCadastros() {
		return cadastros;
	}

	public void setCadastros(List<String> cadastros) {
		this.cadastros = cadastros;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}



	
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
	
	
	public void cadastroCliente() throws CadastroClienteExceptions {
		
		if (nomeCliente==null || nomeCliente==null || cnpj==null || endereco==null || cidade==null || estado==null || pais==null || cep==null ) {
					
			throw new CadastroClienteExceptions("Todos os campos precisam ser preenchidos.");
		}
		
		
		try {
			
			try {

				
				FileWriter fileW=new FileWriter(Constante.dir+Constante.arqEscrita);
				BufferedWriter escrita = new BufferedWriter(fileW);				
				
				escrita.write(statusEmpreemdimento + ":" + nomeCliente + ":" + cnpj + ":" +endereco + ":" + cidade +":" + estado +";"+ pais + ":" + cep + "\r\n");
						
				escrita.close();
				fileW.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage());
			}
			
		} finally {
			System.out.println("Cliente cadastrado com sucesso!");
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
			System.out.println("Importação de clientes ativos realizada com sucesso!");
			}		
	}	
	
	
	@Override
	public String toString() {
		
		return statusEmpreemdimento + " ; " + nomeCliente + " ; " + cnpj + " ; " + endereco + " ; " + cidade + " ; " +
				 estado + " ; " + pais + " ; " + cep + "; " + pais  ;
	}
	


}
