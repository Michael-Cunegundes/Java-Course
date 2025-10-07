package fundamentos;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {

        System.out.println(" ");

        Scanner input = new Scanner(System.in);

        System.out.print("Qual a temperatura em Fahrenheit?: ");

        double F = input.nextDouble();


        double C = (F - 32) * 5/9;

        System.out.printf("%.0fº Fahrenheit em Celsius da %.0fº ", F,C );


        input.close();
    }
}
