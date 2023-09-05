package br.dev.techstack.entities;

import br.dev.techstack.exceptions.BusinessException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {

    private String id;
    private String descricao;
    private LocalDateTime data;
    private boolean web;

    private final List<Produto> produtos = new ArrayList<>();

    private Solicitante solicitante;

    public Pedido(){}
    public Pedido(String descricao, LocalDateTime data, Solicitante solicitante, List<Produto> produtos) {
        setId();
        setDescricao(descricao);
        setData(data);
        setWeb();
        setSolicitante(solicitante);

        if (produtos.isEmpty()){
            throw new BusinessException("======================= !! ATENÇÃO !! ======================="+
                    "\nAdicione Produtos ao Pedido" +
                    "\n==============================================================");
        }else {
            System.out.println("\n\n\n=====================! PEDIDO REALIZADO !=====================");
            System.out.println("ID do Pedido: " + getId());
            System.out.println("Cliente: " + getSolicitante().getNome());
            System.out.println("Data e Horário: " + getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss")));
            System.out.println("== Itens do Pedido ===========================================");
            System.out.println(produtos);
            System.out.println("===================================== Obrigado pelo Pedido! ==");
        }
    }


    public String getId() {
        return id;
    }

    private void setId() {
        this.id = UUID.randomUUID().toString();
    }

    private String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    private void setData(LocalDateTime data) {
        this.data = data;
    }

    private boolean isWeb() {
        return web;
    }

    private void setWeb() {
        this.web = true;
    }

    private Solicitante getSolicitante() {
        return solicitante;
    }

    private void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    @Override
    public String toString() {
        return "Pedido " + getId() + " {" +
                "\n descricao: '" + getDescricao() + '\'' +
                ", data: " + getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss")) +
                ", web: " + isWeb() +
                ", solicitante: " + getSolicitante() +
                "\n}\n";
    }
}