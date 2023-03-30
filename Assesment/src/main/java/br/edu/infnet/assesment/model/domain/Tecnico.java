package br.edu.infnet.assesment.model.domain;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.edu.infnet.assesment.model.auxiliar.Constante;
import br.edu.infnet.assesment.model.exceptions.CadastroTecnicoExceptions;

@Entity
@Table(name = "TTecnico")
public class Tecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String funcaoTecnico = null;
	private int codigoTecnico = 0;
	private String nomeTecnico = null;
	private int opcao = 0;

	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Ocorrencia> ocorrencias;

	public Tecnico() {

	}



	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}



	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public void setCodigoTecnico(int codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}

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

		this.nomeTecnico = nome;

		System.out.println("Selecione a função do novo técnico:");

		Scanner in = new Scanner(System.in);

		System.out.println("(1) - " + Constante.residente);
		System.out.println("(2) - " + Constante.volante);

		opcao = in.nextInt();

		funcaoTecnico = (opcao == 1 ? Constante.residente : Constante.volante);

		in.close();

		Random randon = new Random();

		codigoTecnico = randon.nextInt(100);

		imprimir();

	}

	@Override
	public String toString() {

		return funcaoTecnico + ";" + codigoTecnico + ";" + nomeTecnico;
	}

	public void imprimir() throws CadastroTecnicoExceptions {

		if (nomeTecnico == null || opcao < 1 || opcao > 2) {

			throw new CadastroTecnicoExceptions("Necessário informr nome e função do técnico corretamente");
		}

		System.out.println("Novo cadastro realizado com sucesso:");
		System.out.println(" ");
		System.out.println("NOME DO NOVO TECNICO: " + nomeTecnico);
		System.out.println("FUNÇÃO DO TECNICO SELECIONADA: " + funcaoTecnico);
		System.out.println("CÓDIGO DE CADASTRO GERADO: " + codigoTecnico);
	}

}
