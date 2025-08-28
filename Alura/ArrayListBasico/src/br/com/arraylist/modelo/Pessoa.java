package br.com.arraylist.modelo;

public class Pessoa {

    private String nome;
    private int idade;
    private int altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome da pessoa: " + getNome() +  "\nIdade: " + getIdade() + "\nAltura: " + getAltura();
    }
}
