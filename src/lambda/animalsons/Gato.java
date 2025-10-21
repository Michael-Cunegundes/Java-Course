package lambda.animalsons;

public class Gato extends Animal {

    public static void main(String[] args) {

        Animal gato = new Animal();
        gato.som = "Miau";

        System.out.println(gato.fazerSom());
    }

}
