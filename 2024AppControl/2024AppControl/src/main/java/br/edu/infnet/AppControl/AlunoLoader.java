package br.edu.infnet.AppControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppControl.model.clients.IEnderecoClient;
import br.edu.infnet.AppControl.model.domain.Aluno;
import br.edu.infnet.AppControl.model.domain.Disciplina;
import br.edu.infnet.AppControl.model.domain.Endereco;
import br.edu.infnet.AppControl.model.service.AlunoService;
import br.edu.infnet.AppControl.model.service.DisciplinaService;

@Component
public class AlunoLoader implements ApplicationRunner {
	
	@Autowired
	private IEnderecoClient enderesoClient;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderesoTeste=enderesoClient.endCep("94828220");
		
		AlunoService alunoService = new AlunoService();
		
		alunoService.incluir(new Aluno(1, "ANDERSON", "Graduado", 8, 9, true, enderesoTeste));
		alunoService.incluir(new Aluno(2, "CARLOS", "Indefinido", 8, 9, true, enderesoTeste));
		
		System.out.println(alunoService.obter("ANDERSON"));
		
		alunoService.obterLista();
		
		alunoService.excluir("ANDERSON");
		
	}

}
