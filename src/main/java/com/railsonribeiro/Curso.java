package com.railsonribeiro;



public class Curso extends AtividadeBootcamp {

    private double cargaHoriaria;
    
    public double getCargaHoriaria() {
        return cargaHoriaria;
    }

    public void setCargaHoriaria(double cargaHoriaria) {
        this.cargaHoriaria = cargaHoriaria;
    }

    public Curso(String titulo, String descricao, double cargaHoriaria) {
        super(titulo,descricao);
        this.cargaHoriaria = cargaHoriaria;
    }

    @Override
    public double calcularXP() {
        return 20;
    }

    @Override
    public String toString() {
        return "{\ndescricao: " + super.getDescricao() + ",\nprogresso: " + super.getProgresso() + ",\ntitulo: " + super.getTitulo() + ",\ncargaHoraria: "+ getCargaHoriaria() + "\n}\n\n";
    }    
    
}
