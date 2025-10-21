package controle.estruturas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Voce precisa falar "
                    + "\n'Sair'...");
            System.out.println("Quer sair? ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("Sair"));

        System.out.println("Tchau...");

        entrada.close();

    }
}
