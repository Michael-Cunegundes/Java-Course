package exercicios2;

import java.util.Scanner;

public class DiadaSemana {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("\nQue dia da semana eh hoje?: ");
        String dia = input.nextLine().toLowerCase();

        switch (dia) {
            case "domingo":
                System.out.println("Domingo é o 1º dia da semana");
                break;

            case "segunda feira":
                System.out.println("Segunda Feira é o 2º dia da semana");
                break;
            case "segunda":
                System.out.println("Segunda Feira é o 2º dia da semana");
                break;

            case "terça feira":
                System.out.println("Terça Feira é o 3º dia da semana");
                break;
            case "terça":
                System.out.println("Terça Feira é o 3º dia da semana");
                break;

            case "quarta feira":
                System.out.println("Quarta Feira é o 4º dia da semana");
                break;
            case "quarta":
                System.out.println("Quarta Feira é o 4º dia da semana");
                break;

            case "quinta feira":
                System.out.println("Quinta Feira é o 5º dia da semana");
                break;
            case "quinta":
                System.out.println("Quinta Feira é o 5º dia da semana");
                break;

            case "sexta feira":
                System.out.println("Sexta Feira é o 6º dia da semana");
                break;
            case "sexta":
                System.out.println("Sexta Feira é o 6º dia da semana");
                break;

            case "sabado":
                System.out.println("Sabado é o 6º dia da semana");
                break;
            case "sábado":
                System.out.println("Sábado é o 6º dia da semana");
                break;

            default:
                System.out.println("Dia inválido");


        }
        

        input.close();
    }
}
