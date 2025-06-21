package br.shop.model;

public abstract class Servico {
    private String nome;

    public Servico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPreco();

    @Override
    public String toString() {
        return nome + " - R$" + calcularPreco();
    }
}
