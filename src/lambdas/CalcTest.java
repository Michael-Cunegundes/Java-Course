package production.exercicios2.Lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CalcTest {

    public static void main(String[] args) {

        Operacao soma = (x,y) -> {
            return x + y;
        };

        System.out.println("Soma : " + soma.lambda(4,6));

        Operacao mult = (x , y) -> x * y;
        System.out.println("Multiplicacao: " + mult.lambda(6,8));

        BiFunction<Integer, Integer, Integer> subtracao = (x, y) -> x - y;
        System.out.println("Subtracao: " + subtracao.apply(56,34));


        Consumer <String> exibir = log -> System.out.println(log + " oi");

        System.out.println(exibir);

        Predicate<String> comecaComA = texto -> texto.startsWith("A");

        System.out.println(comecaComA);



    }
}
