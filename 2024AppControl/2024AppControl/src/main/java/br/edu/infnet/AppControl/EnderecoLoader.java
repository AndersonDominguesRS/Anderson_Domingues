package br.edu.infnet.AppControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppControl.model.clients.IEnderecoClient;
import br.edu.infnet.AppControl.model.domain.Disciplina;
import br.edu.infnet.AppControl.model.domain.Endereco;
import br.edu.infnet.AppControl.model.service.DisciplinaService;
import br.edu.infnet.AppControl.model.service.EnderecoService;

@Component
public class EnderecoLoader implements ApplicationRunner {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	@Autowired
	private EnderecoService enderecoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderecoNovo= enderecoClient.endCep("22241900");
		
		System.out.println("Testando o Endreco Loader --- " + enderecoNovo.getBairro());
		
		Endereco e1=new Endereco();
		e1.setCep("992308404");
		e1.setLogradouro("logradouro");
		e1.setBairro("Bairro");
		
		System.out.println(e1);
		
		Endereco e2=new Endereco("992308404");
		e2.setCep("992308404");
		e2.setLocalidade("Logradouro");
		e2.setBairro("Bairro");
		
		System.out.println(e2);
		
		
		enderecoService.endCep("94828220");

		
	}

}
