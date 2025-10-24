package oo.composicao.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> listaDeCompra = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra) {
        listaDeCompra.add(compra);
    }

    public void obterValorTotal() {
        double total = 0;
        for (Compra compra : listaDeCompra) {
            for (Item item : compra.listaDeItens) {
                total += item.produto.preco * item.quantidade;
            }
        }
        System.out.println("O valor total das compras de " + nome + " é R$ " + total);
    }

    @Override
    public String toString() {
        return nome;
    }
}
