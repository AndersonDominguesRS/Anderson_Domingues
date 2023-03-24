package br.edu.infinet.assesment.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.edu.infinet.assesment.model.auxiliar.Constante;
import br.edu.infinet.assesment.model.exceptions.HorariosInicioFimAtendimentoExceptions;
import br.edu.infinet.assesment.model.exceptions.RegistraOcorrenciaExceptions;

@Entity
@Table(name = "TSolucao")
public class Solucao extends Ocorrencia {

	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	private LocalDateTime dataFechamento;
	private String peca;
	String tipoAtendimentoRealizado = null;
	String horaRecebimento = null;
	String horaInicioAtendimento = null;
	String horaFimAtendimento = null;
	String tempoTotalAtendimento = null;
	int tempoRespostaAtendimento = 0;
	int tempoRespostaInicioAtendimento = 0;
	String statusSla = null;
	int numeroChamado = 0;


	public int getNumeroChamado() {
		return numeroChamado;
	}

	public LocalDateTime getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDateTime dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public void setNumeroChamado(int numeroChamado) {
		this.numeroChamado = numeroChamado;
	}

	public String getPeca() {
		return peca;
	}

	public void setPeca(String peca) {
		this.peca = peca;
	}

	public String getTipoAtendimentoRealizado() {
		return tipoAtendimentoRealizado;
	}

	public void setTipoAtendimentoRealizado(String tipoAtendimentoRealizado) {
		this.tipoAtendimentoRealizado = tipoAtendimentoRealizado;
	}

	public String getHoraRecebimento() {
		return horaRecebimento;
	}

	public void setHoraRecebimento(String horaRecebimento) {
		this.horaRecebimento = horaRecebimento;
	}

	public String getHoraInicioAtendimento() {
		return horaInicioAtendimento;
	}

	public void setHoraInicioAtendimento(String horaInicioAtendimento) {
		this.horaInicioAtendimento = horaInicioAtendimento;
	}

	public String getHoraFimAtendimento() {
		return horaFimAtendimento;
	}

	public void setHoraFimAtendimento(String horaFimAtendimento) {
		this.horaFimAtendimento = horaFimAtendimento;
	}

	public String getTempoTotalAtendimento() {
		return tempoTotalAtendimento;
	}

	public void setTempoTotalAtendimento(String tempoTotalAtendimento) {
		this.tempoTotalAtendimento = tempoTotalAtendimento;
	}

	public int getTempoRespostaAtendimento() {
		return tempoRespostaAtendimento;
	}

	public void setTempoRespostaAtendimento(int tempoRespostaAtendimento) {
		this.tempoRespostaAtendimento = tempoRespostaAtendimento;
	}

	public int getTempoRespostaInicioAtendimento() {
		return tempoRespostaInicioAtendimento;
	}

	public void setTempoRespostaInicioAtendimento(int tempoRespostaInicioAtendimento) {
		this.tempoRespostaInicioAtendimento = tempoRespostaInicioAtendimento;
	}

	public String getStatusSla() {
		return statusSla;
	}

	public void setStatusSla(String statusSla) {
		this.statusSla = statusSla;
	}

	public Solucao() {

	}

	public Solucao(String identificacaoCliente, String observacoes, String pecaInformada, String horaInicioAtendimento,
			String horaFinalAtendimento) {

		super(identificacaoCliente, observacoes);

		this.peca = pecaInformada;
		this.horaInicioAtendimento = horaInicioAtendimento;
		this.horaFimAtendimento = horaFinalAtendimento;
		dataFechamento = LocalDateTime.now();

	};

	// ***********REGISTRO ATENDIMENTO PREVENTIVO*************

	@Override
	public String regOcorrencia(String identificacaoEquipamento) throws RegistraOcorrenciaExceptions {

		String regIncidente = null;

		this.identificacaoEquipamento = identificacaoEquipamento;

		if (identificacaoCliente == null || identificacaoEquipamento == null || observacoes == null) {

			throw new RegistraOcorrenciaExceptions("Os campos nome do cliente e observações devem ser preenhidos");
		}

		if (data != null || horaRecebimento != null) {

			tipoAtendimentoRealizado = Constante.preventivo;

			try {
				regIncidente = regHorarioAtendimento(horaInicioAtendimento, horaFimAtendimento);
			} catch (HorariosInicioFimAtendimentoExceptions e) {
				System.out.println("[ERROR] " + e.getMessage());
			}

		}

		else if (horaRecebimento != null) {

			try {
				regIncidente = regHorarioAtendimento(horaFimAtendimento, horaRecebimento);

			} catch (HorariosInicioFimAtendimentoExceptions e) {
				System.out.println("[ERROR] " + e.getMessage());
			}

		}

		return regIncidente;

	}

