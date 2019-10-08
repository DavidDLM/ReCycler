import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioContrasena {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public UsuarioContrasena() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 298, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngreso = new JLabel("Ingreso:");
		lblIngreso.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblIngreso.setBounds(16, 41, 108, 29);
		frame.getContentPane().add(lblIngreso);
		
		JLabel lblRecycler = new JLabel("ReCycler");
		lblRecycler.setForeground(Color.GREEN);
		lblRecycler.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblRecycler.setBounds(102, 11, 115, 34);
		frame.getContentPane().add(lblRecycler);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(55, 68, 83, 21);
		frame.getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(134, 68, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrasena:");
		lblContrasea.setBounds(55, 103, 83, 14);
		frame.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 100, 115, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro registro =  new Registro();
				registro.setVisible(true);
				
			}
		});
		btnRegistro.setBounds(55, 131, 89, 23);
		frame.getContentPane().add(btnRegistro);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("admin") && passwordField.getText().equals("admin")){
					JOptionPane.showMessageDialog(null, "Ingresado. Recuerde actualizar sus datos en USUARIO");
					ReCyclerGUI ventanaU = new ReCyclerGUI();
					ventanaU.setVisible(true);
					UsuarioContrasena.this.frame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"Usuario o contrasena invalido");
				}
			}
		});
		btnIngresar.setBounds(160, 131, 89, 23);
		frame.getContentPane().add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(160, 160, 89, 23);
		frame.getContentPane().add(btnSalir);
	}
}
