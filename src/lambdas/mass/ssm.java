package lambdas.mass;

public class ssm {

    public static void main(String[] args) {

        Operacao ope = (a, b) -> a + b;
        System.out.println(ope.executar(3,4));

        ope = (a,b) -> a-b;
        System.out.println(ope.executar(3,4));

        ope = (a,b) -> a*b;
        System.out.println(ope.executar(3,4));
    }
}
