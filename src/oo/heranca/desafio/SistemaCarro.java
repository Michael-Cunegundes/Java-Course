package oo.heranca.desafio;

public class SistemaCarro {

    public static void main(String[] args) {

        Carro f80 = new F80();
        Carro corsa = new Corsa();

        System.out.println("Acelerando");
        f80.acelerar();
        corsa.acelerar();

        System.out.println(f80.velocidadeAtual);
        System.out.println(corsa.velocidadeAtual);
        System.out.println("freiando");

        f80.frear();
        corsa.frear();

        System.out.println(f80.velocidadeAtual);
        System.out.println(corsa.velocidadeAtual);

        System.out.println("freiando");
        f80.frear();
        corsa.frear();
        System.out.println(f80.velocidadeAtual);
        System.out.println(corsa.velocidadeAtual);
    }
}
