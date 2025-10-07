package oo.composicao.desafiogpt;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    //equivalente a Locacao

    List<ItemReserva> itemReserva = new ArrayList<>();

    public void adicionarItemReserva(Quarto quarto, int diasReservados){
        this.itemReserva.add(new ItemReserva(quarto, diasReservados));
    }

    @Override
    public String toString() {
        StringBuilder detalhes = new StringBuilder();
        for (ItemReserva item: itemReserva){
            detalhes.append(item.toString()).append(" ");
        }
        return detalhes.toString();
    }

    public double totalEstadia(){
        double total = 0;
        for (ItemReserva estadia: itemReserva){
            total += estadia.diasReservados * estadia.quarto.diariadoquarto;
        }
        return total;
    }

}
