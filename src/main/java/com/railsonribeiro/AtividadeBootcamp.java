package com.railsonribeiro;

public abstract class AtividadeBootcamp {
    private String titulo;
    private String descricao;
    private ProgressoTipo progresso = ProgressoTipo.NAO_INICIADO;

    public AtividadeBootcamp(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public AtividadeBootcamp progredir(Dev dev){

        this.progresso = ProgressoTipo.CONCLUIDO_DENTRO_PRAZO;
        dev.xpTotal += this.calcularXP();
        return this;
    }

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProgressoTipo getProgresso() {
        return progresso;
    }

    public void setProgresso(ProgressoTipo progresso) {
        this.progresso = progresso;
    }

    

}
