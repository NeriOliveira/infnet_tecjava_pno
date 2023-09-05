package br.dev.techstack.entities.produtos;
import br.dev.techstack.entities.Produto;
import br.dev.techstack.entities.enums.Ingrediente;

public class Comida extends Produto {
    private float peso;
    private boolean vegano;
    private Ingrediente ingrediente;


    public Comida(String nome, int codigo, float valor, boolean vegano, float peso, Ingrediente ingrediente) {
        super(nome, valor, codigo);
        setCodigo(codigo);
        setVegano(vegano);
        setPeso(peso);
        setIngrediente(ingrediente);
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    private boolean isVegano() {
        return vegano;
    }

    private void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    private void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "\nProduto COD: "+ getCodigo() + "\n||====> Comida {" +
                "nome: '" + getNome() + '\'' +
                ", preço: R$ " + getValor() +
                ", peso: " + getPeso() + " kg" +
                ", vegano: " + isVegano() +
                ", ingrediente: '" + getIngrediente() + '\'' +
                "}\n";
    }
}
