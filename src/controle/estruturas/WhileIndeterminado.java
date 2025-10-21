package controle.estruturas;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("Sair")) {
            System.out.print("\nDigite 'Sair' para finalizar o progama: ");
            valor = entrada.nextLine();

        }

        entrada.close();
    }
}
