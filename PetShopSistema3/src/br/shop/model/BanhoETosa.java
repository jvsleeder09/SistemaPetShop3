package br.shop.model;

public class BanhoETosa extends Servico {
    private String porte;

    public BanhoETosa(String porte) {
        super("Banho e Tosa");
        this.porte = porte;
    }

    @Override
    public double calcularPreco() {
        switch (porte.toLowerCase()) {
            case "pequeno": return 30;
            case "medio": return 45;
            case "grande": return 60;
            default: return 40;
        }
    }
}
