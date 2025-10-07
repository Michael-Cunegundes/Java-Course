package production.exercicios2.Lambda;

public class LambdaCalcTest {

    public static void main(String[] args) {

        Operacao calc = new SomarLambda();
        System.out.println("Soma: " + calc.lambda(5,6));

        calc = new DivisaoLambda();
        System.out.println("Divisao: " + calc.lambda(10,2));
    }
}
