import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Informacion extends JFrame {


	private JPanel contentPane;
	private TextArea textArea;
	/**
	 * Create the frame.
	 */
	public Informacion() {
		
		Aplicacion obtener = new Aplicacion();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 153, 0)));
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
		textArea.setBounds(191, 21, 378, 220);
		panel_4.add(textArea);
		
		JButton btnUsuario = new JButton("Usuario");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioGUI usuario = new UsuarioGUI();
				usuario.setVisible(true);	
			}
		});
		btnUsuario.setBounds(10, 129, 165, 23);
		panel_4.add(btnUsuario);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuGUI menu  = new MenuGUI();
				menu.setVisible(true);
			}
	
		});
		btnSalir.setBounds(480, 247, 89, 23);
		panel_4.add(btnSalir);
		

		
	}

}
