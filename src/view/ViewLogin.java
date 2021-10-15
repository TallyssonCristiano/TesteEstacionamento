package view;

import java.awt.EventQueue;

import entities.Veiculo;
import entities.Usuario;
import entities.Estacionamento;
import application.SistemaEstacionamento;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(120, 126, 48, 14);
		panel.add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(120, 151, 316, 41);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(120, 217, 48, 14);
		panel.add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 252, 316, 41);
		panel.add(txtSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema ");
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados incorretos");
				}
			}
		});
		btnNewButton.setBounds(232, 317, 108, 41);
		panel.add(btnNewButton);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("admin") && senha.equals("123456");
	}
}
