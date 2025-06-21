package br.shop.model;

public class Hospedagem extends Servico {
    private int diarias;
    private double precoPorDia;

    public Hospedagem(int diarias, double precoPorDia) {
        super("Hospedagem");
        this.diarias = diarias;
        this.precoPorDia = precoPorDia;
    }

    @Override
    public double calcularPreco() {
        return diarias * precoPorDia;
    }
}
