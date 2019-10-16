import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class ReCyclerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtGananciasCalculadora;
	private TextArea textArea;
	private TextArea textArea_2;
	private TextArea textArea_1;
	
	/**
	 * Create the frame.
	 */
	public ReCyclerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecycler = new JLabel("Re-Cycler");
		lblRecycler.setForeground(new Color(50, 205, 50));
		lblRecycler.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecycler.setFont(new Font("Sitka Small", Font.PLAIN, 36));
		lblRecycler.setBounds(102, 11, 530, 52);
		contentPane.add(lblRecycler);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 153));
		panel_1.setBorder(new TitledBorder(null, "Calculadora de Reciclaje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 74, 191, 210);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Material:");
		lblNewLabel_1.setBounds(10, 25, 67, 14);
		panel_1.add(lblNewLabel_1);
		
		JComboBox cbMaterialCalculadora = new JComboBox();
		cbMaterialCalculadora.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Vidrio", "Papel"}));
		cbMaterialCalculadora.setBounds(10, 41, 171, 20);
		panel_1.add(cbMaterialCalculadora);
		
		JLabel lblNewLabel_2 = new JLabel("Peso en Kilogramos:");
		lblNewLabel_2.setBounds(10, 72, 149, 14);
		panel_1.add(lblNewLabel_2);
		
		JTextPane txtPesoCalculadora = new JTextPane();
		txtPesoCalculadora.setBounds(10, 88, 171, 20);
		panel_1.add(txtPesoCalculadora);
		
		JLabel lblNewLabel_3 = new JLabel("Ganancias estimadas (Q):");
		lblNewLabel_3.setBounds(10, 163, 149, 14);
		panel_1.add(lblNewLabel_3);
		
		txtGananciasCalculadora = new JTextField();
		txtGananciasCalculadora.setEditable(false);
		txtGananciasCalculadora.setBounds(10, 179, 171, 20);
		panel_1.add(txtGananciasCalculadora);
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
		btnCalculadora.setBounds(45, 130, 89, 23);
		panel_1.add(btnCalculadora);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 153));
		panel_2.setBorder(new TitledBorder(null, "Participar en una colecta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(211, 74, 191, 433);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox cbMaterialColecta = new JComboBox();
		cbMaterialColecta.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Vidrio", "Papel"}));
		cbMaterialColecta.setBounds(10, 40, 171, 20);
		panel_2.add(cbMaterialColecta);
		
		JLabel label = new JLabel("Material:");
		label.setBounds(10, 24, 66, 14);
		panel_2.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		lblNewLabel_4.setBounds(10, 73, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		JComboBox cbFechaColecta = new JComboBox();
		cbFechaColecta.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		cbFechaColecta.setBounds(10, 88, 171, 20);
		panel_2.add(cbFechaColecta);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(10, 119, 46, 14);
		panel_2.add(lblLugar);
		
		JComboBox cbLugarColecta = new JComboBox();
		cbLugarColecta.setModel(new DefaultComboBoxModel(new String[] {"Ciudad de Guatemala", "Coban", "Antigua Guatemala", "Mixco", "Xela"}));
		cbLugarColecta.setBounds(10, 136, 171, 20);
		panel_2.add(cbLugarColecta);
		
		JButton btnAnadirColecta = new JButton("Aniadir");
		btnAnadirColecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aplicacion aplicacion1 = new Aplicacion();
				aplicacion1.setNewColecta(String.valueOf(cbMaterialColecta.getSelectedItem()), String.valueOf(cbFechaColecta.getSelectedItem()), String.valueOf(cbLugarColecta.getSelectedItem()));
				textArea_2.setText(String.valueOf(aplicacion1.getColecta()));
			
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
		btnAnadirColecta.setBounds(10, 168, 80, 23);
		panel_2.add(btnAnadirColecta);

		btnAnadirColecta.setBounds(10, 168, 80, 23);
		panel_2.add(btnAnadirColecta);
		
		JLabel lblNewLabel_5 = new JLabel("Colectas Inscritas:");
		lblNewLabel_5.setBounds(10, 217, 171, 14);
		panel_2.add(lblNewLabel_5);
		
		JButton btnQuitarColecta = new JButton("Quitar");
		btnQuitarColecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuitarColecta.setBounds(100, 168, 81, 23);
		panel_2.add(btnQuitarColecta);
		
		textArea_2 = new TextArea();
		textArea_2.setBounds(10, 236, 171, 187);
		panel_2.add(textArea_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 153));
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ofrecerse como voluntario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(412, 74, 191, 433);
		contentPane.add(panel_3);
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
				Aplicacion aplicacion1 = new Aplicacion();
				aplicacion1.setNewVoluntariado(String.valueOf(cbLugarVoluntariado.getSelectedItem()), String.valueOf(cbFechaVoluntariado.getSelectedItem()), String.valueOf(cbHoraVoluntariado.getSelectedItem()));
				textArea_1.setText(String.valueOf(aplicacion1.getVoluntariado()));
				
				String hora = cbHoraVoluntariado.getSelectedItem().toString();
				String fecha = cbFechaVoluntariado.getSelectedItem().toString();
				String lugar = cbLugarVoluntariado.getSelectedItem().toString();
				
				Voluntariado volunt = new Voluntariado();
				volunt.setHora(hora);
				volunt.setFecha(fecha);
				volunt.setLugar(lugar);
				
				ObjectOutputStream out = null;
				try {
					out = new ObjectOutputStream(new FileOutputStream("Voluntariado.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					out.writeObject(volunt);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
					
				ObjectInputStream in = null;
				try {
					in = new ObjectInputStream(new FileInputStream("Voluntariado.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Voluntariado volunt2 = (Voluntariado) in.readObject();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Gracias por ser voluntario en " + volunt.getLugar() + "!");
			}
		});
		btnAnadirVoluntariado.setBounds(10, 165, 79, 23);
		panel_3.add(btnAnadirVoluntariado);
		
		JButton btnQuitarVoluntariado = new JButton("Quitar");
		btnQuitarVoluntariado.setBounds(99, 165, 82, 23);
		panel_3.add(btnQuitarVoluntariado);
		
		JLabel lblVoluntariadosInscritos = new JLabel("Voluntariados inscritos:");
		lblVoluntariadosInscritos.setBounds(10, 216, 151, 14);
		panel_3.add(lblVoluntariadosInscritos);
		
		textArea_1 = new TextArea();
		textArea_1.setBounds(10, 236, 171, 187);
		panel_3.add(textArea_1);

		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 255, 153));
		panel_4.setBorder(new TitledBorder(null, "Informacion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(613, 74, 185, 433);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnDatosEmpresas = new JButton("Datos de Empresas");
		btnDatosEmpresas.setBounds(10, 21, 165, 23);
		btnDatosEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(obtener.getinformacionempresas());
				
			}
		});
		
		panel_4.add(btnDatosEmpresas);
		
		JButton btnPreguntasFrecuentes = new JButton("Preguntas Frecuentes");
		btnPreguntasFrecuentes.setBounds(10, 55, 165, 23);
		btnPreguntasFrecuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(obtener.getpreguntasfrecuentes());
			}
		});
		panel_4.add(btnPreguntasFrecuentes);
		
		JButton btnAcercaDeNosotros = new JButton("Acerca de Nosotros");
		btnAcercaDeNosotros.setBounds(10, 89, 165, 23);
		btnAcercaDeNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(obtener.getinformacionsobrenosotros());
			}
		});
		panel_4.add(btnAcercaDeNosotros);
		
		textArea = new TextArea();
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(10, 118, 165, 305);
		panel_4.add(textArea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(685, 11, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnUsuario = new JButton("Usuario");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioGUI usuario = new UsuarioGUI();
				usuario.setVisible(true);
			}
		});
		btnUsuario.setBackground(new Color(255, 255, 255));
		btnUsuario.setBounds(590, 11, 89, 23);
		contentPane.add(btnUsuario);
		
		
	
		
	}
}

