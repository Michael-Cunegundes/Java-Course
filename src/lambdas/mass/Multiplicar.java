package lambdas.mass;

import lambdas.Calculo;

public class Multiplicar {

    public static void main(String[] args) {

        Calculavel mult = (a, b) -> a * b;
        System.out.println(mult.calcular(2,5));

        mult = (a,b) -> (a / b);
        System.out.println(mult.calcular(10, 3));
    }
}
