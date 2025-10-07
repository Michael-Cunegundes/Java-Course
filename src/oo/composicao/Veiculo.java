package exercicios2;

public class Veiculo {

    private Boolean ligado;
    private int velocidade;

    public int acelerar() {
        if (ligado) {
            return velocidade += 5;

        } else {
            return velocidade;
        }

    }

    public int freiar() {
        if (ligado) {
            return velocidade -= 5;
        } else {
            return velocidade;
        }
    }

    public int desligado() {

        if (!ligado) {
            return velocidade = 0;
        } else {
            return velocidade;
        }
    }


    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo();

        carro1.ligado = true;
        carro1.acelerar();
        carro1.acelerar();

        carro1.freiar();
//        carro1.ligado = false;

        if (carro1.ligado) {
            System.out.println("\nvelocidade atual: " + carro1.velocidade);

        } else {
            System.out.println("\nCarro desligado");
        }


    }
}
