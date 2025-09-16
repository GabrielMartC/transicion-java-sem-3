package com.example.gdmc.transicion.personas;

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

}
