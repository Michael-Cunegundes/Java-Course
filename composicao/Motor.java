<<<<<<< HEAD:src/oo/composicao/Motor.java
package oo.composicao;

public class Motor {

    final Carro carro;

    boolean ligado = false;
    double fatorInjecao = 1;

    Motor (Carro carro){
        this.carro = carro;
    }

    int giros() {

        if (!ligado) {
            return 0;

        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }
=======
package oo.composicao;

public class Motor {

    final Carro carro;

    boolean ligado = false;
    double fatorInjecao = 1;

    Motor (Carro carro){
        this.carro = carro;
    }

    int giros() {

        if (!ligado) {
            return 0;

        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }
>>>>>>> 79c0e9ce57b4a3d3003ee70b04c845f06244bcf7:composicao/Motor.java
}