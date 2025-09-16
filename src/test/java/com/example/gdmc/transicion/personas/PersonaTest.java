package com.example.gdmc.transicion.personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class PersonaTest {
    Persona julieta = new Persona(42);
    Persona ana = new Atleta(25);
    Persona rosa = new Atleta(45, 8);
    Atleta perla = new Atleta(28, 6, 4);
    Persona monica = new Docente(45, 6);
    Persona luisa = new Docente(35, 1);


    // JULIETA
    @Test
    void JulietaPersonaTienePotencia20() {
        assertEquals(20, julieta.potencia());
    }

    @Test
    void JulietaPersonaTieneInteligencia8() {
        assertEquals(8, julieta.inteligencia());
    }

    @Test
    void JulietaPersonaNoEsDestacada() {
        assertFalse(julieta.esDestacado());
    }

    @Test 
    void JulietaPersonaConValor28() {
        assertEquals(28,julieta.valor());
    }

    // //ANA
    @Test
    void AnaAtletaTienePotencia28() {
        assertEquals(28, ana.potencia());

    }

    @Test
    void AnaAtletaTieneInteligencia12() {
        assertEquals(12, ana.inteligencia());

    }

    @Test
    void AnaAtletaEsDestacada() {
        assertTrue(ana.esDestacado());
    }

    //ROSA
    @Test
    void RosaAtletaTienePotencia52() {
        assertEquals(52, rosa.potencia());

    }

    @Test
    void RosaAtletaTieneInteligencia8() {
        assertEquals(8, rosa.inteligencia());

    }

    @Test
    void RosaAtletaEsDestacada() {
        assertTrue(rosa.esDestacado());

    }

    // //PERLA
    @Test
    void PerlaAtletaTienePotencia44() {
        assertEquals(44, perla.potencia());
    }

    @Test
    void PerlaAtletaTieneInteligencia12() {
        assertEquals(12, perla.inteligencia());
    }

    @Test
    void PerlaAtletaNoEsDestacada() {
        assertFalse(perla.esDestacado());
    }

    @Test 
    void PerlaAtletaConValor56() {
        assertEquals(56,perla.valor());
    }

    // //MONICA
    @Test
    void MonicaDocenteTienePotencia20() {
        assertEquals(20, monica.potencia());
    }

    @Test
    void MonicaDocenteTieneInteligencia20() {
        assertEquals(20, monica.inteligencia());
    }

    @Test
    void MonicaDocenteEsDestacada() {
        assertTrue(monica.esDestacado());
    }

    // //LUISA
    @Test
    void luisaDocenteTienePotencia20() {
        assertEquals(20, luisa.potencia());
    }

    @Test
    void luisaDocenteTieneInteligencia14() {
        assertEquals(14, luisa.inteligencia());

    }

    @Test
    void luisaDocenteNoEsDestacada() {
        assertFalse(luisa.esDestacado());
    }

    @Test 
    void luisaDocenteConValor39() {
        assertEquals(39,luisa.valor());
    }    


    //OTROS TEST

    @Test
    void perlaDespuesDeEntrenar15YAprender1TecnTienePotencia65() {
        perla.entrenar_Dias(15);    
        perla.aprenderTecnica();
        assertEquals(65, perla.potencia());

    }

    @Test
    void perlaDespuesDeEntrenar15YAprender1TecnNoEsDestacada() {
        perla.entrenar_Dias(15);    
        perla.aprenderTecnica();
        assertFalse(perla.esDestacado());

    }

    @Test
    void perlaAprender1TecnicaMasYEsDestacada() {
        perla.entrenar_Dias(15);    
        perla.aprenderTecnica();
        perla.aprenderTecnica();
        assertTrue(perla.esDestacado());

    }


}
