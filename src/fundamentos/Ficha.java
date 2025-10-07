package fundamentos;

public class Ficha {

    public static void main(String[] args) {

        String nome = "Joao";
        int idade = 22;
        double salario = 9.821;
        double anosempresa = 2;
        char status = 'A';

        System.out.printf("\nNome: %s \nIdade: %d \nSalario: %.3f\n" +
                "Anos na empresa: %.0f\nStatus: %c\n", nome, idade, salario, anosempresa, status);

    }
}
