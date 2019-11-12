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
import java.util.ArrayList;
import java.util.List;

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
	private JButton btnMostrar;
	private JComboBox comboBox;
	
	static List<Colecta> listaColectas = new ArrayList<Colecta>();
	/**
	 * Create the frame.
	 */
	public ParticiparColecta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 327);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
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
				
				if (aplicacion1.getFechas().indexOf(String.valueOf(cbFechaColecta.getSelectedItem()))==-1) {
					aplicacion1.setNewColecta(String.valueOf(cbMaterialColecta.getSelectedItem()), String.valueOf(cbFechaColecta.getSelectedItem()), String.valueOf(cbLugarColecta.getSelectedItem()));
					aplicacion1.getFechas().add(String.valueOf(cbFechaColecta.getSelectedItem()));
					
				//	for (int x=0; x<aplicacion1.getColecta().size();x++) {
					//	if( aplicacion1.getColecta().get(x).getFecha().indexOf(str))
							
				//		}
				//	}

					String material = cbMaterialColecta.getSelectedItem().toString();
					String fecha = cbFechaColecta.getSelectedItem().toString();
					String lugar = cbLugarColecta.getSelectedItem().toString();
					
					Colecta colecta = new Colecta();
					colecta.newMaterial(material);
					colecta.setFecha(fecha);
					colecta.setLugar(lugar);
					listaColectas.add(colecta);
					
					Persistencia persistencia = new Persistencia();
					persistencia.escribirColecta(listaColectas);
					
					JOptionPane.showMessageDialog(null, "Inscrito a la colecta del " + colecta.getFecha() + "!");
				}
					else {
						JOptionPane.showMessageDialog(null, "Ya se encuentra en una actividad ese dia");

						
					}
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
				
				
				for (int x=0; x<aplicacion1.getColecta().size();x++) {
				if( aplicacion1.getColecta().get(x).getFecha().indexOf(String.valueOf(comboBox.getSelectedItem()))!=-1) {
					 aplicacion1.getColecta().remove(aplicacion1.getColecta().get(x).getFecha().indexOf(String.valueOf(comboBox.getSelectedItem())));
					 aplicacion1.getFechas().remove(String.valueOf(comboBox.getSelectedItem()));
						JOptionPane.showMessageDialog(null, "A sido eliminada de ese dia la actividad");

					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "No se encuentra registrado a ninguna actividad ese dia");

					
				}
				
				
			}


				
				
			}
		});
		btnQuitarColecta.setBounds(170, 238, 81, 23);
		pnlColecta.add(btnQuitarColecta);
		
		textArea_2 = new TextArea();
		textArea_2.setBounds(225, 40, 171, 171);
		pnlColecta.add(textArea_2);
		
		JLabel lblNewLabel = new JLabel("Fecha a remover");
		lblNewLabel.setBounds(10, 213, 171, 14);
		pnlColecta.add(lblNewLabel);
		
		btnMostrar = new JButton("Actualizar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea_2.setText(String.valueOf(aplicacion1.getColecta()));

			}
		});
		btnMostrar.setBounds(100, 167, 102, 23);
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
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		comboBox.setBounds(10, 238, 145, 20);
		pnlColecta.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Colectas inscritas: ");
		lblNewLabel_1.setBounds(225, 24, 110, 14);
		pnlColecta.add(lblNewLabel_1);
		
		
	}
}

