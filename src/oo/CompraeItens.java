package oo;

import java.util.ArrayList;

public class CompraeItens {

    ArrayList<CompraeItens> itens = new ArrayList<>();

    String nome;
    int quantidade;
    double preco;

    CompraeItens(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    Double valorTotal(){
        double total = 0;
        for (CompraeItens item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

    public static void main(String[] args) {

        CompraeItens compra1 = new CompraeItens("Caneta", 2, 5.45);
        CompraeItens compra2 = new CompraeItens("Notebook", 3, 5.750);
        compra1.itens.add(compra1);
        compra2.itens.add(compra2);

        System.out.println(compra2.valorTotal());


    }
}
