package com.example.gdmc.transicion.personas;

public class Docente extends Persona {
    private Integer cantCursosQueDio;

    public Docente(Integer edad) {
        super(edad);
        cantCursosQueDio = 0;
    }

    

    public Docente(Integer edad, Integer cantCursosQueDio) {
        super(edad);
        this.cantCursosQueDio = cantCursosQueDio;
    }



    @Override
    public Integer inteligencia(){

        return super.inteligencia() + cantCursosQueDio * 2;
    }

    @Override
    public Boolean esDestacado(){

        return cantCursosQueDio > 3;
    }

}
