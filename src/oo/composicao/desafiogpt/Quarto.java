package oo.composicao.desafiogpt;

public class Quarto {
    //equivalente a Veiculo

    int numeroDoQuarto;
    double diariadoquarto;

    Quarto(int numeroDoQuarto, double diaria){
        this.numeroDoQuarto = numeroDoQuarto;
        this.diariadoquarto = diaria;
    }


    public String toString() {
        return "" + numeroDoQuarto;

    }
}
