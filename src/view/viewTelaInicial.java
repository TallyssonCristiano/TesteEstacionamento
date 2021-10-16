package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import application.SistemaEstacionamento;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class viewTelaInicial {

	private JFrame frmEstacionamentoTruepark;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTelaInicial window = new viewTelaInicial();
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
	public viewTelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEstacionamentoTruepark = new JFrame();
		frmEstacionamentoTruepark.setFont(new Font("Arial Black", Font.BOLD, 14));
		frmEstacionamentoTruepark.setTitle("Estacionamento TruePark");
		frmEstacionamentoTruepark.setBounds(100, 100, 583, 471);
		frmEstacionamentoTruepark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEstacionamentoTruepark.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setShowVerticalLines(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(17, 61, 456, 254);
		frmEstacionamentoTruepark.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(130, 33, 55, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(250, 33, 55, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(17, 33, 55, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de entrada");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(373, 33, 100, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(465, 6, 55, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(16, 385, 138, 28);
		frmEstacionamentoTruepark.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Modelo");
		lblNewLabel_5.setBounds(61, 410, 55, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 385, 132, 28);
		frmEstacionamentoTruepark.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Placa");
		lblNewLabel_6.setBounds(202, 410, 55, 16);
		frmEstacionamentoTruepark.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Novo Cadastro");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(299, 374, 132, 39);
		frmEstacionamentoTruepark.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(17, 59, 88, 254);
		frmEstacionamentoTruepark.getContentPane().add(list);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
