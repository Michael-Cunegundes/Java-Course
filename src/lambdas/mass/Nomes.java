package lambdas.mass;

public class Nomes {

    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Michael";
        nomes[1] = "Gabriel";
        nomes[2] = "Marciel";
        nomes[3] = "Daniel";
        nomes[4] = "Joao";

        for (String nome : nomes) {
            if (nome.startsWith("M")) {
                System.out.println(nome);
            }
        }
    }

}
