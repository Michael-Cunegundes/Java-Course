package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado()); // Deve imprimir "false"

        c1.ligar();
        System.out.println(c1.estaLigado()); // Deve imprimir "true"

        System.out.println(c1.motor.giros()); // Deve imprimir 3000 giros

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros()); // Deve imprimir um valor maior

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Agora podemos acessar a relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());

        System.out.println(c1.motor.giros()); // Deve imprimir um valor menor após frear
    }
}
