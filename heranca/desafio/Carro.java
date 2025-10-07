package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;

    int acelerar(){
        return velocidadeAtual += 5;
    }


    int frear(){

        if (velocidadeAtual > 1){
            return velocidadeAtual -= 5;
        }
        return velocidadeAtual;

    }
}
