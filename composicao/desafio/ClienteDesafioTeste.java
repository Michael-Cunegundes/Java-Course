package oo.composicao.desafio;

public class ClienteDesafioTeste {

    public static void main(String[] args) {

        ClienteDesafio cliente1 = new ClienteDesafio("Joao");

        ProdutoDesafio produto1 = new ProdutoDesafio("Caneca", 160.50);
        ProdutoDesafio produto2 = new ProdutoDesafio("Camisa", 1200.00);

        ItemDesafio item1 = new ItemDesafio(produto1,2);
        ItemDesafio item2 = new ItemDesafio(produto2,1);

        CompraDesafio compraDesafio = new CompraDesafio(cliente1);
        compraDesafio.adicionarItem(item1);
        compraDesafio.adicionarItem(item2);

        cliente1.adicionarCompra(compraDesafio);

        System.out.println(cliente1.listaDeCompra.get(0));


    }
}
