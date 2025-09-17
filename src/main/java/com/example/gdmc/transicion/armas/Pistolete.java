package com.example.gdmc.transicion.armas;

import com.example.gdmc.transicion.personas.Soldado;

public class Pistolete extends Arma{
    private Integer largo;


    public Pistolete(Integer largo) {
        this.largo = largo;
    }

    @Override
    public Integer otorgarPotenciaASoldado(Soldado unSoldado) {
        return (unSoldado.getEdad() > 30) ? largo * 3 : largo * 2;
    }

}
