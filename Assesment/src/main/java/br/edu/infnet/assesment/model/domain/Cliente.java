package br.edu.infnet.assesment.model.domain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.assesment.model.auxiliar.Constante;
import br.edu.infnet.assesment.model.exceptions.CadastroClienteExceptions;

@Entity
@Table(name = "TCliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String statusEmpreemdimento;
	private String nomeCliente;
	private String cnpj;;

	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@OneToMany
	@JoinColumn(name = "idCliente")
	private List<Ocorrencia> ocorrencias;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco enderecoApi;

//	private List<String> cadastros;

	public Cliente() {

	}

	public Cliente(String nomeCliente_, String cnpj, String endereco, String cidade, String estado, String pais,
			String cep) {

		this.nomeCliente = nomeCliente_;
		this.cnpj = cnpj;

	}
	
	

	public Endereco getEnderecoApi() {
		return enderecoApi;
	}

	public void setEnderecoApi(Endereco enderecoApi) {
		this.enderecoApi = enderecoApi;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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


//	public List<String> getCadastros() {
//		return cadastros;
//	}
//
//	public void setCadastros(List<String> cadastros) {
//		this.cadastros = cadastros;
//	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nomeCliente;
	}

	public void setNome(String nome) {
		this.nomeCliente = nome;
	}

	public String getCnpj() {
		return cnpj;
	}


//	public void ImportaCliente() {
//		
//	
//		try {
//			
//			try {
//
//				
//				FileReader file=new FileReader(Constante.dir+Constante.arq);
//				BufferedReader leitura = new BufferedReader(file);
//				
//				String linha = leitura.readLine();
//							
//				while (linha != null ) {
//					
//					campos = linha.split(";");	
//					
//					try {
//						
//						qtdeCadastro=Integer.valueOf(campos[1]);
//						
//					} catch (Exception e) {
//						
//						String leituraCadastro=(String.format(
//								" Status do empreendimento: %s \n "
//								+ "Nome do empreendimento: %s \n "
//								+ "CNPJ	: %s \n "
//								+ "Endereço: %s \n "
//								+ "Cidade	: %s \n "
//								+ "Estado	: %s \n "
//								+ "Pais	: %s \n "
//								+ "CEP	: %s \n "
//								+ "_________________ \n "
//								+ " ", campos[0], campos[1], campos[2], campos[3], campos[4], campos[5]
//										, campos[6], campos[7]));
//						
//						cadastros.add(leituraCadastro);						
//						qtdeTotalCadastros++;							
//						
//					}
//					
//					linha= leitura.readLine();					
//				}
//				
//				if (qtdeTotalCadastros==qtdeCadastro) {
//					
//					for (String cadastro: cadastros) {
//						
//						System.out.println(cadastro);
//						}
//					
//				} else {
//					
//					System.out.println("Arquivo inválido");					
//
//				}					
//						
//				
//				leitura.close();
//				file.close();
//				
//				
//			} catch (IOException e) {
//				
//				System.out.println("[ERROR] - " + e.getMessage() );
//			}
//			
//		} finally {
//			System.out.println("Importação realizada com sucesso!");
//			}
//	}

	public void cadastroCliente() throws CadastroClienteExceptions {

		if (nomeCliente == null || nomeCliente == null || cnpj == null) {

			throw new CadastroClienteExceptions("Todos os campos precisam ser preenchidos.");
		}

		try {

			try {

				FileWriter fileW = new FileWriter(Constante.dir + Constante.arqEscrita);
				BufferedWriter escrita = new BufferedWriter(fileW);

				escrita.write(statusEmpreemdimento + ":" + nomeCliente + ":" + cnpj +  "\r\n");

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
		System.out.println("-----------------------------------");

	}

	public void ImportaClienteAtivo() {
		
		String[] campos;

		try {

			try {

				FileReader file = new FileReader(Constante.dir + Constante.arq);
				BufferedReader leitura = new BufferedReader(file);

				String linha = leitura.readLine();

				while (linha != null) {

					campos = linha.split(";");

					switch (campos[0]) {
					case "ATIVO":

						statusEmpreemdimento = campos[0];
						nomeCliente = campos[1];
						cnpj = campos[2];

						System.out.println("Status do empreendimento: " + " " + statusEmpreemdimento);
						System.out.println("Nome do empreendimento: " + " " + nomeCliente);
						System.out.println("CNPJ	: " + " " + cnpj);
						System.out.println("-----------------------------------");

						break;

					default:
						break;
					}

					linha = leitura.readLine();

				}

				leitura.close();
				file.close();

			} catch (IOException e) {

				System.out.println("[ERROR] - " + e.getMessage());
			}

		} finally {
			System.out.println("Importação de clientes ativos realizada com sucesso!");
		}
	}

	@Override
	public String toString() {

		return statusEmpreemdimento + " ; " + nomeCliente + " ; " + cnpj;
	}

}
