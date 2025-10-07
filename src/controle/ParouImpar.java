package exercicios2;

import java.util.Scanner;

public class ParouImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite um numero inteiro: ");
        int n = input.nextInt();

        String resultado = (n % 2 == 0) ? "Par" : "Impar";

        System.out.println("O numero " + n + " eh " + resultado);

        input.close();
    }
}
