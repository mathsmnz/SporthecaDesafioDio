package com.dio.desafio;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java dev 2k22");

        Curso curso = new Curso("Curso java", "descricao curso java", 1);
        Mentoria mentoria = new Mentoria("Mentoria java", "descricao de mentoria java", LocalDate.now());
        Curso curso1 = new Curso("Curso java II", "descricao curso java II", 2);

        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev mariaDev = new Dev("Maria");
        Dev marcosDev = new Dev("Marcos");

        marcosDev.increverBootcamp(bootcamp);
        mariaDev.increverBootcamp(bootcamp);

        bootcamp.getDevsIncritos().forEach(dev -> System.out.println(dev.getNome()));
        System.out.println();
        System.out.println(mariaDev.getConteudosIncritos());
        System.out.println(marcosDev.getConteudosIncritos());
        mariaDev.progredir();
        marcosDev.progredir();
        System.out.println(marcosDev.getConteudosConcluidos());
        System.out.println(mariaDev.getConteudosConcluidos());

    }
}
