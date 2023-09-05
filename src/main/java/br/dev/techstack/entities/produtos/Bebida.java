package br.dev.techstack.entities.produtos;
import br.dev.techstack.entities.Produto;
import br.dev.techstack.entities.enums.Marca;

public class Bebida extends Produto {

    private boolean gelada;
    private float tamanho;
    private Marca marca;


    public Bebida(String nome, int codigo, float valor, boolean gelada, float tamanho, Marca marca) {
        super(nome, valor, codigo);
        setCodigo(codigo);
        setGelada(gelada);
        setTamanho(tamanho);
        setMarca(marca);
    }


    private boolean isGelada() {
        return gelada;
    }

    private void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    private float getTamanho() {
        return tamanho;
    }

    private void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public Marca getMarca() {
        return marca;
    }

    private void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nProduto COD: "+ getCodigo() + "\n||====> Bebida {" +
                "nome: '" + getNome() + '\'' +
                ", preço: R$ " + getValor() +
                ", gelada: " + isGelada() +
                ", tamanho: " + getTamanho() + " litros" +
                ", marca: '" + getMarca() + '\'' +
                "}\n";
    }
}
