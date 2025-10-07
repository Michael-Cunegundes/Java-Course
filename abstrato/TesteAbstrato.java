package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Mamifero cachorrinholindo = new Cachorro();
        System.out.println(cachorrinholindo.mover());
        System.out.println(cachorrinholindo.mamar());
    }

}
