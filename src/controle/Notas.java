package exercicios2;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double media = 0;

        System.out.print("\nQuantas provas serao avaliadas?: ");
        int provas = input.nextInt();

        for (int i = 1; i < provas + 1; i++){

            System.out.print("Digite a nota da " + i + "º prova: ");

            double nota = Double.parseDouble(input.next().replace(",","."));
            media += nota;

        }

        Double notafinal = media/provas;

        System.out.printf("\nmedia: %.1f\n" ,notafinal);

        if (notafinal <= 1.0) {
            System.out.println("Resultado final: F");

        } else if (notafinal >= 1.1 && notafinal <= 3.9){
            System.out.println("Resultado final: E");

        } else if (notafinal >= 4.0 && notafinal <= 5.9) {
            System.out.println("Resultado final: D");

        } else if (notafinal >= 6.0 && notafinal <= 7.9) {
            System.out.println("Resultado final: C");

        } else if (notafinal >= 8.0 && notafinal <= 9.5) {
            System.out.println("Resultado final: B");

        } else {
            System.out.println("Resultado final: A");
        }


        input.close();
    }
}
