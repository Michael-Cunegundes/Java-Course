package lambda;

public class CalculoTest1 {

    public static void main(String[] args) {

        Calculo calc = new Somar();
        System.out.println("Soma: " + calc.executar(2, 3));

        calc = new Multiplicar();
        System.out.println("Multiplicacao: " + calc.executar(2,10));

    }


}
