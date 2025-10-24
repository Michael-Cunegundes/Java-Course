package lambda;

import java.util.function.BinaryOperator;

public class CalculoTest2 {

    public static void main(String[] args) {

//        Calculo soma = (x, y) -> {
//            return x + y;
//        };
//
//        System.out.println("Soma: " + soma.executar(4, 5));
//
//        Calculo mult = (x, y) -> x * y;
//        System.out.println("Multiplicacao: " + mult.executar(2,11));

        BinaryOperator<Double> calc = (a, b) -> a + b;
//        System.out.println(calc.apply(2, 3)); // ERRO!
    }
}
