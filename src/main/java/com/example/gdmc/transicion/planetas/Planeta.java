package com.example.gdmc.transicion.planetas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.gdmc.transicion.personas.Persona;

public class Planeta {
    private Set<Persona> habitantes;
    private Integer cantMuseos;
    private Integer longitudMuralla;

    public Planeta(){
        habitantes = new HashSet<Persona>();
        cantMuseos = 0;
        longitudMuralla = 0;
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

    public void construirMuralla(){
        longitudMuralla += 1;
    }

    public void fundarMuseo(){
        cantMuseos += 1;
    }

    public Integer potenciaAparente(){
        return potenciaHabitanteConMayorPotencia() * habitantes.size();
    }

    private Integer potenciaHabitanteConMayorPotencia(){
        return habitantes.stream().mapToInt(Persona::potencia).max().orElse(0);
    }

    public Boolean necesitaReforzarse(){
        return potenciaAparente() >= potenciaReal() * 2;
    }

    public void recibirTributo(){
        habitantes.forEach(hab -> hab.darTributoAPlaneta(this));
    }

    public Integer getCantMuseos() {
        return cantMuseos;
    }

    public Integer getLongitudMuralla() {
        return longitudMuralla;
    }

    public List<Persona> habitantesValiosos(){
        return habitantes.stream().filter(hab -> hab.valor() >= 40).toList();
    }

    public void apaciguarPlaneta_(Planeta unPlaneta){
        this.habitantesValiosos().forEach(hab -> hab.darTributoAPlaneta(unPlaneta));
    }



}
