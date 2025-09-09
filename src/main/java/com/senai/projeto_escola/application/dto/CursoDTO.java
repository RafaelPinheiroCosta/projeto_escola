package com.senai.projeto_escola.application.dto;


import com.senai.projeto_escola.domain.entity.Curso;

public record CursoDTO(
        String id,
        String titulo,
        int cargaHoraria
) {
    public static CursoDTO fromEntity(Curso curso) {
        if (curso == null) return null;
        return new CursoDTO(
                curso.getId(),
                curso.getTitulo(),
                curso.getCargaHoraria()
        );
    }

    public Curso toEntity() {
        Curso c = new Curso();
        c.setTitulo(this.titulo);
        c.setCargaHoraria(this.cargaHoraria);
        return c;
    }
}
