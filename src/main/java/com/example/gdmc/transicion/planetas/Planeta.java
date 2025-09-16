package com.example.gdmc.transicion.planetas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.gdmc.transicion.personas.Persona;

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

        // Integer total = 0;
        // for(Persona p : habitantes){
        //     total += p.potencia();
        // }

        // return total;
    }



}
