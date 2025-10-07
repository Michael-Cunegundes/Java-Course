package lambdas.mass;

public class Carro {

    double velocidade = 0;

    void acelerar(){
        velocidade += 5;
    }

    void frear(){
        velocidade -= 5;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println("Velocidade atual: " + carro.velocidade);
        carro.acelerar();
        System.out.println("Velocidade atual: " + carro.velocidade);
        carro.acelerar();
        carro.acelerar();
        System.out.println("Velocidade atual: " + carro.velocidade);
        carro.frear();
        System.out.println("Velocidade atual: " + carro.velocidade);
    }
}
