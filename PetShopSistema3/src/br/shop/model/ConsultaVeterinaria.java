package br.shop.model;

public class ConsultaVeterinaria extends Servico {
    private String especialidade;

    public ConsultaVeterinaria(String especialidade) {
        super("Consulta Veterinária");
        this.especialidade = especialidade;
    }

    @Override
    public double calcularPreco() {
        return 80;
    }
}
