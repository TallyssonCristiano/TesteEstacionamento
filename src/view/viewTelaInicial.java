package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import application.SistemaEstacionamento;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class viewTelaInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTelaInicial window = new viewTelaInicial();
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
	public viewTelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Estacionamento\r\nVagas\r\nUsuarios");
		comboBox.setBounds(10, 11, 78, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Novo Cadastro");
		btnNewButton.setBounds(428, 392, 129, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
