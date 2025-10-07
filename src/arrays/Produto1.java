package exercicios2;

import java.util.Scanner;

public class Produto1 {

    private String nome;
    private double preco;
    private double percentualDesconto;

    public Produto1() {
    }

    public Produto1(String nome, double preco, double percentualDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.percentualDesconto = percentualDesconto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularDesc(Double percentualDesconto) {
        double precofinal = (preco * percentualDesconto) / 100;
        return preco - precofinal;
    }

    public String fina() {
        return String.format("\nNome do produto: %s\n" +
                "Preco: %.2f\n" +
                "preco com desconto: %.2f", nome, preco, calcularDesc(percentualDesconto));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQual o nome do produto?: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço inicial do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();
        scanner.nextLine();

        Produto1 produto1 = new Produto1(nome, preco, percentualDesconto);

        System.out.println(produto1.fina());

        scanner.close();


    }

}
