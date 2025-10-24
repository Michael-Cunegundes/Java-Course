package lambda.exercicios;

import java.util.Arrays;
import java.util.List;

public class Nomes {

    public static void main(String[] args) {


        List<String> nomes = Arrays.asList("Ana", "João", "Maria");

//  Reescreva esse codigo usando Lambda
//
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }

        nomes.forEach(nome -> System.out.println(nome));

    }
}
