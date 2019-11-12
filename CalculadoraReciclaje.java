import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class CalculadoraReciclaje extends JFrame {

	private JPanel contentPane;
	private JTextField txtGananciasCalculadora;
	private TextArea textArea;
	private TextArea textArea_2;
	private TextArea textArea_1;
	private Aplicacion aplicacion1 = new Aplicacion();
	private JTextField textField;
	
	/**
	 * Create the frame.
	 */
	public CalculadoraReciclaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 308);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlCalculadora = new JPanel();
		pnlCalculadora.setBackground(new Color(255, 255, 255));
		pnlCalculadora.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Calculadora de Reciclaje", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 153, 51)));
		pnlCalculadora.setBounds(10, 11, 207, 243);
		contentPane.add(pnlCalculadora);
		pnlCalculadora.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Material:");
		lblNewLabel_1.setBounds(10, 21, 61, 14);
		pnlCalculadora.add(lblNewLabel_1);

		JComboBox cbMaterialCalculadora = new JComboBox();
		cbMaterialCalculadora.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Vidrio", "Papel"}));
		cbMaterialCalculadora.setBounds(10, 41, 171, 20);
		pnlCalculadora.add(cbMaterialCalculadora);
		
		JLabel lblNewLabel_2 = new JLabel("Peso en Kilogramos:");
		lblNewLabel_2.setBounds(10, 72, 149, 14);
		pnlCalculadora.add(lblNewLabel_2);
		
		JTextPane txtPesoCalculadora = new JTextPane();
		txtPesoCalculadora.setForeground(Color.BLACK);
		txtPesoCalculadora.setBackground(Color.LIGHT_GRAY);
		txtPesoCalculadora.setBounds(10, 88, 171, 20);
		pnlCalculadora.add(txtPesoCalculadora);
		
		JLabel lblNewLabel_3 = new JLabel("Ganancias estimadas (Q):");
		lblNewLabel_3.setBounds(10, 163, 149, 14);
		pnlCalculadora.add(lblNewLabel_3);
		
		txtGananciasCalculadora = new JTextField();
		txtGananciasCalculadora.setEditable(false);
		txtGananciasCalculadora.setBounds(10, 179, 171, 20);
		pnlCalculadora.add(txtGananciasCalculadora);
		txtGananciasCalculadora.setColumns(10);
		
		Aplicacion obtener = new Aplicacion();

		
		JButton btnCalculadora = new JButton("Calcular");
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean v;
				v = (obtener.getvalidacion(txtPesoCalculadora.getText()));
				
				if (v ==true) {
				
				
				txtGananciasCalculadora.setText(obtener.getcalculadora(String.valueOf(cbMaterialCalculadora.getSelectedItem()), Float.parseFloat((txtPesoCalculadora.getText()))));
			}
				else {
					JOptionPane.showMessageDialog(null, "Ingrese unos valores validos");
					
				}
			}
		}
		);
		btnCalculadora.setBounds(44, 129, 89, 23);
		pnlCalculadora.add(btnCalculadora);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuGUI menu  = new MenuGUI();
				menu.setVisible(true);
			}
		});
		btnAtras.setBounds(108, 210, 89, 23);
		pnlCalculadora.add(btnAtras);
	}
	
}

