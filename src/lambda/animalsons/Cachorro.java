package lambda.animalsons;

public class Cachorro extends Animal {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.som = "AU";

        System.out.println(cachorro.fazerSom());

    }


}