package br.dev.techstack.entities.produtos;

import br.dev.techstack.entities.enums.Informacao;
import br.dev.techstack.entities.enums.Ingrediente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SobremesaTest {

    @Test
    void adicionandoSobremesaUmDeveFuncionar(){
        Sobremesa sobremesaUmTeste = new Sobremesa("Teste 1", 1, 13.99f, 300f, false, Informacao.Frutas_Citricas);
        assertEquals("Frutas_Citricas", sobremesaUmTeste.getInformacao().toString());
    }

    @Test
    void adicionandoSobremesaDoisNaoDeveFuncionar(){
        Sobremesa sobremesaDoisTeste = new Sobremesa("Teste 2", 1, 13.99f, 300f, false, Informacao.Frutas_Citricas);
        assertEquals(9991, sobremesaDoisTeste.getCodigo());
    }

    @Test
    void adicionandoSobremesaTresDeveFuncionar(){
        Sobremesa sobremesaTresTeste = new Sobremesa("Teste 3", 1, 13.99f, 300f, false, Informacao.Frutas_Citricas);
        assertEquals("Teste 3", sobremesaTresTeste.getNome());
    }
}