package br.shop.main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import br.shop.model.BancoDeDadosFake;
import br.shop.agendamento.Agendamento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaListarAgendamentos extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;

    public TelaListarAgendamentos() {
        setTitle("Lista de Agendamentos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 822, 574);
        setLocationRelativeTo(null); // centralizar a janela
        contentPane = new JPanel();
        contentPane.setBackground(new Color(100, 149, 237));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Agendamentos Registrados");
        lblTitulo.setBounds(10, 10, 786, 31);
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo);
        
        // Botão para Voltar Principal
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setForeground(new Color(0, 0, 0));
        btnVoltar.setBounds(426, 480, 340, 43);
        btnVoltar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
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


        // Tabelas de dados
        String[] colunas = {"Cliente", "Pet", "Serviço", "Data e Hora"};
        tableModel = new DefaultTableModel(colunas, 0);
        table = new JTable(tableModel);
        table.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        table.setBackground(new Color(255, 255, 255));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(39, 71, 726, 382);
        contentPane.add(scrollPane);

        // Botão para atualizar tabela de dados
        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(39, 480, 340, 43);
        btnAtualizar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        btnAtualizar.setBackground(new Color(65, 105, 225));
        btnAtualizar.setForeground(Color.BLACK);
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarTabela();
            }
        });

        contentPane.add(btnAtualizar);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(20, 52, 20, 417);
        contentPane.add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(765, 52, 20, 417);
        contentPane.add(panel_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 0, 0));
        panel_2.setBounds(20, 450, 765, 19);
        contentPane.add(panel_2);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(Color.BLACK);
        panel_2_1.setBounds(20, 52, 765, 19);
        contentPane.add(panel_2_1);
       
    }
    
    //Validacoes de info
    private void atualizarTabela() {
        tableModel.setRowCount(0); // limpar a tabela

        for (Agendamento ag : BancoDeDadosFake.agendamentos) {
            Object[] linha = {
                ag.getCliente().getNome(),
                ag.getPet().getNome(),
                ag.getServico().getNome(),
                ag.getDataHora()
            };
            tableModel.addRow(linha);
        }

        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum agendamento cadastrado.");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TelaListarAgendamentos frame = new TelaListarAgendamentos();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
