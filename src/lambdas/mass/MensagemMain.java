package lambdas.mass;

public class MensagemMain {

    public static void main(String[] args) {
        Mensagem m = texto -> System.out.println("Mensagem recebida: " + texto);
        m.enviar("Olá, mundo!");
    }
}
