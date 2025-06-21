package br.shop.model;

public class Adestramento extends Servico {
    private int sessoes;
    private double precoPorSessao;

    public Adestramento(int sessoes, double precoPorSessao) {
        super("Adestramento");
        this.sessoes = sessoes;
        this.precoPorSessao = precoPorSessao;
    }

    @Override
    public double calcularPreco() {
        return sessoes * precoPorSessao;
    }
}
