package oo.composicao;

<<<<<<< HEAD:oo/composicao/Carro.java
import colecoes.Livro;
import colecoes.Usuario;

import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> 0694af910d60dffc374bc1ac1acd045e946df987:src/oo/composicao/Carro.java
public class Carro {

    Motor motor;

<<<<<<< HEAD:oo/composicao/Carro.java
    private List<Portas> portas;

    Carro(){

        this.motor = new Motor(this);
        this.portas = new ArrayList<>();
    }

    public void adicionarPorta(Portas porta) {
        portas.add(porta);
    }

    public boolean todasPortasFechadas(){
        for (Portas porta : portas){
            if (porta.estaAberta()){
                return false;
            }
        }
        return true;
    }

    void acelerar() {
        if (!todasPortasFechadas()) {
            System.out.println("Porta aberta");
        }
=======
    Carro(){
        this.motor = new Motor(this);
    }


    void acelerar() {

//        if (Portas.aberta) {
//            "Porta Aberta"
//        }
>>>>>>> 0694af910d60dffc374bc1ac1acd045e946df987:src/oo/composicao/Carro.java

        if (motor.fatorInjecao < 3.0) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
<<<<<<< HEAD:oo/composicao/Carro.java
}
=======
}
>>>>>>> 0694af910d60dffc374bc1ac1acd045e946df987:src/oo/composicao/Carro.java
