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

import java.io.*;
import java.time.LocalDateTime;
import java.util.Locale;

import static java.time.LocalDateTime.now;

public class MainProgram {
    public static void main(String[] args) {

        /* ========> REGISTRO DE BASE DE DADOS: <========*/
        Locale.setDefault(Locale.US);
        LocalDateTime ontem = now().minusDays(1);
        LocalDateTime hoje = now();
        LocalDateTime amanha = now().plusDays(1);
        Produto[] produtos = new Produto[16];
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


        /* ========> ABRIR ARQUIVO DE INSTRUÇÕES: <========*/
        String path_in = "C:\\.....COPIAR..O..PATH.....\\src\\main\\resources\\input_pno.txt";
        try (BufferedReader br = new BufferedReader ( new FileReader(path_in))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }


        /* ========> REALIZAÇÕES DE PEDIDOS: <========*/
        Solicitante c1 = new Solicitante("Francisco Gabriel Corte Real", "657.926.871-96", "francisco-cortereal81@renatoseguros.com");
        Pedido p1 = new Pedido();
        p1.addProduto(produtos[8]);
        p1.addProduto(produtos[6]);
        p1.addProduto(produtos[15]);
        p1.addProduto(produtos[15]);
        p1.addProduto(produtos[1]);
        p1.removeProduto(produtos[15]);

        Pedido p2 = new Pedido();
        Solicitante c2 = new Solicitante("Bryan Sérgio Almeida", "799.504.726-60", "bryansergioalmeida@kmspublicidade.com.br");
        p2.addProduto(produtos[0]);
        p2.addProduto(produtos[4]);
        p2.addProduto(produtos[3]);
        p2.addProduto(produtos[12]);

        Pedido p3 = new Pedido();
        Solicitante c3 = new Solicitante("Fabiana Emily Sarah da Cruz", "846.813.475-90", "fabianaemilydacruz@hotrmail.com");
        p3.addProduto(produtos[13]);
        p3.addProduto(produtos[10]);

        try{
            p1 = new Pedido("Pedido 1", ontem, c1, p1.getProdutos());
            p2 = new Pedido("Pedido 2", hoje, c2, p2.getProdutos());
            p3 = new Pedido("Pedido 3", amanha, c3, p3.getProdutos());
            System.out.println("\n\nPedidos Cadastrados com sucesso!!\n");
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }


        /* ========> EMITIR COMPROVANTE DOS PEDIDOS REALIZADOS: <========*/
        String[] lines = new String[] {p1+"\n", p2+"\n", p3+"\n"};

        String path_out = "C:\\.....COPIAR..O..PATH.....\\src\\main\\resources\\output_pno.txt";
        try (BufferedWriter bw = new BufferedWriter ( new FileWriter (path_out))) {
            for ( String line : lines) {
                bw.write ( line);
                bw.newLine ();
            }
            System.out.println("Comprovantes dos pedidos emitidos e Programa Finalizado com sucesso.");
        } catch ( IOException e) {
            e .printStackTrace ();
        }
    }
}
