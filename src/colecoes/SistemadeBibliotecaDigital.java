package colecoes;

import java.util.*;

public class SistemadeBibliotecaDigital {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int comando = 5;

        System.out.println("\n----------------------------------------------");
        System.out.println("Bem-vindo(a) a nossa biblioteca\uD83D\uDCDA");
        System.out.println("----------------------------------------------");

        ArrayList<Livro> Biblioteca = new ArrayList<>();
        Queue<Livro> Devolucao = new LinkedList<>();
        Map<String, Livro> Busca = new HashMap<>();

        Livro l1 = new Livro("Memorias postumas de Bras Cubas", "Machado de Assis", 1263);
        Livro l2 = new Livro("O apanhador no campo de centeio", "J.D. Salinger", 4326);
        Livro l3 = new Livro("Crime e Castigo", "Dostoievski", 7899);
        Livro l4 = new Livro("ABC", "Edson Arantes Do Nacismento", 1000);
        Livro l5 = new Livro("Orgulho e Preconceito", "Jane Austen", 4395);

        Biblioteca.add(l1);
        Biblioteca.add(l2);
        Biblioteca.add(l3);
        Biblioteca.add(l4);
        Biblioteca.add(l5);

        while (comando != 0) {

            System.out.print("\n📞 Digite:\n 1 para Ver livros disponíveis\n 2 para Pegar um livro emprestado\n 3 para Devolver um livro \n 4 para Buscar um livro pelo título \n 0 para sair do sistema: ");
            comando = input.nextInt();
            input.nextLine();


            Collections.sort(Biblioteca);

            if (comando == 1) {
                System.out.print("\nLivros disponiveis em ordem alfabetica: ");
                for (Livro livro : Biblioteca) {
                    System.out.print(livro);
                }
                continue;

            }

            if (comando == 2) {

                Busca.put(l1.getTituloDoLivro().toLowerCase(), l1);
                Busca.put(l2.getTituloDoLivro().toLowerCase(), l2);
                Busca.put(l3.getTituloDoLivro().toLowerCase(), l3);
                Busca.put(l4.getTituloDoLivro().toLowerCase(), l4);
                Busca.put(l5.getTituloDoLivro().toLowerCase(), l5);

                System.out.print("\n\uD83D\uDD0EDigite o livro que deseja pegar emprestado: ");
                String emprestado = input.nextLine().toLowerCase();

                if (Busca.containsKey(emprestado)){
                    Livro livroEncontrado = Busca.get(emprestado);
                    System.out.println("Livro encontrado: " + livroEncontrado.getTituloDoLivro() + "\uD83D\uDCDA Você pode pegá-lo emprestado. Boa leitura");
                } else {
                    System.out.println("Livro nao encontrado");
                }
                continue;
            }


            System.out.print("\uD83D\uDD0EDigite o livro para ver se esta alugado ou nao: ");
            String livroBuscado = input.nextLine().toLowerCase();

            boolean encontrado = false;

            for (Livro livro : Biblioteca) {
                if (livro.getTituloDoLivro().equalsIgnoreCase(livroBuscado)) {

                    System.out.println("✅ O livro '" + livro.getTituloDoLivro() + "' está disponível!");
                    encontrado = true;

                    Biblioteca.remove(livro);
                    Devolucao.offer(livro);

                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Livro nao disponivel no momento");
            }

            HashSet<String> livrosEmprestados = new HashSet<>();
            livrosEmprestados.add(livroBuscado);

            System.out.println("\nlivros emprestados no momento: " + livrosEmprestados);


            input.close();
        }

    }

}
