package com.senai.projeto_escola.domain.entity;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public class Aluno extends Usuario {

    private String turma;

    @ManyToOne
    private Curso curso;
}
