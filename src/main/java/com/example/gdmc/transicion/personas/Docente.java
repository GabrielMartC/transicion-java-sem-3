package com.example.gdmc.transicion.personas;

import com.example.gdmc.transicion.planetas.Planeta;

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

    @Override
    public void darTributoAPlaneta(Planeta planeta) {
        planeta.fundarMuseo();
    }

    @Override
    public Integer valor(){
        return super.valor() + 5;
    }



}
