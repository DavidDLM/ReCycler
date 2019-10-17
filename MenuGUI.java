import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuGUI extends JFrame {

	static JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBorder(new TitledBorder(new LineBorder(new Color(51, 255, 0)), "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 255, 51)));
		pnlMenu.setBounds(10, 11, 414, 253);
		contentPane.add(pnlMenu);
		pnlMenu.setLayout(null);
		
		JButton btnCalculadora = new JButton("Calculadora");
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CalculadoraReciclaje calculadora = new CalculadoraReciclaje();
				calculadora.setVisible(true);
				
			}
		});
		btnCalculadora.setBackground(new Color(153, 255, 102));
		btnCalculadora.setBounds(10, 26, 394, 23);
		pnlMenu.add(btnCalculadora);
		
		JButton btnParticipaEnUn = new JButton("\u00A1Participa en un voluntariado!");
		btnParticipaEnUn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				OfrecerseVoluntario volunt = new OfrecerseVoluntario();
				volunt.setVisible(true);
			}
			
		});
		btnParticipaEnUn.setBackground(new Color(153, 255, 102));
		btnParticipaEnUn.setBounds(10, 61, 394, 60);
		pnlMenu.add(btnParticipaEnUn);
		
		JButton btnparticipaEnUna = new JButton("\u00A1Participa en una colecta!");
		btnparticipaEnUna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ParticiparColecta colecta = new ParticiparColecta();
				colecta.setVisible(true);
			}
		});
		btnparticipaEnUna.setBackground(new Color(153, 255, 102));
		btnparticipaEnUna.setBounds(10, 132, 394, 60);
		pnlMenu.add(btnparticipaEnUna);
		
		JButton btnInformacionYConfiguracion = new JButton("Informacion y configuracion");
		btnInformacionYConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Informacion info = new Informacion();
				info.setVisible(true);
			}
		});
		btnInformacionYConfiguracion.setBackground(new Color(153, 255, 102));
		btnInformacionYConfiguracion.setBounds(10, 203, 394, 39);
		pnlMenu.add(btnInformacionYConfiguracion);
	}

}
