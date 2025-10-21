package oo.composicao.exercicios;

public class Item {

    Produto produto;
    int quantidade;

    public Item(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return produto.toString() + " x" + quantidade;
    }
}
