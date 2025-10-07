package exercicios2;

import java.util.Scanner;

public class MediaArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQuantas provas foram aplicadas?: ");
        int provasQ = scanner.nextInt();

        double[] notas = new double[provasQ];

        for (int i = 0; i <= provasQ - 1; i++) {

            System.out.print("\nQual a " + (i + 1) + "º nota?: ");
            notas[i] = scanner.nextDouble();

            while (notas[i] > 10 || notas[i] < 0) {
                System.out.print("Nota invalida, apenas de 0 a 10");
                System.out.print("\nQual a " + (i + 1) + "º nota?: ");
                notas[i] = scanner.nextDouble();
            }
        }

        double media = 0;
        double menor = 10.1;
        double maior = 0;

        for (double nota : notas) {
            media += nota;

            if (nota < menor) {
                menor = nota;
            }

            if (nota > maior) {
                maior = nota;
            }

        }

        System.out.printf("\nMedia final: %.1f", media / provasQ);
        System.out.printf("\nMenor nota: %.1f", menor);
        System.out.printf("\nMaior nota: %.1f", maior);

        System.out.println("\n\nfinalizando");

        scanner.close();
    }
}
