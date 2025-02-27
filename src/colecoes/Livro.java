package colecoes;

public class Livro implements Comparable<Livro> { // Implementação de Comparable
    public String tituloDoLivro;
    public String autorDoLivro;
    public int idLivro;  // Usando long para um ID único

    // Construtor
    public Livro(String tituloDoLivro, String autorDoLivro, int idLivro) {
        this.tituloDoLivro = tituloDoLivro;
        this.autorDoLivro = autorDoLivro;
        this.idLivro = idLivro;
    }

    // Método Getter
    public String getTituloDoLivro() {
        return tituloDoLivro;
    }

    public int getiDLivro() {
        return getiDLivro();
    }

    // Implementação da ordenação por título (ordem alfabética)
    @Override
    public int compareTo(Livro outroLivro) {
        return this.tituloDoLivro.compareToIgnoreCase(outroLivro.getTituloDoLivro());
    }

    // Método toString para exibição formatada
    @Override
    public String toString() {
        return String.format("\n📖 Título: %s\n✍️ Autor: %s\n🆔 ID: %d\n", tituloDoLivro, autorDoLivro, idLivro);
    }
}
