package br.shop.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCliente;
	private JTextField txtOlSejaBemvindo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Botao Cadastro Cliente
		btnCliente = new JButton("Cadastrar Cliente");
		btnCliente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnCliente.setBackground(new Color(255, 255, 255));
		btnCliente.setBounds(128, 142, 230, 53);
		contentPane.add(btnCliente);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCliente tela = new TelaCliente();
				tela.setVisible(true);
			}
		});

		//Botao Cadastro Pet
		JButton btnPet = new JButton("Cadastrar Pet");
		btnPet.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnPet.setBackground(new Color(255, 255, 255));
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPet.setBounds(482, 142, 236, 53);
		contentPane.add(btnPet);
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPet tela = new TelaPet();
				tela.setVisible(true);
			}
		});

		
		//Botao Agendar Servico
		JButton btnServico = new JButton("Agendar Serviço ");
		btnServico.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnServico.setBackground(new Color(255, 250, 250));
		btnServico.setBounds(128, 242, 230, 53);
		contentPane.add(btnServico);
		btnServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaServico tela = new TelaServico();
				tela.setVisible(true);
			}
		}); 

		//Botao Sair (para fechar a tela inicial)
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnSair.setBackground(new Color(255, 255, 255));
		btnSair.setBounds(482, 349, 236, 53);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Botao listar agendamentos
		JButton btnListarAgendamentos = new JButton("Listar Agendamentos");
		btnListarAgendamentos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnListarAgendamentos.setBackground(new Color(255, 255, 255));
		btnListarAgendamentos.setBounds(482, 242, 236, 53);
		contentPane.add(btnListarAgendamentos);

		btnListarAgendamentos.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        TelaListarAgendamentos tela = new TelaListarAgendamentos();
		        tela.setVisible(true);
		    }
		});

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 809, 44);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("PetTech Hub");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setForeground(new Color(0, 0, 0));
						
								
								txtOlSejaBemvindo = new JTextField();
								txtOlSejaBemvindo.setHorizontalAlignment(SwingConstants.CENTER);
								txtOlSejaBemvindo.setBounds(45, 65, 722, 34);
								contentPane.add(txtOlSejaBemvindo);
								txtOlSejaBemvindo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
								txtOlSejaBemvindo.setForeground(new Color(0, 0, 0));
								txtOlSejaBemvindo.setBackground(new Color(100, 149, 237));
								txtOlSejaBemvindo.setText("Seja bem-vindo. O que gostaria de fazer primeiro?");
								txtOlSejaBemvindo.setColumns(35);
								
								JButton btnCancelar = new JButton("Cancelar Serviço ");
								btnCancelar.setBackground(new Color(255, 255, 255));
								btnCancelar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
								btnCancelar.setBounds(128, 349, 230, 53);
								contentPane.add(btnCancelar);
								btnCancelar.addActionListener(new ActionListener() {
								    public void actionPerformed(ActionEvent e) {
								        TelaCancelarServico tela = new TelaCancelarServico();
								        tela.setVisible(true);
								    }
								});

	}
}
