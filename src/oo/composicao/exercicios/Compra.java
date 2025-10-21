package oo.composicao.exercicios;

import java.util.ArrayList;

public class Compra {

    Cliente cliente;
    ArrayList<Item> listaDeItens = new ArrayList<>();

    public Compra(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Item item) {
        listaDeItens.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCompra de ").append(cliente.nome).append("\nItens:\n");
        for (Item item : listaDeItens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
