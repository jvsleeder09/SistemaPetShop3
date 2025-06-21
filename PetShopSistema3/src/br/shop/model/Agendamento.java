package br.shop.model;

public class Agendamento {
    private Cliente cliente;
    private Pet pet;
    private Servico servico;
    private String dataHora;

    public Agendamento(Cliente cliente, Pet pet, Servico servico, String dataHora) {
        this.cliente = cliente;
        this.pet = pet;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public Servico getServico() {
        return servico;
    }

    public String getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "📅 Agendamento\n" +
               "👤 Cliente: " + cliente.getNome() + "\n" +
               "🐾 Pet: " + pet.getNome() + "\n" +
               "🛠️ Serviço: " + servico.getNome() + "\n" +
               "💰 Preço: R$" + String.format("%.2f", servico.calcularPreco()) + "\n" +
               "🕒 Data: " + dataHora;
    }

}
