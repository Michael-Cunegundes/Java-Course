package oo.composicao.desafio;

import oo.composicao.Compra;

import java.util.ArrayList;
import java.util.List;

public class ClienteDesafio {

    String nome;
    List<CompraDesafio> listaDeCompra = new ArrayList<>();


    ClienteDesafio(String nome){
        this.nome = nome;
    }

    public void adicionarCompra (CompraDesafio compra) {
        listaDeCompra.add(compra);

    }

    @Override
    public String toString(){
        return nome;
    }

}
