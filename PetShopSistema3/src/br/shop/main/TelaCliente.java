package br.shop.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.shop.model.Cliente;
import br.shop.model.BancoDeDadosFake;

public class TelaCliente extends JFrame {

    private JPanel contentPane;
    private JTextField textNome;
    private JTextField textTelefone;
    private JTextField textEmail;

    public TelaCliente() {
    	setAlwaysOnTop(true);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 822, 527);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Borda/Topo
        JPanel painelTopo = new JPanel();
        painelTopo.setBackground(new Color(100, 149, 237));
        painelTopo.setBounds(0, 0, 806, 49);
        painelTopo.setLayout(null);
        contentPane.add(painelTopo);

        JLabel lblTitulo = new JLabel("Cadastro de Cliente");
        lblTitulo.setForeground(new Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
        lblTitulo.setBounds(0, 5, 806, 44);
        painelTopo.add(lblTitulo);

     // Preenchimento Campo Cliente
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setForeground(Color.WHITE);
        lblNome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        lblNome.setBounds(179, 119, 94, 20);
        contentPane.add(lblNome);

        textNome = new JTextField();
        textNome.setBounds(321, 110, 404, 32);
        textNome.setBackground(new Color(100, 149, 237));
        contentPane.add(textNome);

     // Preenchimento Campo Telefone
        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setForeground(Color.WHITE);
        lblTelefone.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        lblTelefone.setBounds(179, 183, 94, 32);
        contentPane.add(lblTelefone);

        textTelefone = new JTextField();
        textTelefone.setBounds(321, 182, 404, 32);
        textTelefone.setBackground(new Color(100, 149, 237));
        contentPane.add(textTelefone);

     // Preenchimento Campo Email
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        lblEmail.setBounds(179, 255, 79, 32);
        contentPane.add(lblEmail);

        textEmail = new JTextField();
        textEmail.setBounds(321, 254, 404, 32);
        textEmail.setBackground(new Color(100, 149, 237));
        contentPane.add(textEmail);

      /// Botão para Voltar Principal
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setForeground(new Color(0, 0, 0));
        btnVoltar.setBounds(469, 349, 256, 50);
        btnVoltar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnVoltar.setBackground(new Color(65, 105, 225));
        getContentPane().add(btnVoltar);

        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//fechar
                dispose();
                //voltar principal
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }
        });
        
        // Botao Salvar e Validacoes de Info.
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setForeground(new Color(0, 0, 0));
        btnSalvar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnSalvar.setBackground(new Color(65, 105, 225));
        btnSalvar.setBounds(179, 350, 256, 49);
        contentPane.add(btnSalvar); 

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText().trim();
                String telefone = textTelefone.getText().trim();
                String email = textEmail.getText().trim();

                if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "⚠️ Preencha todos os campos.");
                    return;
                }

                if (!telefone.matches("\\d{8,}")) {
                    JOptionPane.showMessageDialog(null, "⚠️ Telefone deve conter ao menos 8 números.");
                    return;
                }

                if (!email.contains("@") || !email.contains(".")) {
                    JOptionPane.showMessageDialog(null, "⚠️ E-mail inválido.");
                    return;
                }

                Cliente cliente = new Cliente(nome, telefone, email);
                BancoDeDadosFake.clientes.add(cliente);
                JOptionPane.showMessageDialog(null, "✅ Cliente cadastrado com sucesso!");
                dispose();
            }
        });
    }

   
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TelaCliente frame = new TelaCliente();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
