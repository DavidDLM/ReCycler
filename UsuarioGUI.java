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
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UsuarioGUI extends JFrame {

	private JPanel contentPane;
	public static JTextField tfUsuario;
	public static JPasswordField pfContrasena;
	public static JTextField tfCorreo;
	public static JTextField tfDireccion;
	public static JTextField tfTelefono;

	/**
	 * Create the frame.
	 */
	public UsuarioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblActualiceSusDatos = new JLabel("Actualice sus datos de usuario");
		lblActualiceSusDatos.setForeground(new Color(0, 0, 0));
		lblActualiceSusDatos.setBackground(new Color(255, 255, 255));
		lblActualiceSusDatos.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblActualiceSusDatos.setBounds(10, 11, 287, 14);
		contentPane.add(lblActualiceSusDatos);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(10, 36, 78, 14);
		contentPane.add(lblUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(98, 34, 150, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrasena:");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContrasena.setBounds(10, 72, 83, 14);
		contentPane.add(lblContrasena);
		
		pfContrasena = new JPasswordField();
		pfContrasena.setBounds(98, 70, 150, 20);
		contentPane.add(pfContrasena);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setBounds(10, 109, 78, 14);
		contentPane.add(lblCorreo);
		
		tfCorreo = new JTextField();
		tfCorreo.setBounds(98, 107, 150, 20);
		contentPane.add(tfCorreo);
		tfCorreo.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 147, 78, 14);
		contentPane.add(lblDireccion);
		
		tfDireccion = new JTextField();
		tfDireccion.setBounds(98, 145, 150, 48);
		contentPane.add(tfDireccion);
		tfDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(10, 214, 78, 14);
		contentPane.add(lblTelefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(98, 212, 150, 20);
		contentPane.add(tfTelefono);
		tfTelefono.setColumns(10);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(new Color(255, 255, 255));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnX.setBounds(135, 242, 55, 23);
		contentPane.add(btnX);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario u1 = new Usuario(null,null,null,null,null,null);
				DatosUsuario usuario1 = new DatosUsuario();
			
				u1.setUserName(usuario1.UserName());
				u1.setContrasena(usuario1.Contrasena());
				u1.setCorreo(usuario1.Correo());
				u1.setTelefono(usuario1.Telefono());
				u1.setDireccion(usuario1.Direccion());
				
				ObjectOutputStream out = null;
				try {
					out = new ObjectOutputStream(new FileOutputStream("Datos.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					out.writeObject(u1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
					
				ObjectInputStream in = null;
				try {
					in = new ObjectInputStream(new FileInputStream("Datos.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Usuario u2 = (Usuario) in.readObject();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Sus datos de usuario han sido actualizados!");
				
			}
		});
		btnAceptar.setBounds(200, 242, 89, 23);
		contentPane.add(btnAceptar);
	}

}
