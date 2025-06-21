package br.shop.main;

import br.shop.model.*;
import br.shop.agendamento.Agendamento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaServico extends JFrame {

    private JTextField textCliente;
    private JTextField textPet;
    private JTextField textData;
    private JTextField textHora;
    private JComboBox<String> comboServico;

    public TelaServico() {
        setTitle("Agendamento de Serviço");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(822, 527);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);

        // Preenchimento Campo Cliente
        JLabel lblCliente = new JLabel("Nome do Cliente:");
        lblCliente.setForeground(Color.WHITE);
        lblCliente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblCliente.setBounds(163, 86, 166, 25);
        getContentPane().add(lblCliente);

        textCliente = new JTextField();
        textCliente.setForeground(new Color(0, 0, 0));
        textCliente.setHorizontalAlignment(SwingConstants.CENTER);
        textCliente.setBounds(426, 76, 280, 35);
        textCliente.setBackground(new Color(100, 149, 237));
        textCliente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        getContentPane().add(textCliente);

        // Preenchimento Campo Pet
        JLabel lblPet = new JLabel("Nome do Pet:");
        lblPet.setForeground(Color.WHITE);
        lblPet.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblPet.setBounds(163, 132, 140, 25);
        getContentPane().add(lblPet);

        textPet = new JTextField();
        textPet.setForeground(new Color(0, 0, 0));
        textPet.setHorizontalAlignment(SwingConstants.CENTER);
        textPet.setBounds(426, 122, 280, 35);
        textPet.setBackground(new Color(100, 149, 237));
        textPet.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        getContentPane().add(textPet);

        // Preenchimento Campo Servico
        JLabel lblServico = new JLabel("Tipo de Serviço:");
        lblServico.setForeground(Color.WHITE);
        lblServico.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblServico.setBounds(163, 178, 194, 25);
        getContentPane().add(lblServico);

        comboServico = new JComboBox<>(new String[]{"Banho e Tosa", "Consulta Veterinária", "Hospedagem", "Adestramento"});
        comboServico.setForeground(new Color(0, 0, 0));
        comboServico.setBackground(new Color(100, 149, 237));
        comboServico.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        comboServico.setBounds(426, 168, 280, 35);
        getContentPane().add(comboServico);

        // Preenchimento Data
        JLabel lblData = new JLabel("Data (DD/MM/AAAA):");
        lblData.setForeground(Color.WHITE);
        lblData.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblData.setBounds(163, 224, 194, 25);
        getContentPane().add(lblData);

        textData = new JTextField();
        textData.setForeground(new Color(0, 0, 0));
        textData.setBounds(426, 214, 280, 35);
        textData.setBackground(new Color(100, 149, 237));
        textData.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        getContentPane().add(textData);

        // Preenchimento Hora
        JLabel lblHora = new JLabel("Hora (HH:MM):");
        lblHora.setForeground(Color.WHITE);
        lblHora.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblHora.setBounds(163, 270, 156, 25);
        getContentPane().add(lblHora);

        textHora = new JTextField();
        textHora.setForeground(new Color(0, 0, 0));
        textHora.setBounds(426, 260, 280, 35);
        textHora.setBackground(new Color(100, 149, 237));
        textHora.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        getContentPane().add(textHora);

        // Botão para Agendar
        JButton btnAgendar = new JButton("Agendar");
        btnAgendar.setForeground(new Color(0, 0, 0));
        btnAgendar.setBounds(163, 343, 244, 50);
        btnAgendar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnAgendar.setBackground(new Color(65, 105, 225));
        getContentPane().add(btnAgendar);
        
        // Botão para Voltar Principal
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setForeground(new Color(0, 0, 0));
        btnVoltar.setBounds(450, 343, 256, 50);  // Ajusta a posição que preferir
        btnVoltar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnVoltar.setBackground(new Color(65, 105, 225));
        getContentPane().add(btnVoltar);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(100, 149, 237));
        panel.setBounds(0, 0, 806, 50);
        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Agendamento de Serviço ");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel);
        lblNewLabel.setBackground(new Color(100, 149, 237));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));

        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // fechar
                dispose();
                // voltar principal
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }
        });

        // Validacoes para confirmacao das info.
        btnAgendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeCliente = textCliente.getText().trim();
                String nomePet = textPet.getText().trim();
                String tipo = (String) comboServico.getSelectedItem();
                String data = textData.getText().trim();
                String hora = textHora.getText().trim();

                if(data.isEmpty() || hora.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Informe a data e a hora.");
                    return;
                }

                String dataHora = data + " " + hora;

                Cliente cliente = BancoDeDadosFake.clientes.stream()
                        .filter(c -> c.getNome().equalsIgnoreCase(nomeCliente))
                        .findFirst().orElse(null);

                if (cliente == null) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    return;
                }

                Pet pet = cliente.buscarPetPorNome(nomePet);
                if (pet == null) {
                    JOptionPane.showMessageDialog(null, "Pet não encontrado.");
                    return;
                }

                Servico servico = null;
                switch (tipo) {
                    case "Banho e Tosa":
                        String porte = JOptionPane.showInputDialog("Porte (Pequeno/Médio/Grande):");
                        servico = new BanhoETosa(porte);
                        break;
                    case "Consulta Veterinária":
                        String esp = JOptionPane.showInputDialog("Especialidade da consulta:");
                        servico = new ConsultaVeterinaria(esp);
                        break;
                    case "Hospedagem":
                        try {
                            int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias:"));
                            double diaria = Double.parseDouble(JOptionPane.showInputDialog("Preço por diária:"));
                            servico = new Hospedagem(dias, diaria);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Número inválido para dias ou diária.");
                            return;
                        }
                        break;
                    case "Adestramento":
                        try {
                            int sessoes = Integer.parseInt(JOptionPane.showInputDialog("Número de sessões:"));
                            double precoSessao = Double.parseDouble(JOptionPane.showInputDialog("Preço por sessão:"));
                            servico = new Adestramento(sessoes, precoSessao);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Número inválido para sessões ou preço.");
                            return;
                        }
                        break;
                }

                if (servico != null) {
                    BancoDeDadosFake.agendamentos.add(new Agendamento(cliente, pet, servico, dataHora));
                    JOptionPane.showMessageDialog(null, "Serviço agendado com sucesso!");
                    dispose();
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Dados incompletos para agendar.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaServico().setVisible(true);
    }
}
