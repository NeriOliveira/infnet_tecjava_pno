package br.dev.techstack.entities.produtos;

import br.dev.techstack.entities.enums.Marca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void adicionandoBebidaUmDeveFuncionar(){
        Bebida bebidaUmTeste = new Bebida("Teste1", 0, 2.99f, false, 50f, Marca.Coca_Cola);
        assertEquals("Teste1", bebidaUmTeste.getNome());
    }

    @Test
    void adicionandoBebidaDoisDeveFuncionar(){
        Bebida bebidaDoisTeste = new Bebida("Teste2", 0, 2.99f, false, 50f, Marca.Coca_Cola);
        assertEquals("Coca_Cola", bebidaDoisTeste.getMarca().toString());
    }

    @Test
    void adicionandoBebidaTresNaoDeveFuncionar(){
        Bebida bebidaTresTeste = new Bebida("Teste3", 0, 2.99f, false, 50f, Marca.Coca_Cola);
        assertEquals(9991, bebidaTresTeste.getCodigo());
    }
}