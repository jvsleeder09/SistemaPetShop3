package br.shop.main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.shop.model.*;

public class TelaPet extends JFrame {

    private JPanel contentPane;
    private JTextField textNomePet;
    private JTextField textEspecie;
    private JTextField textRaca;
    private JTextField textIdade;
    private JTextField textPeso;
    private JTextField textNomeCliente;

    public TelaPet() {
    	setAlwaysOnTop(true);
        setTitle("Cadastro de Pet");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 821, 527);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Borda/Topo
        JPanel painelTopo = new JPanel();
        painelTopo.setBackground(new Color(100, 149, 237));
        painelTopo.setBounds(0, 0, 805, 45);
        painelTopo.setLayout(null);
        contentPane.add(painelTopo);

        JLabel lblTitulo = new JLabel("Cadastro de Pet");
        lblTitulo.setForeground(new Color(0, 0, 0));
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(0, 10, 795, 25);
        painelTopo.add(lblTitulo);

        // Preenchimento Campo Pet
        JLabel lblNomePet = new JLabel("Nome do Pet:");
        lblNomePet.setForeground(Color.WHITE);
        lblNomePet.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNomePet.setBounds(186, 90, 192, 24);
        contentPane.add(lblNomePet);

        textNomePet = new JTextField();
        textNomePet.setBounds(428, 80, 317, 34);
        textNomePet.setBackground(new Color(100, 149, 237));
        contentPane.add(textNomePet);

        // Preenchimento Campo Especie
        JLabel lblEspecie = new JLabel("Espécie:");
        lblEspecie.setForeground(Color.WHITE);
        lblEspecie.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblEspecie.setBounds(186, 144, 100, 20);
        contentPane.add(lblEspecie);

        textEspecie = new JTextField();
        textEspecie.setBounds(428, 130, 317, 34);
        textEspecie.setBackground(new Color(100, 149, 237));
        contentPane.add(textEspecie);

        // Preenchimento Campo Raca
        JLabel lblRaca = new JLabel("Raça:");
        lblRaca.setForeground(Color.WHITE);
        lblRaca.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblRaca.setBounds(186, 187, 100, 22);
        contentPane.add(lblRaca);

        textRaca = new JTextField();
        textRaca.setBounds(428, 175, 317, 34);
        textRaca.setBackground(new Color(100, 149, 237));
        contentPane.add(textRaca);
        
        // Preenchimento Campo Idade
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setForeground(Color.WHITE);
        lblIdade.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblIdade.setBounds(186, 233, 100, 24);
        contentPane.add(lblIdade);

        textIdade = new JTextField();
        textIdade.setBounds(428, 223, 317, 34);
        textIdade.setBackground(new Color(100, 149, 237));
        contentPane.add(textIdade);

        // Preenchimento Campo Peso
        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setForeground(Color.WHITE);
        lblPeso.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblPeso.setBounds(186, 289, 100, 20);
        contentPane.add(lblPeso);

        textPeso = new JTextField();
        textPeso.setBounds(428, 275, 317, 34);
        textPeso.setBackground(new Color(100, 149, 237));
        contentPane.add(textPeso);
        
        // Preenchimento Campo Cliente
        JLabel lblNomeCliente = new JLabel("Nome do Cliente:");
        lblNomeCliente.setForeground(Color.WHITE);
        lblNomeCliente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNomeCliente.setBounds(185, 334, 155, 20);
        contentPane.add(lblNomeCliente);

        textNomeCliente = new JTextField();
        textNomeCliente.setBounds(428, 320, 317, 34);
        textNomeCliente.setBackground(new Color(100, 149, 237));
        contentPane.add(textNomeCliente);
       
     // Botão para Voltar Principal
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setForeground(new Color(0, 0, 0));
        btnVoltar.setBounds(475, 396, 242, 30);
        btnVoltar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnVoltar.setBackground(new Color(65, 105, 225));
        getContentPane().add(btnVoltar);

        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // fechar
                dispose();
                // voltar principal
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }
        });
     
        // Botao Salvar e Validacoes das Info.
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setForeground(new Color(0, 0, 0));
        btnSalvar.setBackground(new Color(65, 105, 225));
        btnSalvar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnSalvar.setBounds(186, 396, 226, 30);
        btnSalvar.addActionListener((ActionEvent e) -> {
            String nomeCliente = textNomeCliente.getText().trim();
            Cliente cliente = BancoDeDadosFake.clientes.stream()
                    .filter(c -> c.getNome().equalsIgnoreCase(nomeCliente))
                    .findFirst()
                    .orElse(null);

            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                return;
            }

            try {
                String nomePet = textNomePet.getText().trim();
                String especie = textEspecie.getText().trim();
                String raca = textRaca.getText().trim();
                int idade = Integer.parseInt(textIdade.getText().trim());
                double peso = Double.parseDouble(textPeso.getText().trim());

                if (nomePet.isEmpty() || especie.isEmpty() || raca.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
                    return;
                }

                if (idade < 0 || peso <= 0) {
                    JOptionPane.showMessageDialog(null, "Idade e peso devem ser valores positivos.");
                    return;
                }

                Pet pet = new Pet(nomePet, especie, raca, idade, peso);
                cliente.adicionarPet(pet);
                JOptionPane.showMessageDialog(null, "Pet cadastrado com sucesso!");
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Idade e peso devem ser numéricos válidos.");
            }

        });
        contentPane.add(btnSalvar);
    }
}
