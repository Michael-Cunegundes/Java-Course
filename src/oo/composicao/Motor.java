package oo.composicao;

public class Motor {

    final Carro carro; // Agora o motor tem referência ao carro

    boolean ligado = false;
    double fatorInjecao = 1;

    // Construtor que recebe um carro como argumento
    Motor(Carro carro) {
        this.carro = carro;
    }

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
