package oo.composicao;

public class Motor {

    final Carro carro;

    boolean ligado = false;
    double fatorInjecao = 1;

    Motor (Carro carro){
        this.carro = carro;
    }

    int giros() {

        if (!ligado) {
            return 0;

        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }
<<<<<<< HEAD:oo/composicao/Motor.java
}
=======
}
>>>>>>> 0694af910d60dffc374bc1ac1acd045e946df987:src/oo/composicao/Motor.java
