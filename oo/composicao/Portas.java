package oo.composicao;

public class Portas {

    Carro portas;

    boolean aberta = false;

<<<<<<< HEAD:oo/composicao/Portas.java
    void abrir(){
        aberta = true;
    }

    void fechar(){
        aberta = false;
    }

    boolean estaAberta(){
        return aberta;
    }
}
=======
    int segurancaPorta() {

        if (!aberta) {
            return 0;

        } else {
            return 1;
        }

    }
}
>>>>>>> 0694af910d60dffc374bc1ac1acd045e946df987:src/oo/composicao/Portas.java
