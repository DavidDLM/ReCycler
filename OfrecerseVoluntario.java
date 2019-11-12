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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class OfrecerseVoluntario extends JFrame {

	private JPanel contentPane;
	private JTextField txtGananciasCalculadora;
	private TextArea textArea;
	private TextArea textArea_2;
	private TextArea textArea_1;
	private Aplicacion aplicacion1 = new Aplicacion();
	private JTextField textField;
	private JButton btnMostrar;
	private JButton btnQuitarVoluntariado;
	private JComboBox comboBox;


	/**
	 * Create the frame.
	 */
	public OfrecerseVoluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 336);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 250, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ofrecerse como voluntario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 153, 51)));
		panel_3.setBounds(412, 74, 191, 534);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		panel_3.setLayout(null);
		JLabel lblHoraVoluntariado = new JLabel("Hora:");
		lblHoraVoluntariado.setBounds(10, 24, 46, 14);
		panel_3.add(lblHoraVoluntariado);
		
		JComboBox cbHoraVoluntariado = new JComboBox();
		cbHoraVoluntariado.setModel(new DefaultComboBoxModel(new String[] {"08:00", "10:00", "12:00", "14:00", "16:00"}));
		cbHoraVoluntariado.setBounds(10, 41, 171, 20);
		panel_3.add(cbHoraVoluntariado);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 72, 46, 14);
		panel_3.add(lblFecha);

		JComboBox cbFechaVoluntariado = new JComboBox();
		cbFechaVoluntariado.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		cbFechaVoluntariado.setBounds(10, 87, 171, 20);
		panel_3.add(cbFechaVoluntariado);
		
		JLabel lblLugar_1 = new JLabel("Lugar:");
		lblLugar_1.setBounds(10, 118, 46, 14);
		panel_3.add(lblLugar_1);
		
		JComboBox cbLugarVoluntariado = new JComboBox();
		cbLugarVoluntariado.setModel(new DefaultComboBoxModel(new String[] {"Ciudad de Guatemala", "Coban", "Antigua Guatemala", "Mixco", "Xela"}));
		cbLugarVoluntariado.setBounds(10, 134, 171, 20);
		panel_3.add(cbLugarVoluntariado);
		
		JButton btnAnadirVoluntariado = new JButton("Aniadir");
		btnAnadirVoluntariado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (aplicacion1.getFechascolectas().indexOf(String.valueOf(cbFechaVoluntariado.getSelectedItem()))==-1) {
					aplicacion1.setNewColecta(String.valueOf(cbHoraVoluntariado.getSelectedItem()), String.valueOf(cbFechaVoluntariado.getSelectedItem()), String.valueOf(cbLugarVoluntariado.getSelectedItem()));
					aplicacion1.getFechascolectas().add(String.valueOf(cbFechaVoluntariado.getSelectedItem()));
					
				
				
				
				
				
				
				
				
				
				
				String hora = cbHoraVoluntariado.getSelectedItem().toString();
				String fecha = cbFechaVoluntariado.getSelectedItem().toString();
				String lugar = cbLugarVoluntariado.getSelectedItem().toString();
				
				Voluntariado volunt = new Voluntariado();
				volunt.setHora(hora);
				volunt.setFecha(fecha);
				volunt.setLugar(lugar);
				
				Aplicacion.voluntariados.add(volunt);
				Persistencia persistencia  = new Persistencia();
				persistencia.escribirVoluntariado(Aplicacion.voluntariados);
				
				JOptionPane.showMessageDialog(null, "Gracias por ser voluntario en " + volunt.getLugar() + "!");
			}
				else {
					JOptionPane.showMessageDialog(null, "Ya se encuentra en una actividad ese dia");

					
				}
			}
		});
		
		btnAnadirVoluntariado.setBounds(10, 165, 79, 23);
		panel_3.add(btnAnadirVoluntariado);
		
		btnQuitarVoluntariado = new JButton("Quitar");
		btnQuitarVoluntariado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				for (int x=0; x<aplicacion1.getVoluntariado().size();x++) {
					if( aplicacion1.getVoluntariado().get(x).getFecha().indexOf(String.valueOf(comboBox.getSelectedItem()))!=-1) {
						 aplicacion1.getVoluntariado().remove(aplicacion1.getVoluntariado().get(x).getFecha().indexOf(String.valueOf(comboBox.getSelectedItem())));
						 aplicacion1.getFechascolectas().remove(String.valueOf(comboBox.getSelectedItem()));
							JOptionPane.showMessageDialog(null, "A sido eliminada de ese dia la actividad");

						
						
					}
	//				else {
	//					JOptionPane.showMessageDialog(null, "No se encuentra registrado a ninguna actividad ese dia");
//
	//					
//					}
					
					
				}
	
				
			}
		});
		
		btnQuitarVoluntariado.setBounds(165, 253, 82, 23);
		panel_3.add(btnQuitarVoluntariado);
		
		JLabel lblVoluntariadosInscritos = new JLabel("Voluntariados inscritos:");
		lblVoluntariadosInscritos.setBounds(200, 24, 151, 14);
		panel_3.add(lblVoluntariadosInscritos);
		
		textArea_1 = new TextArea();
		textArea_1.setBounds(210, 41, 176, 187);
		panel_3.add(textArea_1);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText(String.valueOf(aplicacion1.getVoluntariado()));

			}
		});
		btnActualizar.setBounds(99, 165, 105, 23);
		panel_3.add(btnActualizar);
		
		JLabel lblFechaARemover = new JLabel("Fecha a remover");
		lblFechaARemover.setBounds(10, 228, 171, 14);
		panel_3.add(lblFechaARemover);
		
		JButton btnAtras = new JButton("Salir");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuGUI menu  = new MenuGUI();
				menu.setVisible(true);
			}
		});
		btnAtras.setBounds(299, 253, 89, 23);
		panel_3.add(btnAtras);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		comboBox.setBounds(10, 254, 145, 20);
		panel_3.add(comboBox);

	}

}
