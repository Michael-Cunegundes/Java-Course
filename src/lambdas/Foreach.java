package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List <String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("\nForeach tradicional:");
        for (String nomes: aprovados){
            System.out.println(nomes);
        }

        System.out.println("\nLambda #01:");
        aprovados.forEach((nomes) -> {System.out.println(nomes + " !!!"); });

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);


    }
}
