package com.dio.desafio;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(1);

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descricao de mentoria java");
        mentoria.setData(LocalDate.now());

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java II");
        curso1.setDescricao("descricao curso java II");
        curso1.setCargaHoraria(1);

        System.out.println(curso.toString());
        System.out.println(mentoria.toString());
        System.out.println(curso1.toString());
    }
}
