package oo.composicao;

public class Portas {

    Carro portas;

    boolean aberta = false;

    int segurancaPorta() {

        if (!aberta) {
            return 0;

        } else {
            return 1;
        }

    }
}
