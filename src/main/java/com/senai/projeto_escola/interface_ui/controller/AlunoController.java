package com.senai.projeto_escola.interface_ui.controller;


import com.senai.projeto_escola.application.service.AlunoService;
import com.senai.projeto_escola.domain.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @GetMapping("{id}")
    public Aluno buscarAluno(@PathVariable String id){
        return alunoService.buscarAlunoPorId(id);
    }

    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno){
        return alunoService.salvarAluno(aluno);
    }

    @PutMapping("{id}")
    public Aluno editarAluno(@PathVariable String id ,@RequestBody Aluno aluno){
        return alunoService.atualizarAluno(id,aluno);
    }

    @DeleteMapping("{id}")
    public void deletarAluno(@PathVariable String id){
        alunoService.deletarAluno(id);
    }
}
