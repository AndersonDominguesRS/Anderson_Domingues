package br.edu.infnet.AppControl;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppControl.model.domain.Disciplina;
import br.edu.infnet.AppControl.model.service.DisciplinaService;

@Component
public class DisciplinaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		DisciplinaService disciplinaService = new DisciplinaService();
		
		disciplinaService.incluir(new Disciplina ("Matematica"));
		disciplinaService.incluir(new Disciplina ("Geografia"));
		
		disciplinaService.obter("Matematica");
		
		disciplinaService.obterLista();
		
		disciplinaService.excluir("Matematica");
		
		
		
	}

}
