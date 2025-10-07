package exercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class TurmaMatriz {

    public static void main(String[] args) {

        int qalunos = 0;
        int qprovas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nSao quantos alunos na sala?: ");
        qalunos = scanner.nextInt();

        System.out.print("Quantas provas foram aplicadas?: ");
        qprovas = scanner.nextInt();

        int[][] matriz = new int[qalunos][qprovas];
        double[] notas = new double[qprovas];

        for (int i = 1; i < qprovas; i++) {

            System.out.print("Qual foi a " + i + "º nota 1º aluno?: ");
            matriz[i][0] = scanner.nextInt();
            notas[i] = matriz[i][0];

        }

        for (double nota : notas) {
            System.out.println(Arrays.toString(notas));
        }

        scanner.close();
    }
}
