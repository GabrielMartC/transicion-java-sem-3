package com.example.gdmc.transicion.personas;

public abstract class Persona {
    private Integer edad;
    

    public Persona(Integer edad) {
        this.edad = edad;
    }    


    public Integer inteligencia(){
        Integer valorIntelig = 8;
        if(edad >= 20 && edad <= 40){
            valorIntelig = 12;
        }
        return valorIntelig;
    }

    public Integer potencia(){
        return 20;
    }

    public Boolean esDestacado(){
        return edad == 25 || edad == 35;
    }
}