	// *************FUNÇÃO OPÇÃO DE EQUIPAMENTOS PARA TESTE COM ITERAÇÃO NA ESCOLHA
	// **************

//	@Override
//	public String opcoesEquipamentos() {
//		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("(1) - " + Constante.te);
//		System.out.println("(2) - " + Constante.ts);
//		System.out.println("(3) - " + Constante.ca);
//		System.out.println("(4) - " + Constante.pf);
//		
//		opcao=in.nextInt();
//		
//		if (opcao==1) {
//			tipoEquipamento=Constante.te;
//		}
//		else if (opcao==2) {
//			tipoEquipamento=Constante.ts;
//			
//		}
//		else if (opcao==3) {
//			tipoEquipamento=Constante.ca;
//			
//		}
//		else if (opcao==4) {
//			tipoEquipamento=Constante.pf;
//			
//		}
//		else  {
//			System.out.println("Opcao invalida!");
//			
//		}
//		
//		
//		
//		return tipoEquipamento;
//		
//		
//	}

	public String regHorarioAtendimento(String horaInicioAtendimento, String horaFimAtendimento)
			throws HorariosInicioFimAtendimentoExceptions {

		int testeData1;
		int testeData2;
		int testeData3;
		dataFechamento = LocalDateTime.now();

		try {

			testeData1 = Integer.parseInt(
					ChronoUnit.MINUTES.between(LocalDateTime.parse(data), LocalDateTime.parse(horaRecebimento)) + "");
			testeData2 = Integer.parseInt(ChronoUnit.MINUTES.between(LocalDateTime.parse(horaRecebimento),
					LocalDateTime.parse(horaInicioAtendimento)) + "");
			testeData3 = Integer.parseInt(ChronoUnit.MINUTES.between(LocalDateTime.parse(horaInicioAtendimento),
					LocalDateTime.parse(horaFimAtendimento)) + "");

			if (testeData1 < 0 || testeData2 < 0 || testeData3 < 0) {

				throw new HorariosInicioFimAtendimentoExceptions("Horários inicio e fim inválidos");
			}

			tempoTotalAtendimento = ChronoUnit.MINUTES.between(LocalDateTime.parse(horaRecebimento),
					LocalDateTime.parse(horaFimAtendimento)) + "";
			statusSla = (Integer.parseInt(tempoTotalAtendimento) > 120 ? "VIOLADO" : "OK");

			data = LocalDateTime.parse(data).format(formato).toString();
			horaRecebimento = LocalDateTime.parse(horaRecebimento).format(formato).toString();
			horaInicioAtendimento = LocalDateTime.parse(horaInicioAtendimento).format(formato).toString();
			horaFimAtendimento = LocalDateTime.parse(horaFimAtendimento).format(formato).toString();

			StringBuilder s1 = new StringBuilder();
			s1.append(identificacaoCliente);
			s1.append(";");
			s1.append(identificacaoEquipamento);
			s1.append(";");
			s1.append(tipoAtendimentoRealizado);
			s1.append(";");
			s1.append(horaInicioAtendimento);
			s1.append(";");
			s1.append(horaFimAtendimento);
			s1.append(";");
			s1.append(tempoTotalAtendimento);
			s1.append(";");
			s1.append(data);

			return s1.toString();

		} catch (Exception e) {

			throw new HorariosInicioFimAtendimentoExceptions("Horários inicio e fim inválidos");
		}

	}

