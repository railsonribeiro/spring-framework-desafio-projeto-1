package com.railsonribeiro;

public enum ProgressoTipo {
    NAO_INICIADO("Não iniciado"),
    INICIADO("Iniciado"),
    CONCLUIDO_DENTRO_PRAZO("Concluido dentro do prazo"),
    CONCLUIDO_FORA_PRAZO("Conluido fora do prazo");

    private String progresso;
    
    ProgressoTipo(String progresso){
        this.progresso = progresso;
    }

    public String getProgresso() {
        return progresso;
    }
}
