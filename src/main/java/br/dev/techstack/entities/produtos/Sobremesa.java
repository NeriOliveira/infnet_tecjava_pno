package br.dev.techstack.entities.produtos;
import br.dev.techstack.entities.Produto;
import br.dev.techstack.entities.enums.Informacao;

public class Sobremesa extends Produto {
    private float quantidade;
    private boolean doce;
    private Informacao informacao;



    public Sobremesa(String nome, int codigo, float valor, float quantidade, boolean doce, Informacao informacao) {
        super(nome, valor, codigo);
        setCodigo(codigo);
        setQuantidade(quantidade);
        setDoce(doce);
        setInformacao(informacao);
    }


    private float getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    private boolean isDoce() {
        return doce;
    }

    private void setDoce(boolean doce) {
        this.doce = doce;
    }

    public Informacao getInformacao() {
        return informacao;
    }

    private void setInformacao(Informacao informacao) {
        this.informacao = informacao;
    }




    @Override
    public String toString() {
        return "\nProduto COD: "+ getCodigo() + "\n||====> Sobremesa {" +
                "nome: '" + getNome() + '\'' +
                ", preço: R$ " + getValor() +
                ", quantidade: " + getQuantidade() + " ml" +
                ", doce: " + isDoce() +
                ", informação: '" + getInformacao() + '\'' +
                "}\n";
    }
}
