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
import java.awt.SystemColor;

public class MenuGUI extends JFrame {

	static JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(102, 153, 51));
		pnlMenu.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 0), 2), "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 0)));
		pnlMenu.setBounds(10, 11, 414, 262);
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
		btnCalculadora.setBackground(SystemColor.controlHighlight);
		btnCalculadora.setBounds(10, 26, 394, 47);
		pnlMenu.add(btnCalculadora);
		
		JButton btnParticipaEnUn = new JButton("\u00A1Participa en un voluntariado!");
		btnParticipaEnUn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				OfrecerseVoluntario volunt = new OfrecerseVoluntario();
				volunt.setVisible(true);
			}
			
		});
		btnParticipaEnUn.setBackground(SystemColor.controlHighlight);
		btnParticipaEnUn.setBounds(10, 84, 394, 47);
		pnlMenu.add(btnParticipaEnUn);
		
		JButton btnparticipaEnUna = new JButton("\u00A1Participa en una colecta!");
		btnparticipaEnUna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ParticiparColecta colecta = new ParticiparColecta();
				colecta.setVisible(true);
			}
		});
		btnparticipaEnUna.setBackground(SystemColor.controlHighlight);
		btnparticipaEnUna.setBounds(10, 142, 394, 47);
		pnlMenu.add(btnparticipaEnUna);
		
		JButton btnInformacionYConfiguracion = new JButton("Informacion y configuracion");
		btnInformacionYConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Informacion info = new Informacion();
				info.setVisible(true);
			}
		});
		btnInformacionYConfiguracion.setBackground(SystemColor.controlHighlight);
		btnInformacionYConfiguracion.setBounds(10, 200, 394, 47);
		pnlMenu.add(btnInformacionYConfiguracion);
	}

}
