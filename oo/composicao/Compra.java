package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;

    ArrayList <Item> itens = new ArrayList<Item>();


    void adicionarItem (String nome, int quantidade, double preco){
        this.adicionarItem(nome,quantidade,preco);
    }

    void adicionarItem (Item item){
        itens.add(item);
        item.compra = this;
    }


    Double obeterValorTotal(){
        double total = 0;
        double totalfinal = 0;

        for (Item item : itens){

            total += (item.quantidade * item.preco);

        }
        return total;
    }

}
