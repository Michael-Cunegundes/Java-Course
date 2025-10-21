package oo.abstrato;

public class TestAbstrato {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println(cachorro.respirar());
        System.out.println(cachorro.mover());
    }
}