	public String regHorarioAtendimento(String data, String horaRecebimento, String horaInicioAtendimento,
			String horaFimAtendimento) throws HorariosInicioFimAtendimentoExceptions {

		int testeData1;
		int testeData2;
		int testeData3;
		dataFechamento = LocalDateTime.now();

		try {

			testeData1 = Integer.parseInt(
					ChronoUnit.MINUTES.between(LocalDateTime.parse(data), LocalDateTime.parse(horaRecebimento)) + "");
			testeData2 = Integer.parseInt(ChronoUnit.MINUTES.between(LocalDateTime.parse(horaRecebimento),
					LocalDateTime.parse(horaInicioAtendimento)) + "");
			testeData3 = Integer.parseInt(ChronoUnit.MINUTES.between(LocalDateTime.parse(horaInicioAtendimento),
					LocalDateTime.parse(horaFimAtendimento)) + "");

			if (getHoraInicioAtendimento() != null) {

				throw new HorariosInicioFimAtendimentoExceptions("Hotários inicio e fim inválidos");
			}

			if (testeData1 < 0 || testeData2 < 0 || testeData3 < 0) {

				throw new HorariosInicioFimAtendimentoExceptions("Horários inicio e fim inválidos");
			}

			StringBuilder s2 = new StringBuilder();
			s2.append(identificacaoCliente);
			s2.append(";");
			s2.append(tipoAtendimentoRealizado);
			s2.append(";");
			s2.append(tipoEquipamento);
			s2.append(";");
			s2.append(identificacaoEquipamento);
			s2.append(";");
			s2.append(";");
			s2.append(horaRecebimento);
			s2.append(";");
			s2.append(horaInicioAtendimento);
			s2.append(";");
			s2.append(horaFimAtendimento);
			s2.append(";");
			s2.append(tempoTotalAtendimento);
			s2.append(";");
			s2.append(tempoRespostaAtendimento);
			s2.append(";");
			s2.append(tempoRespostaInicioAtendimento);
			s2.append(";");
			s2.append(dataFechamento.format(formato));

			return s2.toString();

		} catch (Exception e) {

			throw new HorariosInicioFimAtendimentoExceptions("Horários inicio e fim inválidos");
		}

	}

	public void imprimirPreventivo() {

		System.out.println("Resumo do registro:");
		System.out.println("Identificação do cliente: " + identificacaoCliente);
		System.out.println("Tipo de atendimento realizado: " + tipoAtendimentoRealizado);
		System.out.println("Hora de inicio do atendimento: " + horaInicioAtendimento);
		System.out.println("Hora final do atendimento: " + horaFimAtendimento);
		System.out.println("Tempo total de atendimento: " + tempoTotalAtendimento);
		System.out.println("Data fechamento do chamado: " + dataFechamento.format(formato));

	}

	public void imprimirCorretivo() {

		System.out.println("Resumo do registro:");
		System.out.println("Identificação do cliente: " + identificacaoCliente);
		System.out.println("Tipo de atendimento realizado: " + tipoAtendimentoRealizado);
		System.out.println("Tipo de equipamento avaliado: " + tipoEquipamento);
		System.out.println("Identificação do equipamento: " + identificacaoEquipamento);
		System.out.println("Hora recebimento do chamado: " + horaRecebimento);
		System.out.println("Hora de inicio do atendimento: " + horaInicioAtendimento);
		System.out.println("Hora final do atendimento: " + horaFimAtendimento);
		System.out.println("Tempo total de atendimento: " + tempoTotalAtendimento);
		System.out.println("Tempo de resposta de recebimento do chamado: " + tempoRespostaAtendimento);
		System.out.println("Tempo total percorrido até o inicio do atendimento: " + tempoRespostaInicioAtendimento);
		System.out.println("Data fechamento do chamado " + dataFechamento.format(formato));

	}

	public void registraHorarioTeste() {

		tempoTotalAtendimento = ChronoUnit.MINUTES.between(LocalDateTime.parse(horaRecebimento),
				LocalDateTime.parse(horaFimAtendimento)) + "";

		statusSla = (Integer.parseInt(tempoTotalAtendimento) > 120 ? "VIOLADO" : "OK");

		data = LocalDateTime.parse(data).format(formato).toString();
		horaRecebimento = LocalDateTime.parse(horaRecebimento).format(formato).toString();
		horaInicioAtendimento = LocalDateTime.parse(horaInicioAtendimento).format(formato).toString();
		horaFimAtendimento = LocalDateTime.parse(horaFimAtendimento).format(formato).toString();

	}

}
