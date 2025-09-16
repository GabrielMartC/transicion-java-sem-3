package com.example.gdmc.transicion.planetas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.gdmc.transicion.personas.Atleta;
import com.example.gdmc.transicion.personas.Docente;
import com.example.gdmc.transicion.personas.Persona;

public class PlanetaTest {
    Persona julieta = new Persona(42);
    Persona ana = new Atleta(25);
    Persona rosa = new Atleta(45, 8);
    Persona perla = new Atleta(28, 6, 4);
    Persona monica = new Docente(45, 6);
    Persona luisa = new Docente(35, 1);

    Planeta triton = new Planeta();

    @BeforeEach
    public void init(){
        triton.agregarHab(julieta);
        triton.agregarHab(ana);
        triton.agregarHab(rosa);
        triton.agregarHab(perla);
        triton.agregarHab(monica);
        triton.agregarHab(luisa);

    }

    // @Test
    // void delegacionDiplomaticaDeTritonEsAnaRosaMonica(){
    //     assertTrue(triton.delegacionDiplomatica().containsAll(List.of(ana,rosa,monica)));
    // }

    @Test
    void delegacionDiplomaticaDeTritonEsAnaRosaMonica(){
        assertEquals(new HashSet<>(List.of(ana, rosa, monica)),
            new HashSet<>(triton.delegacionDiplomatica()));
    }

    

    @Test 
    void valorInicialDefensaDeTritonEs2(){
        assertEquals(2, triton.valorDefensa());
    }

    @Test 
    void tritonNoEsUnPlanetaCulto(){
        assertFalse(triton.esCulto());
    }

    @Test 
    void potenciaRealDeTritonEs184(){
        assertEquals(184, triton.potenciaReal());
    }

    @Test 
    void potenciaAparenteDeTritonEs312(){
        assertEquals(312, triton.potenciaAparente());
    }

    @Test 
    void tritonNesecitaReforzarse(){
        assertFalse(triton.necesitaReforzarse());
    }

    @Test
    void tritonDespuesDeRecibirTributosLogitudDeMurallasEs6(){
        triton.recibirTributo();
        assertEquals(6, triton.getLongitudMuralla());
    }

    @Test
    void tritonDespuesDeRecibirTributosTiene2Museos(){
        triton.recibirTributo();
        assertEquals(2, triton.getCantMuseos());
    }

    @Test
    void habitantesValiososDeTritonSonAnaRosaPerlaMonica(){
        assertEquals(new HashSet<>(List.of(ana, rosa, perla, monica)),
            new HashSet<>(triton.habitantesValiosos()));
    }

}
