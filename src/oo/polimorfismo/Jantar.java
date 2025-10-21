package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Comida arroz = new Arroz(0.3);

        Comida feijao = new Feijao(0.2);

        Comida sorvete = new Sorvete(0.8);

        System.out.println(convidado.getPesoPessoa());

        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);

        System.out.println(convidado.getPesoPessoa());

    }
}