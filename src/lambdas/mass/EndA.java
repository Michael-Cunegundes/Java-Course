package lambdas.mass;

import java.util.function.BinaryOperator;

public class EndA {

    public static void main(String[] args) {

        BinaryOperator<Integer> maximo = BinaryOperator.maxBy(Integer::compare);

        System.out.println(maximo.apply(3,4));
    }
}
