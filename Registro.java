import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {
	
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfContrasena;
	private JPasswordField pfContrasenaV;
	private JTextField tfCorreo;
	private Aplicacion op = new Aplicacion();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro:");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegistro.setBounds(20, 63, 134, 24);
		contentPane.add(lblRegistro);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(20, 98, 57, 24);
		contentPane.add(lblUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(137, 100, 134, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrasena:");
		lblContrasena.setBounds(20, 183, 79, 14);
		contentPane.add(lblContrasena);
		
		pfContrasena = new JPasswordField();
		pfContrasena.setBounds(137, 180, 134, 20);
		contentPane.add(pfContrasena);
		
		JLabel lblEscribaDeNuevo = new JLabel("Escriba de nuevo");
		lblEscribaDeNuevo.setBounds(20, 208, 99, 24);
		contentPane.add(lblEscribaDeNuevo);
		
		JLabel lblSuContrasena = new JLabel("su contrasena:");
		lblSuContrasena.setBounds(20, 225, 91, 14);
		contentPane.add(lblSuContrasena);
		
		pfContrasenaV = new JPasswordField();
		pfContrasenaV.setBounds(137, 222, 134, 20);
		contentPane.add(pfContrasenaV);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (String.valueOf(pfContrasena.getText()).equals(String.valueOf(pfContrasenaV.getText()))){
					JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
					op.IngresarUsuario(String.valueOf(tfUsuario.getText()));
					op.IngresarContrasena(String.valueOf(pfContrasena.getText()));;
					UsuarioContrasena ventanaU = new UsuarioContrasena();
					ventanaU.frame.setVisible(true);
					Registro.this.setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(null,"Ingrese la contrasena correctamente");
				}
				
			}
		});
		btnAceptar.setBounds(182, 260, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(20, 147, 57, 14);
		contentPane.add(lblCorreo);
		
		tfCorreo = new JTextField();
		tfCorreo.setBounds(137, 144, 134, 20);
		contentPane.add(tfCorreo);
		tfCorreo.setColumns(10);
		
		JLabel lblRecycler = new JLabel("ReCycler");
		lblRecycler.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRecycler.setForeground(Color.GREEN);
		lblRecycler.setBounds(107, 22, 91, 30);
		contentPane.add(lblRecycler);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(65, 260, 89, 23);
		contentPane.add(btnCancelar);
		
	}
	/*public void IngresarUsuario(String x, String y){
    	Usuario user = new Usuario(x,y);
    	usuarios.add(user);
    }*/
			
}
