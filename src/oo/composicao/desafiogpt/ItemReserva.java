package oo.composicao.desafiogpt;

public class ItemReserva {
    //equivalente a ItemLocacao

    Quarto quarto;
    int diasReservados;

    ItemReserva(Quarto quarto, int diasReservados){
        this.quarto = quarto;
        this.diasReservados = diasReservados;

    }

//    @Override
//    public String toString (){
//        return quarto.toString() + " (" + diasReservados + " dias) = ";
//    }

    @Override
    public String toString (){
        return "- Quarto " + quarto.toString() + " (Diária: R$ " + quarto.diariadoquarto + ") → Check-out em " + diasReservados + " dias";
    }



}
