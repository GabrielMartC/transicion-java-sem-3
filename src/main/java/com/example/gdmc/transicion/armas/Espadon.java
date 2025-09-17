package com.example.gdmc.transicion.armas;

import com.example.gdmc.transicion.personas.Soldado;

public class Espadon extends Arma{
    private Integer peso;


    public Espadon(Integer peso) {
        this.peso = peso;
    }



    @Override
    public Integer otorgarPotenciaASoldado(Soldado unSoldado) {
        return (unSoldado.getEdad() < 40) ? peso / 2 : 6;

    }

}
