<<<<<<< HEAD:src/oo/composicao/desafio/CompraDesafio.java
package oo.composicao.desafio;

import java.util.ArrayList;

public class CompraDesafio {

    ClienteDesafio cliente;
    ArrayList<ItemDesafio> listaDeItens = new ArrayList<>();

    public CompraDesafio(ClienteDesafio cliente) {
        this.cliente = cliente;
    }


    public void adicionarItem(ItemDesafio item) {
        listaDeItens.add(item);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nCompra de ").append(cliente.nome).append("\nItens:\n");
        for (ItemDesafio item : listaDeItens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

}
=======
package oo.composicao.desafio;

import oo.composicao.desafio.ClienteDesafio;
import oo.composicao.desafio.ItemDesafio;

import java.util.ArrayList;

public class CompraDesafio {

    ClienteDesafio cliente;
    ArrayList<ItemDesafio> listaDeItens = new ArrayList<>();

    public CompraDesafio(ClienteDesafio cliente){
        this.cliente = cliente;
    }


    public void adicionarItem (ItemDesafio item) {
        listaDeItens.add(item);

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Compra de ").append(cliente.nome).append("\nItens:\n");
        for (ItemDesafio item : listaDeItens){
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

}
>>>>>>> 79c0e9ce57b4a3d3003ee70b04c845f06244bcf7:composicao/desafio/CompraDesafio.java
