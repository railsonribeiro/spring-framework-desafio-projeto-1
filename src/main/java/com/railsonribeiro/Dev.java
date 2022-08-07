package com.railsonribeiro;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Bootcamp> bootCamps = new ArrayList<>();

    double xpTotal = 0;
    
    public void fazerinscricao(Bootcamp boot_camp, Dev dev){
        this.bootCamps.add(boot_camp);
        boot_camp.adicionarDev(dev);
        
        for(Curso curso:boot_camp.cursos){
            this.cursos.add(curso);
        }
        
        

    }

    public void progredir(AtividadeBootcamp atividade){
        atividade.progredir(this);
    }

    public double calcularXPTotal(){
        return this.xpTotal;
        
    }

    public String exibirTodosCursos(){
        String result = "";
        for(Curso curso:cursos){
            result += curso.toString();
            
        }
        return result;
    }

    public String exibirCursosConcluidos(){
        String result = "";
        for(Curso curso:cursos){
             if(curso.getProgresso() == ProgressoTipo.CONCLUIDO_DENTRO_PRAZO || 
            curso.getProgresso() == ProgressoTipo.CONCLUIDO_FORA_PRAZO){
                result += curso.toString();
            }
        }
        return result;
    }
}
