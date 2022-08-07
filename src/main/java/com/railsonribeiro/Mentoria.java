package com.railsonribeiro;

import java.time.LocalDate;



public class Mentoria extends AtividadeBootcamp {

    private LocalDate data_;

    public Mentoria(String titulo, String descricao, LocalDate data_) {
        super(titulo,descricao);
        this.data_ = data_;
    }

    @Override
    public double calcularXP() {
   
        return 10;
    }
    
}
