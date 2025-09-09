package com.senai.projeto_escola.interface_ui.controller;

import com.senai.projeto_escola.application.dto.CursoDTO;
import com.senai.projeto_escola.application.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoDTO> listarCursos() {
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public CursoDTO buscarCurso(@PathVariable String id) {
        return cursoService.buscarCursoPorId(id);
    }

    @PostMapping
    public CursoDTO salvarCurso(@RequestBody CursoDTO dto) {
        return cursoService.salvarCurso(dto);
    }

    @PutMapping("/{id}")
    public CursoDTO atualizarCurso(@PathVariable String id, @RequestBody CursoDTO dto) {
        return cursoService.atualizarCurso(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarCurso(@PathVariable String id) {
        cursoService.deletarCurso(id);
    }
}
