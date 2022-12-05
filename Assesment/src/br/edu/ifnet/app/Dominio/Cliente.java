package br.edu.ifnet.app.Dominio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
//					System.out.println("Leitura da linha " + " " + linha);
					
					testelista[0]=linha;				

					linha= leitura.readLine();	
	

					
				}
				
				leitura.close();
				file.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage() );
			}
			
		} finally {
			System.out.println("Processamento realizado com sucesso");
			System.out.println(Arrays.asList(testelista));
		}
	}
	
	//Método para cadastrar um novo cliente
	
	public void cadastroCliente() {
		
//		System.out.println("CADASTRO NOVO CLIENTE");
//		System.out.println("");
		
		nome="Anderson";
		cnpj="teste"; 
		endereco="teste"; 
		cidade="teste"; 
		estado="teste"; 
		pais="teste"; 
		cep="teste";
			
		
	}
	
	@Override
	public String toString() {
		
		return nome + " ; " + cep + "; " + pais;
	}
	
	

}
