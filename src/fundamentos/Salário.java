package fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class Salário {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String salario;
        Double valor = 0.0;

        for (int c = 1; c <= 3; c++) {


            salario = JOptionPane.showInputDialog("Digite o " + c + "º salario");
            salario = salario.replace(",",".");
            valor += Double.parseDouble(salario);

            System.out.println(c + "º Salario = " + salario);

        }

        System.out.printf("Media salario: %.2f", valor);

        input.close();
    }
}
