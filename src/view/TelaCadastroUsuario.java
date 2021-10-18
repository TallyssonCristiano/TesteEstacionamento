package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class TelaCadastroUsuario {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JPasswordField txtRepetirSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario window = new TelaCadastroUsuario();
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
	public TelaCadastroUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 30, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 94, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(90, 30, 152, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(90, 60, 152, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(90, 90, 152, 20);
		frame.getContentPane().add(txtSenha);
		
		txtRepetirSenha = new JPasswordField();
		txtRepetirSenha.setBounds(90, 120, 152, 20);
		frame.getContentPane().add(txtRepetirSenha);
		
		JLabel lblNewLabel_2 = new JLabel("Repetir senha");
		lblNewLabel_2.setBounds(15, 125, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(25, 63, 48, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		Button button = new Button("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(134, 172, 70, 22);
		frame.getContentPane().add(button);
	}
}
