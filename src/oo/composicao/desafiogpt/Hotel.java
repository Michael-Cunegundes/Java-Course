package oo.composicao.desafiogpt;

public class Hotel {

    public static void main(String[] args) {

        Reserva reserva1 = new Reserva();
        reserva1.adicionarItemReserva(new Quarto(101, 250),5);

        Hospede JoãoPedro = new Hospede("João Pedro");
        JoãoPedro.reservas.add(reserva1);

        Reserva reserva2 = new Reserva();
        reserva2.adicionarItemReserva(new Quarto(305, 320),3);
        JoãoPedro.reservas.add(reserva2);

        System.out.println("\nHóspede: " + JoãoPedro.nome + "\nQuartos reservados:\n" + JoãoPedro.reservas.get(0));
        System.out.println(JoãoPedro.reservas.get(1));
        System.out.println("Valor total da estadia: R$ " + JoãoPedro.obterValorTotalEstadia());

        Hospede MariaClara = new Hospede("Maria Clara");

        Reserva reserva3 = new Reserva();
        reserva3.adicionarItemReserva(new Quarto(210, 180), 7);
        MariaClara.reservas.add(reserva3);

        System.out.println("\nHóspede: " + MariaClara.nome + "\nQuartos reservados:\n" + MariaClara.reservas.get(0));
        System.out.println("Valor total da estadia: R$ " + MariaClara.obterValorTotalEstadia());



//        Locacao locacao2 = new Locacao();
//        locacao2.adicionarItemLocacao(new Veiculo("BYD", "Seal", 150.00),3);
//        cliente.locacoes.add(locacao2);

    }
}
