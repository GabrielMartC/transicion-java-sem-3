package com.example.gdmc.transicion.planetas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.gdmc.transicion.personas.Persona;

/*
De cada planeta se conocen los habitantes, que son personas. También la cantidad de museos que hay en el planeta.
Se tiene que poder obtener, para cada planeta

la delegación diplomática, que está formada por los habitantes destacados.

el valor inicial de defensa, que es la cantidad de habitantes que tienen, al menos, 30 unidades de potencia.

si es culto: la condición es que haya al menos dos museos, y que todos los habitantes tengan al menos 10 
unidades de inteligencia.

la potencia real: es la suma de la potencia de todos los habitantes.
 */

public class Planeta {
    private Set<Persona> habitantes;
    private Integer cantMuseos;

    public Planeta(){
        habitantes = new HashSet<Persona>();
        cantMuseos = 0;
    }

    public void agregarHab(Persona p){
        habitantes.add(p);
    }

    public List<Persona> delegacionDiplomatica(){
        return habitantes.stream().filter(pers -> pers.esDestacado()).toList();
    }

    public Integer valorDefensa(){
        return (int)(habitantes.stream().filter(pers -> pers.potencia() >= 30).count());
    }

    public Boolean esCulto(){
        return cantMuseos >= 2 && habitantes.stream().allMatch(pers -> pers.inteligencia() >= 10);
    }

    public Integer potenciaReal(){
        return habitantes.stream().mapToInt(Persona::potencia).sum();
    }


}
