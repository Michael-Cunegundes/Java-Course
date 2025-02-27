package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println(c1.motor.carro.motor.carro.motor.giros());

    }
<<<<<<< HEAD:oo/composicao/CarroTeste.java
}
=======
}
>>>>>>> 0694af910d60dffc374bc1ac1acd045e946df987:src/oo/composicao/CarroTeste.java
