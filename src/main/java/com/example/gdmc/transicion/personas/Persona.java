package com.example.gdmc.transicion.personas;

import com.example.gdmc.transicion.planetas.Planeta;

public class Persona {
    private Integer edad;

    public Persona(Integer edad) {
        this.edad = edad;
    }    

    public Integer inteligencia(){
        Integer valorIntelig = (edad >= 20 && edad <= 40) ? 12 : 8;

        return valorIntelig;
    }

    public Integer potencia(){
        return 20;
    }

    public Boolean esDestacado(){
        return edad.equals(25) || edad.equals(35);

    }

    public void darTributoAPlaneta(Planeta planeta) {}

}
