package com.example.gdmc.transicion.personas;

import java.util.ArrayList;
import java.util.List;

import com.example.gdmc.transicion.armas.Arma;
import com.example.gdmc.transicion.planetas.Planeta;

public class Soldado extends Persona{
    private List<Arma> armas;

    public Soldado(Integer edad) {
        super(edad);
        armas = new ArrayList<Arma>();
    }

    @Override
    public Integer potencia(){
        return super.potencia() + super.inteligencia() + armas.stream().mapToInt(arma -> arma.otorgarPotenciaASoldado(this)).sum();
    }

    @Override
    public void darTributoAPlaneta(Planeta planeta) {
        planeta.construir_KmDeMuralla(5);
    }

    public void agregarArma(Arma unArma){
        armas.add(unArma);
    }


}
