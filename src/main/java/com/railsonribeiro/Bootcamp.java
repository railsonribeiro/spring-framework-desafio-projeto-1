package com.railsonribeiro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nome;
    private String descricao;

    List<Mentoria> mentorias = new ArrayList<Mentoria>();
    List<Curso> cursos = new ArrayList<Curso>();

    List<Dev> devs = new ArrayList<Dev>();

    public Bootcamp(LocalDate dataInicial, LocalDate dataFinal, String nome, String descricao, List<Mentoria> mentorias,
            List<Curso> cursos) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nome = nome;
        this.descricao = descricao;
        this.mentorias = mentorias;
        this.cursos = cursos;
    }

   
    
    public void adicionarDev(Dev dev){
        devs.add(dev);
    }
}
