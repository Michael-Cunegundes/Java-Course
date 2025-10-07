package oo.composicao.desafiogpt;

import java.util.ArrayList;
import java.util.List;

public class Hospede {
    //equivalente a Cliente

    String nome;

    List<Reserva> reservas = new ArrayList<>();

    Hospede(String nome){
        this.nome = nome;
    }

    public void reservarQuarto (Reserva reserva){
        this.reservas.add(reserva);
    }


    double obterValorTotalEstadia() {
        double total = 0;

        for (Reserva reserva : reservas) {
            total += reserva.totalEstadia();
        }
        return total;

    }

}
