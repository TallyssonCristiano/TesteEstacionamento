package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import statement.ConexaoBancoDeDados2;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {
	

	private JFrame frmEstacionamentoTruepark;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frmEstacionamentoTruepark.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ConexaoBancoDeDados2 conexaoBDD = new ConexaoBancoDeDados2();
		frmEstacionamentoTruepark = new JFrame();
		frmEstacionamentoTruepark.setTitle("Estacionamento TruePark");
		frmEstacionamentoTruepark.setBounds(100, 100, 610, 453);
		frmEstacionamentoTruepark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEstacionamentoTruepark.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel loginPanel = new JPanel();
		frmEstacionamentoTruepark.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(120, 126, 48, 14);
		loginPanel.add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(120, 151, 316, 41);
		loginPanel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(120, 217, 48, 14);
		loginPanel.add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 252, 316, 41);
		loginPanel.add(txtSenha);
		
		String login = txtLogin.getText();
		String senha = new String(txtSenha.getPassword());
		
		btnNewButton = new JButton("Acessar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(conexaoBDD.checkLogin(login, senha)) {	
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema! ");
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados incorretos");
				}
			}
		});
		btnNewButton.setBounds(144, 305, 113, 50);
		loginPanel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (conexaoBDD.checkAdmin(login, senha)) {
				}
				
			}

		});
		btnNewButton_1.setBounds(285, 305, 119, 50);
		loginPanel.add(btnNewButton_1);
	}	
}
