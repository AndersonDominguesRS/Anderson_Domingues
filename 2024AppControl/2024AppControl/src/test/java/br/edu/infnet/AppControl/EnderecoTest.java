package br.edu.infnet.AppControl;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import br.edu.infnet.AppControl.model.domain.Endereco;

@SpringBootTest
public class EnderecoTest {
	

	@Test
	void recuperaEndereco() {
				
		Endereco e1=new Endereco();
		e1.setCep("992308404");
		e1.setLogradouro("Rua 1");
		e1.setBairro("Bairro Do Café");
		e1.setComplemento("Rua Torta");
		e1.setLocalidade("Ribeirão");
		e1.setUf("RS");
		
		
		assertEquals("992308404", e1.getCep());
		assertEquals("Rua 1", e1.getLogradouro());
		assertEquals("Bairro Do Café", e1.getBairro());
		assertEquals("Rua Torta", e1.getComplemento());
		assertEquals("Ribeirão", e1.getLocalidade());
		assertEquals("RS", e1.getUf());
		
		
	}
}
