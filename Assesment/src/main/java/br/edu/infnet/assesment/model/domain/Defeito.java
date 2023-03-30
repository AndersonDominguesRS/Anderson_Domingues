package br.edu.infnet.assesment.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.assesment.model.exceptions.RegistraOcorrenciaExceptions;


@Entity
@Table(name="TDefeito")
public class Defeito extends Ocorrencia {
	
	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
	
	int numeroChamado = 0;
	private LocalDateTime dataAbertura;
	private String contatoCliente;
	private String defeito;

	public Defeito() {

	}

	public Defeito(String identificacaoCliente, String observacoes) {
		super(identificacaoCliente, observacoes);

	}


	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getContatoCliente() {
		return contatoCliente;
	}

	public void setContatoCliente(String contatoCliente) {
		this.contatoCliente = contatoCliente;
	}

	public int getNumeroChamado() {
		return numeroChamado;
	}

	public void setNumeroChamado(int numeroChamado) {
		this.numeroChamado = numeroChamado;
	}

	@Override
	public String regOcorrencia(String identificacaoEquipamento) throws RegistraOcorrenciaExceptions {



		dataAbertura = LocalDateTime.now();

		if (identificacaoCliente == null || identificacaoEquipamento == null || observacoes == null) {

			throw new RegistraOcorrenciaExceptions(
					"Os campos nome do cliente, Identificação do equipamento e observações devem ser preenhidos");
		}

		Random rando = new Random();

		numeroChamado = rando.nextInt(1000);
		statusChamado = true;
		data = dataAbertura.format(formato);

		StringBuilder s1 = new StringBuilder();
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
		s1.append(";");
		s1.append(statusChamado == true ? "CHAMADO ABERTO" : " ERRO NA ABERTURA DO CHAMADO ");

		return s1.toString();

	}

	@Override
	public String toString() {

		return //cliente + " ; " + 
				tipoEquipamento + " ; " + identificacaoEquipamento + ": " + observacoes + " ; "
				+ data + ";" + numeroChamado;

	}

	public void imprimir() {

//		System.out.println("Nome do empreendimento: " + getCliente().getNomeCliente());
		System.out.println("Tipo de equipamento: " + tipoEquipamento);
		System.out.println("Identificação do equipamento: " + identificacaoEquipamento);
		System.out.println("Descrição do defeito: " + observacoes);
		System.out.println("Número do chamado gerado: " + numeroChamado);

	}

}
