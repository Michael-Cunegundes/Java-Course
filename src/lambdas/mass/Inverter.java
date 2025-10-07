package lambdas.mass;

public class Inverter {

    public static void main(String[] args) {

        Transformador inverter = s -> new StringBuilder(s).reverse().toString();

        System.out.println(inverter.transformar("pastaaa"));
    }
}
