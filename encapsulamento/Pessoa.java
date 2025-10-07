package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 105) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Ola eu sou o " + getNome()
                + " tenho " + getIdade() + " anos";
    }

    public String getNomeCompleto (){
        return getNome() + " " + getSobrenome();
    }
}
