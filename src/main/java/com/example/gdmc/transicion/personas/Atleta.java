package com.example.gdmc.transicion.personas;

public class Atleta extends Persona{
    private Integer masaMuscular;
    private Integer cantTecnicasConocidas;
    

    public Atleta(Integer edad) {
        super(edad);
        masaMuscular = 4;
        cantTecnicasConocidas = 2;
    }


    public Atleta(Integer edad, Integer cantTecnicasConocidas) {
        super(edad);
        this.cantTecnicasConocidas = cantTecnicasConocidas;
        masaMuscular = 4;
    }


    public Atleta(Integer edad, Integer masaMuscular, Integer cantTecnicasConocidas) {
        super(edad);
        this.masaMuscular = masaMuscular;
        this.cantTecnicasConocidas = cantTecnicasConocidas;
    }


    @Override
    public Integer potencia(){
        return super.potencia() + (masaMuscular * cantTecnicasConocidas);
    }

    @Override
    public Boolean esDestacado(){
        return super.esDestacado() || cantTecnicasConocidas > 5;
    }

    public void entrenar_Dias(Integer dias){
        masaMuscular += dias / 5;
    }

    public void aprenderTecnica(){
        cantTecnicasConocidas += 1;
    }

}
