package exercicios2;

import java.util.Scanner;

public class Média {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nQuantas provas foram aplicadas?: ");
        Integer qnotas = input.nextInt();
        Double media = 0.0;
        Double nota;
        System.out.println(" ");

        for (int i = 1; i < qnotas + 1; i++){

            System.out.print("Digite a nota da " + i + "º prova: ");

            nota = Double.parseDouble(input.next().replace(",","."));

            if (nota > 10 || nota < 0) {
                i = i-1;

                System.out.println("Valor somente de 0 a 10\n");


            } else {

            media += nota;

            }

        }
            System.out.printf("\nMedia final = %.1f", media/qnotas);

        input.close();

    }
}
