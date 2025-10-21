package oo.composicao.exercicios;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao");

        Produto produto1 = new Produto("Caneca", 160.50);
        Produto produto2 = new Produto("Camisa", 1200.00);

        Item item1 = new Item(produto1, 2);
        Item item2 = new Item(produto2, 1);

        Compra compra1 = new Compra(cliente1);
        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);

        cliente1.adicionarCompra(compra1);
        System.out.print(cliente1.listaDeCompra.get(0));
        cliente1.obterValorTotal();

    }
}
