package com.example.gdmc.transicion.personas;

public class Docente extends Persona {
    private Integer cantCursosQueDio;

    public Docente(Integer edad) {
        super(edad);
        cantCursosQueDio = 0;
    }

    @Override
    public Integer inteligencia(){

        return super.inteligencia() + cantCursosQueDio * 2;
    }

    @Override
    public Boolean esDestacado(){

        return cantCursosQueDio > 3;
    }

    /*
     * 
     * De cada docente se conoce la cantidad de cursos que dio, que arranca en 0.
La inteligencia de un docente es la suma del valor común para todas las personas, con el doble de la 
cantidad de cursos que dio.

Un docente es destacado si dio más de 3 cursos.

¡Atención! la condición general para considerar a una persona como destacada no corre para los docentes, o sea,
 un docente que haya dado 3 o menos cursos nunca es destacado, aunque tenga p.ej. 25 años.

    */
}
