package oo.polimorfismo;

public class Comida {

    private Double pesoComida;

    public Comida() {
        this(0);
    }

    public Comida(double pesoComida) {
        setPesoComida(pesoComida);
    }

    public Double getPesoComida() {
        return pesoComida;
    }

    public void setPesoComida(Double pesoComida) {
        if (pesoComida > 0) {
            this.pesoComida = pesoComida;
        }
    }
}