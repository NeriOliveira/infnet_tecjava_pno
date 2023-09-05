package br.dev.techstack;

import br.dev.techstack.entities.Pedido;
import br.dev.techstack.entities.Produto;
import br.dev.techstack.entities.Solicitante;
import br.dev.techstack.entities.enums.Informacao;
import br.dev.techstack.entities.enums.Ingrediente;
import br.dev.techstack.entities.enums.Marca;
import br.dev.techstack.entities.produtos.Bebida;
import br.dev.techstack.entities.produtos.Comida;
import br.dev.techstack.entities.produtos.Sobremesa;
import br.dev.techstack.exceptions.BusinessException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.time.LocalDateTime.now;

public class Exemplo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[20];
        produtos[0]     = new Sobremesa("Salada de Frutas", 1, 13.99f, 300f, false, Informacao.Frutas_Citricas);
        produtos[1]     = new Bebida("Refrigerante Garrafa 1", 1, 14.99f, true, 2.00f, Marca.Coca_Cola);
        produtos[2]     = new Bebida("Refrigerante Garrafa 1", 1, 14.99f, true, 2.00f, Marca.Coca_Cola);
        produtos[3]     = new Bebida("Refrigerante Garrafa 2",1, 11.99f, true, 2.00f, Marca.Sprite);
        produtos[4]     = new Bebida("Refrigerante Lata 1",1, 5.99f, true, 0.35f, Marca.Fanta);
        produtos[5]     = new Bebida("Refrigerante Lata 2", 1, 4.99f, true, 0.35f, Marca.Kuat);
        produtos[6]     = new Comida("Prato Vegano", 1, 35.99f, true, 0.500f, Ingrediente.Grãos_Selecionados);
        produtos[7]     = new Comida("Prato Executivo 1", 1, 29.99f, false, 0.500f, Ingrediente.Bife_Empanado);
        produtos[8]     = new Comida("Prato Executivo 2", 1, 27.99f, false, 0.500f, Ingrediente.File_Frango);
        produtos[9]     = new Comida("Lanche Vegano", 1,25.99f, false, 0.300f, Ingrediente.Hamburguer_Vegano);
        produtos[10]    = new Sobremesa("Torta", 1, 10.99f, 250f, true, Informacao.Morango);
        produtos[11]    = new Sobremesa("Bolo", 1, 12.99f, 300f, true, Informacao.Chocolate);
        produtos[12]    = new Sobremesa("Bolo Diet", 1, 13.99f, 300f, false, Informacao.Banana);
        produtos[13]    = new Bebida("Refrigerante Lata 3", 1, 4.99f, true, 0.35f, Marca.Soda);
        produtos[14]    = new Bebida("Refrigerante Lata 4", 1, 4.99f, true, 0.35f, Marca.Pepsi);
        produtos[15]    = new Bebida("Refrigerante Lata 5", 1, 4.99f, true, 0.35f, Marca.Sukita);


        LocalDateTime hoje = now();
        Solicitante cliente1 = new Solicitante("Cliente Teste 1", "000.000.000-80", "teste@teste.com.br");
        Pedido p1 = new Pedido();

        p1.addProduto(produtos[8]);
        p1.addProduto(produtos[6]);
        p1.addProduto(produtos[15]);
        p1.addProduto(produtos[15]);
        p1.addProduto(produtos[1]);

        p1.removeProduto(produtos[15]);

        //Trocar p1.getProdutos() por testeException
        List<Produto> testeException = new ArrayList<>();

        try{
            p1 = new Pedido("Pedido Teste 1", hoje, cliente1, p1.getProdutos());
            System.out.println("Pedido Cadastrado com sucesso!!\n");
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        System.out.println(p1);

        Solicitante cliente2 = new Solicitante("Cliente Teste 2", "000.000.000-80", "teste2@teste.com.br");
    }
}
