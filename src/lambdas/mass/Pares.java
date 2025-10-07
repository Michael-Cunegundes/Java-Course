package lambdas.mass;

import java.util.ArrayList;
import java.util.Random;

public class Pares {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (numeros.size() < 10) {
                int numeroAleatorio = random.nextInt(100);
                numeros.add(numeroAleatorio);
            }
        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("\n\n");

        for (Integer numero : numeros) {

            if ((numero % 2) == 0) {
                System.out.println(numero);
            }
        }
    }
}
