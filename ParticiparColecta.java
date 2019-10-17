import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ParticiparColecta extends JFrame {

	private JPanel contentPane;
	private TextArea textArea_2;
	private Aplicacion aplicacion1 = new Aplicacion();
	private JTextField textField;
	private JButton btnMostrar;
	/**
	 * Create the frame.
	 */
	public ParticiparColecta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlColecta = new JPanel();
		pnlColecta.setBackground(new Color(255, 255, 255));
		pnlColecta.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Participar en una colecta de materiales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 153, 51)));
		pnlColecta.setBounds(10, 11, 207, 243);
		contentPane.add(pnlColecta);
		pnlColecta.setLayout(null);
		
		JComboBox cbMaterialColecta = new JComboBox();
		cbMaterialColecta.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Vidrio", "Papel"}));
		cbMaterialColecta.setBounds(10, 40, 171, 20);
		pnlColecta.add(cbMaterialColecta);
		
		JLabel label = new JLabel("Material:");
		label.setBounds(10, 24, 66, 14);
		pnlColecta.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		lblNewLabel_4.setBounds(10, 73, 46, 14);
		pnlColecta.add(lblNewLabel_4);
		
		JComboBox cbFechaColecta = new JComboBox();
		cbFechaColecta.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		cbFechaColecta.setBounds(10, 88, 171, 20);
		pnlColecta.add(cbFechaColecta);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(10, 119, 46, 14);
		pnlColecta.add(lblLugar);
		
		JComboBox cbLugarColecta = new JComboBox();
		cbLugarColecta.setModel(new DefaultComboBoxModel(new String[] {"Ciudad de Guatemala", "Coban", "Antigua Guatemala", "Mixco", "Xela"}));
		cbLugarColecta.setBounds(10, 136, 171, 20);
		pnlColecta.add(cbLugarColecta);
		
		JButton btnAnadirColecta = new JButton("Aniadir");
		btnAnadirColecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aplicacion1.setNewColecta(String.valueOf(cbMaterialColecta.getSelectedItem()), String.valueOf(cbFechaColecta.getSelectedItem()), String.valueOf(cbLugarColecta.getSelectedItem()));
			
				String material = cbMaterialColecta.getSelectedItem().toString();
				String fecha = cbFechaColecta.getSelectedItem().toString();
				String lugar = cbLugarColecta.getSelectedItem().toString();
				
				Colecta colecta = new Colecta();
				colecta.newMaterial(material);
				colecta.setFecha(fecha);
				colecta.setLugar(lugar);
				
				ObjectOutputStream out = null;
				try {
					out = new ObjectOutputStream(new FileOutputStream("Colecta.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					out.writeObject(colecta);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
					
				ObjectInputStream in = null;
				try {
					in = new ObjectInputStream(new FileInputStream("Colecta.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Colecta colecta2 = (Colecta) in.readObject();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Inscrito a la colecta del " + colecta.getFecha() + "!");
			}
			
			
			
			
		});
		btnAnadirColecta.setBounds(10, 168, 66, 23);
		pnlColecta.add(btnAnadirColecta);

		btnAnadirColecta.setBounds(10, 168, 80, 23);
		pnlColecta.add(btnAnadirColecta);
		JLabel lblNewLabel_5 = new JLabel("Colectas Inscritas:");
		lblNewLabel_5.setBounds(10, 317, 171, 14);
		pnlColecta.add(lblNewLabel_5);
		
		JButton btnQuitarColecta = new JButton("Quitar");
		btnQuitarColecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null, "No se ingreso ningun valor");

					
				}
				
				else if(textField.getText().contentEquals("0")) {
					JOptionPane.showMessageDialog(null, "Numero invalido");

					
				}
				
				else if(aplicacion1.getColecta().size() >= Integer.parseInt(textField.getText())   ) {
				
					
				
					
					
					aplicacion1.getColecta().remove(Integer.parseInt(textField.getText())-1);
					JOptionPane.showMessageDialog(null, "La colecta a sido eliminada");

					
				

						
					}
					
				
				
				else {
					
					JOptionPane.showMessageDialog(null, "El numero ingresado esta fuera del rango de colectas");


					
				}
				
			}
		});
		btnQuitarColecta.setBounds(141, 237, 81, 23);
		pnlColecta.add(btnQuitarColecta);
		
		textArea_2 = new TextArea();
		textArea_2.setBounds(225, 24, 171, 187);
		pnlColecta.add(textArea_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9') e.consume();
			}
		});
		textField.setBounds(10, 238, 121, 20);
		pnlColecta.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero que Removera");
		lblNewLabel.setBounds(10, 213, 171, 14);
		pnlColecta.add(lblNewLabel);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea_2.setText(String.valueOf(aplicacion1.getColecta()));

			}
		});
		btnMostrar.setBounds(100, 167, 80, 23);
		pnlColecta.add(btnMostrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuGUI menu  = new MenuGUI();
				menu.setVisible(true);
			}
			
			
		});
		btnSalir.setBounds(325, 237, 89, 23);
		pnlColecta.add(btnSalir);
		
		
	}
}
