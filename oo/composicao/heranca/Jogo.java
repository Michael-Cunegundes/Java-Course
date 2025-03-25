package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;

        Jogador j2 = new Heroi();
        j2.x = 10;
        j2.y = 11;

        System.out.println("vida jogador 1: " +j1.vida);
        System.out.println("vida jogador 2: " +j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println("\nvida jogador 1: " +j1.vida);
        System.out.println("vida jogador 2: " +j2.vida);


        System.out.println("\nposicado no tabuleiro do j1: " + "X = " + j1.x + "   Y = " + j1.y);
        System.out.println("posicado no tabuleiro do j2: " + "X = " + j2.x + "   Y = " + j2.y);
    }
}
