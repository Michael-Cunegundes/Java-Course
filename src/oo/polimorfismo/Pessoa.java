package oo.polimorfismo;

public class Pessoa {

    private double pesoPessoa;

    public Pessoa (double pesoPessoa){
        this.pesoPessoa = pesoPessoa;
    }

    public double getPesoPessoa() {
        return pesoPessoa;
    }

    private void setPesoPessoa(double pesoPessoa) {
        this.pesoPessoa = pesoPessoa;
    }

    public void comer(Comida comida) {
        this.pesoPessoa += comida.getPesoComida();

    }

}