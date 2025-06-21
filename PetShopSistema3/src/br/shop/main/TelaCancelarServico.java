package br.shop.main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import br.shop.model.BancoDeDadosFake;
import br.shop.agendamento.Agendamento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCancelarServico extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<String> listaAgendamentos;
    private DefaultListModel<String> modeloLista;
    private java.util.List<Agendamento> agendamentosRef;

    public TelaCancelarServico() {
    	setAlwaysOnTop(true);
        setTitle("Cancelar Serviço");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 822, 527);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(100, 149, 237));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
       // Cancelar um Servico
        JLabel lblTitulo = new JLabel("Selecione um serviço para cancelar");
        lblTitulo.setForeground(new Color(0, 0, 0));
        lblTitulo.setBounds(10, 10, 786, 40);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
        contentPane.add(lblTitulo);


        modeloLista = new DefaultListModel<>();
        listaAgendamentos = new JList<>(modeloLista);
        listaAgendamentos.setForeground(new Color(0, 0, 0));
        listaAgendamentos.setValueIsAdjusting(true);
        listaAgendamentos.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 15));
        JScrollPane scrollPane = new JScrollPane(listaAgendamentos);
        scrollPane.setBounds(33, 71, 734, 333);
        contentPane.add(scrollPane);

        // Botao de Cancelamento
        JButton btnCancelar = new JButton("Cancelar Serviço Selecionado");
        btnCancelar.setForeground(new Color(0, 0, 0));
        btnCancelar.setBounds(23, 426, 376, 51);
        btnCancelar.setBackground(new Color(65, 105, 225));
        btnCancelar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = listaAgendamentos.getSelectedIndex();
                if (index != -1) {
                    Agendamento a = agendamentosRef.get(index);
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Deseja cancelar este serviço?\n" + a.toString(),
                            "Confirmação",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        BancoDeDadosFake.agendamentos.remove(a);
                        JOptionPane.showMessageDialog(null, "Serviço cancelado com sucesso.");
                        atualizarLista();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um serviço na lista.");
                }
            }
        });
        contentPane.add(btnCancelar);
        
        //Botao Voltar Principal e Validacoes de Info.
        JButton btnVoltar = new JButton("Voltar");  
        btnVoltar.setForeground(new Color(0, 0, 0));
        btnVoltar.setBounds(419, 426, 357, 51);
        contentPane.add(btnVoltar);
        btnVoltar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        btnVoltar.setBackground(new Color(65, 105, 225));
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(13, 58, 20, 362);
        contentPane.add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(766, 58, 20, 362);
        contentPane.add(panel_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 0, 0));
        panel_2.setBounds(20, 404, 766, 16);
        contentPane.add(panel_2);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(Color.BLACK);
        panel_2_1.setBounds(20, 58, 766, 16);
        contentPane.add(panel_2_1);
        
                btnVoltar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	//fechar
                        dispose();
                        //voltar principal
                        MenuPrincipal menu = new MenuPrincipal();
                        menu.setVisible(true);
                    }
                });

        atualizarLista();
    }

    private void atualizarLista() {
        modeloLista.clear();
        agendamentosRef = BancoDeDadosFake.agendamentos;

        if (agendamentosRef.isEmpty()) {
            modeloLista.addElement("Nenhum agendamento encontrado.");
        } else {
            for (Agendamento a : agendamentosRef) {
                modeloLista.addElement("🐾 " + a.getPet().getNome() + " - " + a.getServico().getNome() + " em " + a.getDataHora());
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TelaCancelarServico frame = new TelaCancelarServico();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
