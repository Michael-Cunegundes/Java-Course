package oo.heranca.teste;

import oo.heranca.DesafioProfessor.Carro;
import oo.heranca.DesafioProfessor.Civic;
import oo.heranca.DesafioProfessor.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

//        System.out.println("\n--- Testando Civic ---");
//        Civic c1 = new Civic();
//
//        c1.acelerar();
//        System.out.println(c1);
//
//        c1.acelerar();
//        System.out.println(c1);
//
//        c1.acelerar();
//        System.out.println(c1);
//        c1.acelerar();
//
//
//        System.out.println("velocidade maxima civic " + c1.VELOCIDADE_MAXIMA);
//        System.out.println("velocidade civic " + c1);

        System.out.println();

        Ferrari c2 = new Ferrari(400);

        c2.ligarTurbo();
        c2.ligarMassagem();
        c2.desligarMassagem();
        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.desligarTurbo();
        c2.acelerar();
        System.out.println(c2); 

        System.out.println(c2.nivelDaMassagem());




    }
}
