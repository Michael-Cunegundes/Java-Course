package exercicios2;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String resposta = " ";

        System.out.print("\nDigite uma palavra: ");
        resposta = input.nextLine();

        while (!resposta.equalsIgnoreCase("sair")) {


            System.out.print("\nA palavra Digitada foi: " + resposta);
            System.out.print("\nDigite outra palavra ou 'sair' para finalizar: ");
            resposta = input.nextLine();


        }

        System.out.println("\nFinalizando o progama ...");


        input.close();
    }
}
