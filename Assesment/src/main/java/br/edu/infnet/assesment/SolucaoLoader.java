package br.edu.infnet.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.assesment.model.domain.Solucao;
import br.edu.infnet.assesment.model.service.SolucaoService;


@Component
public class SolucaoLoader implements ApplicationRunner {
	
	@Autowired
	private SolucaoService solucaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			
			String arq="ListaAtendimentos.txt";
			
			try {

				
				FileReader file=new FileReader(arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				String[] campos=null;
							
				while (linha != null ) {
					
					campos = linha.split(";");	
					
					Solucao solucao= new Solucao();
					
					solucao.setIdentificacaoCliente(campos[0]);
					solucao.setObservacoes(campos[1]);
					solucao.setTipoEquipamento(campos[2]);
					solucao.setIdentificacaoEquipamento(campos[3]);
					solucao.setData(campos[4]);
					solucao.setHoraRecebimento(campos[5]);
					solucao.setHoraInicioAtendimento(campos[6]);
					solucao.setHoraFimAtendimento(campos[7]);
					
					solucaoService.incluir(solucao);
										
					
					linha = leitura.readLine();
			
				}
						
				
				leitura.close();
				file.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage() );
			}
			
		} finally {
			System.out.println("Importação de Atendimentos realizada com sucesso!");
			}
						
	}

}
