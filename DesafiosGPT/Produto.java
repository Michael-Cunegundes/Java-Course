package oo.DesafiosGPT;

public class Produto {

    private String nome;
    private double preco;
    private double percentualDesconto;

    public Produto() {
    }

    public Produto(String nome, double preco, double percentualDesconto) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }

        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Percentual de desconto deve estar entre 0 e 100");
        }

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

    public double getPercentualDesconto() {
        return percentualDesconto;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 100");
        }
        return (preco * percentual) / 100;

    }

    public double calcularPrecoComDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 100");
        }
        return preco - calcularDesconto(percentual);
    }

    public String descricao() {
        return String.format("\nNome do produto: %s\nPreço original: R$ %.2f\nDesconto de %.0f%% aplicado que da: %.2f\nPreco final: %.2f ", nome, preco, percentualDesconto, preco - calcularPrecoComDesconto(percentualDesconto), calcularPrecoComDesconto(percentualDesconto));

    }

}
