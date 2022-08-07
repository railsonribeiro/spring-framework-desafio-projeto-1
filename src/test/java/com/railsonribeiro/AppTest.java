package com.railsonribeiro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AppTest {
    @Test
    public void listarCalcularXpDev(){
   

        Mentoria mentoria = new Mentoria(
            "Titulo 1",
            "descricao xs",
            LocalDate.of(2022, 8,21)
        );

        Curso curso = new Curso(
            "Titulo xy",
            "descricao qualquer",
            70
        );

        Dev dev = new Dev();

        dev.progredir(curso);
        dev.progredir(mentoria);
        double expected = 20+10;

        assertTrue(expected == dev.calcularXPTotal());
  }

  @Test
  public void listarTODOSCursosDevTest(){

    Dev dev = new Dev();

    Mentoria mentoria = new Mentoria(
        "Titulo 1",
        "descricao xs",
        LocalDate.of(2022, 8,21)
    );

    Curso curso = new Curso(
        "Titulo xy",
        "descricao qualquer",
        70
    );

    curso.setProgresso(ProgressoTipo.INICIADO); 
   
    List<Curso> cursos = new ArrayList<>();
    // cursos.add((Curso) curso.progredir(dev));

    List<Mentoria> mentorias = new ArrayList<>();
    mentorias.add(mentoria);

    Bootcamp boot_camp = new Bootcamp(
            LocalDate.of(2022, 8, 1),
            LocalDate.of(2022, 8, 31),
            "João Nascimento","Curso x",
            mentorias,
            cursos
        );


    App app = new App();
    app.fazerInscricao(boot_camp, dev);

    String actual = dev.exibirTodosCursos();
    String expected = "{\ndescricao: " + "descricao qualquer" + 
                        ",\nprogresso: " + "Iniciado" + 
                        ",\ntitulo: " + "Titulo xy" + 
                        ",\ncargaHoraria: "+ "70.0"+ "\n}\n\n";
    assertEquals(expected, actual);

  }
}
