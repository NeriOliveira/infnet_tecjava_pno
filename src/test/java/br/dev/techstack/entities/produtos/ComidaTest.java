package br.dev.techstack.entities.produtos;

import br.dev.techstack.entities.enums.Ingrediente;
import br.dev.techstack.entities.enums.Marca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComidaTest {
    @Test
    void adicionandoComidaUmDeveFuncionar(){
        Comida comidaUmTeste = new Comida("Teste 1", 1, 29.99f, false, 0.500f, Ingrediente.Bife_Empanado);
        assertEquals("Bife_Empanado", comidaUmTeste.getIngrediente().toString());
    }

    @Test
    void adicionandoComidaDoisNaoDeveFuncionar(){
        Comida comidaDoisTeste = new Comida("Teste 2", 1, 29.99f, false, 0.500f, Ingrediente.Bife_Empanado);
        assertEquals(9991, comidaDoisTeste.getCodigo());
    }

    @Test
    void adicionandoComidaTresDeveFuncionar(){
        Comida comidaTresTeste = new Comida("Teste 3", 1, 29.99f, false, 0.500f, Ingrediente.Bife_Empanado);
        assertEquals("Teste 3", comidaTresTeste.getNome());
    }


}