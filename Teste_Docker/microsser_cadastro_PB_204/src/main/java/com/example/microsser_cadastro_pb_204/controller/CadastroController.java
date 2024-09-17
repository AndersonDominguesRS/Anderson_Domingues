package com.example.microsser_cadastro_pb_204.controller;

import com.example.microsser_cadastro_pb_204.model.Cadastro;
import com.example.microsser_cadastro_pb_204.service.CadastroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class CadastroController {

    private final CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }


    @Operation (summary = "LISTA DE CADASTROS")
    @GetMapping("/")
    public List<Cadastro> getCadastro(){

        return cadastroService.listaCadastro();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CADASTRO REALIZADO COM SUCESSO"),
            @ApiResponse(responseCode = "500", description = "CADASTRO NÃO REALIZADO, ALUNO JÁ CADASTRO NESSA DISCIPLINA, ALUNO INEXISTENTE OU DISCIPLINA INEXISTENTE")})
    @Operation (summary = "CADASTRO DE ALUNO EM UMA DISCIPLINA")
    @GetMapping("/cadastro/{aluno_id}/{disciplina_id}")
    public Cadastro getAlunoEscola(@PathVariable Integer aluno_id, @PathVariable Integer disciplina_id){
        return cadastroService.novaMatricula(aluno_id, disciplina_id);
    }

}
