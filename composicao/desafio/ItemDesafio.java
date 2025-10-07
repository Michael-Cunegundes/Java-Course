<<<<<<< HEAD:src/oo/composicao/desafio/ItemDesafio.java
package oo.composicao.desafio;

public class ItemDesafio {

    ProdutoDesafio produtoDesafio;
    int quantidade;

    public ItemDesafio(ProdutoDesafio produtoDesafio, int quantidade) {
        this.quantidade = quantidade;
        this.produtoDesafio = produtoDesafio;
    }

    @Override
    public String toString() {
        return produtoDesafio.toString() + " x" + quantidade;
    }
=======
package oo.composicao.desafio;

public class ItemDesafio {

    ProdutoDesafio produtoDesafio;
    int quantidade;

    public ItemDesafio(ProdutoDesafio produtoDesafio, int quantidade){
        this.quantidade = quantidade;
        this.produtoDesafio = produtoDesafio;
    }

    @Override
    public String toString(){
        return produtoDesafio.toString() + " x" + quantidade;
    }
>>>>>>> 79c0e9ce57b4a3d3003ee70b04c845f06244bcf7:composicao/desafio/ItemDesafio.java
}