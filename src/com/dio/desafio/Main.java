package com.dio.desafio;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso("Curso java", "descricao curso java", 1);
        Mentoria mentoria = new Mentoria("Mentoria java", "descricao de mentoria java", LocalDate.now());

        Curso curso1 = new Curso("Curso java II", "descricao curso java II", 2);

        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(curso1);
    }
}
