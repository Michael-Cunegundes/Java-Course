package arrays.exercicios;

import java.util.Scanner;

public class ExercicioArrayResposta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas: ");
        int qtdenotas = entrada.nextInt();

        double[] notas = new double[qtdenotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A media eh: " + media + "!");
        entrada.close();
    }
}
