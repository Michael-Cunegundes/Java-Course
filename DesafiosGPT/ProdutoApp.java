package oo.DesafiosGPT;

import java.util.Scanner;

public class ProdutoApp {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[10];

        int continuar = 1;
        int c = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-------------------------------------------");
        System.out.println("Bem-vindo ao sistema de cadastro de produtos!");
        System.out.println("Você pode cadastrar até 10 produtos.");

        do {

            if (continuar == 1) {

                if (c >= produtos.length) {
                    System.out.println("Limite de produtos cadastrados atingido.");
                    break;
                }

                System.out.print("\nDigite o nome do " + (c + 1) + "º produto: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o preço inicial do produto: R$ ");
                double preco = scanner.nextDouble();

                System.out.print("Digite o percentual de desconto: ");
                double percentualDesconto = scanner.nextDouble();
                scanner.nextLine();

                Produto produto = new Produto(nome, preco, percentualDesconto);

                DescontoService descontoService = new DescontoService();
                double precoComDesconto = descontoService.calcularDescontoAplicado(produto, percentualDesconto);


                if (c < produtos.length) {
                    produtos[c] = produto;
                    c++;
                    System.out.println("\nProduto " + produto.getNome() + " cadastrado com sucesso");
                } else {
                    System.out.println("Limite de produtos cadastrados atingido.");
                }
            }


            System.out.println("\nvoce tem " + c + " produtos cadastrados. Voce pode cadastrar ate 10 produtos. ");
            System.out.println("\n-------------------------------------------");
            System.out.print("Digite:\n'1' para cadastrar outro produto\n" +
                    "'2' para ver seus produtos cadastrados" +
                    "\n'3' para remover um produto cadastrado" +
                    "\n'4' para sair" +
                    "\n" + " Escolha: ");


            try {
                continuar = scanner.nextInt();
                scanner.nextLine();

                if (continuar != 1 && continuar != 2 && continuar != 3 && continuar != 4) {
                    System.out.println("\nDigite uma opção válida: 1, 2, 3 ou 4");
                    continue;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nPor favor, digite apenas números (1, 2, 3 ou 4)");
                scanner.nextLine();
                continue;
            }

            if (continuar == 2) {
                System.out.println("\nVoce tem " + c + " Produtos cadastrados:");
                double total = 0;

                for (int i = 0; i < c; i++) {
                    System.out.println(produtos[i].descricao());
                    total += produtos[i].calcularPrecoComDesconto(produtos[i].getPercentualDesconto());

                }
                System.out.println("\nPreco total final: R$ " + total);


            }

            if (continuar == 3) {

                for (int i = 0; i < c; i++) {
                    System.out.println((i + 1) + " - " + produtos[i].getNome());
                }

                System.out.println("\nDigite o nome do produto que deseja remover: ");
                String nomeRemover = scanner.nextLine();
                boolean encontrado = false;


                for (int i = 0; i < c; i++) {
                    if (produtos[i].getNome().equalsIgnoreCase(nomeRemover)) {
                        produtos[i] = null;
                        encontrado = true;
                        System.out.println("Produto " + nomeRemover + " removido com sucesso.");
                        c--;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto " + nomeRemover + " não encontrado.");
                }
            }

        } while (continuar != 4);
        System.out.println("\n-------------------------------------------");
        System.out.println("Lista de compra:\n");
        for (int i = 0; i < c; i++) {
            System.out.print(produtos[i].getNome() + "      ");
        }
        double total = 0;

        for (int i = 0; i < c; i++) {
            total += produtos[i].calcularPrecoComDesconto(produtos[i].getPercentualDesconto());

        }
        System.out.printf("\n\nPreco final: R$ %.2f", total);
        System.out.println("\n-------------------------------------------");
        System.out.println("\nSaindo do programa...");


        scanner.close();
    }
}
