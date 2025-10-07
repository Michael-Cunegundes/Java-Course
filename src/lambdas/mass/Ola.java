package lambdas.mass;

import java.util.Arrays;
import java.util.List;

import static lambdas.mass.OlaReference.dizerOla;

public class Ola {

    public static void main(String[] args) {

        List<String> pessoas = Arrays.asList("Ana", "Lia", "Gui", "Leo");

//        pessoas.forEach(nome -> System.out.println("Ola " + nome) );
        pessoas.forEach(nome -> dizerOla(nome));

    }
}
