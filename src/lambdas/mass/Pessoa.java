package lambdas.mass;

public class Pessoa {

    String nome;
    int idade;

    String falar(){
        return "Olá, meu nome é " + nome;
    }

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Michael";
        p1.idade = 22;

        System.out.println(p1.falar());
    }

}


