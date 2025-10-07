package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo{

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Heroi(10,10);

        System.out.println("vida monstro: " +monstro.vida);
        System.out.println("vida heroi: " +heroi.vida);

        System.out.println("\nmonstro ataca heroi " + monstro.atacar(heroi));
        System.out.println("heroi ataca monstro " + heroi.atacar(monstro));

        System.out.println("\nvida monstro: " +monstro.vida);
        System.out.println("vida heroi: " +heroi.vida);

        System.out.println("\nposicado no tabuleiro do monstro: " + "X = " + monstro.x + "   Y = " + monstro.y);
        System.out.println("posicado no tabuleiro do heroi: " + "X = " + heroi.x + "   Y = " + heroi.y);

        System.out.println("\nmonstro recua depois do ataque " + monstro.andar(Direcao.NORTE));
        System.out.println("\nheroi tenta atacar o monstro mais nao tem distancia  " + heroi.atacar(monstro));


        System.out.println("\nposicado no tabuleiro do monstro: " + "X = " + monstro.x + "   Y = " + monstro.y);
        System.out.println("posicado no tabuleiro do heroi: " + "X = " + heroi.x + "   Y = " + heroi.y);
    }
}
