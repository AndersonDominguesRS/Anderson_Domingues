package br.edu.infnet.assesment.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.assesment.model.domain.Tecnico;
import br.edu.infnet.assesment.model.service.TecnicoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API Tecnicos)")
@CrossOrigin( origins = "*")
public class ApisTecnicos {
	
	@Autowired
	private TecnicoService tecnicoService;
	
	@GetMapping(value = "/tecnico")
	@ApiOperation(value = "Retorna lista de tecnicos cadastrados,")
	public List<Tecnico> tecino(){
		
		return (List<Tecnico>) tecnicoService.obterLista();
	}
	
	@PostMapping(value = "/tecnico")
	@ApiOperation(value = "Inclui um novo técnico,")
	public Tecnico incluiTecnico(@RequestBody Tecnico tecnico) {

		return tecnicoService.incluir(tecnico);
	}
	
	@DeleteMapping(value = "/tecnico")
	@ApiOperation(value = "Exclui um tecnico através do ID cadastrado")
	public void excluirTecnico(@RequestBody Tecnico tecnico) {

		tecnicoService.excluirTecnico(tecnico.getId());
	}
	
	@PutMapping(value = "/tecnico")
	@ApiOperation(value = "Atualiza um técnico cadastrado")
	public Tecnico atualizaTecnico(@RequestBody Tecnico tecnico) {

		return tecnicoService.incluir(tecnico);
	}
	
	
	
//	***********MÉTODOS DESABILITADOS**************
	
//	@GetMapping(value = "/tecnicoNome")
//	@ApiOperation(value = "Retorna Usuário por nome")
//	public List<Tecnico> buscaTecnico(@RequestParam String name) {
//
//		return tecnicoService.buscarPorNome(name);
//
//	}
	
//	@GetMapping(value = "/listaTecnicooUnico/{id}")
//	@ApiOperation(value = "Retorna Tecnico por ID")
//	public Tecnico listaTecnicoUnico(@PathVariable(value = "id") Integer id) {
//
//		return tecnicoService.obterListaId(id);
//
//	}
	
	

}
