package br.dev.techstack.entities;

import java.util.Random;

public abstract class Produto {
    private String nome;
    private float valor;
    private int codigo;

    public Produto(String nome, float valor, int codigo){
        setNome(nome);
        setValor(valor);
        setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    private void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        Random r = new Random();
        this.codigo = Math.abs(r.nextInt(9999) - codigo);
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", valor=" + getValor() +
                ", codigo=" + getCodigo() +
                '}';
    }
}
