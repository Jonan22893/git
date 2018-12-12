package Examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;

public class Examen1Loging extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelContenedor;
	private JTextField txtUsuario;
	private JPasswordField pwdContrasea;
	private JLabel lblMensaje;
    private JLabel lblUsuario; 
    private JLabel lblContrasea;
    private JButton btnButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Loging frame = new Examen1Loging();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Examen1Loging() {
		setTitle("Examen de Jessica Marroqu\u00EDn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblMensaje = new JLabel("Listo");
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		panelContenedor = new JPanel();
		contentPane.add(panelContenedor, BorderLayout.CENTER);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBackground(Color.GRAY);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelContenedor.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(Color.GRAY);
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		// Acciones a Realizar
				String mensaje;
				 mensaje = "El numero introducido es el " + txtUsuario.getText();
				lblMensaje.setText(mensaje);

		
			}
		});
		panelContenedor.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		panelContenedor.add(lblContrasea);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contrase\u00F1a");
		panelContenedor.add(pwdContrasea);
		
		btnButton = new JButton("");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				//defino los datos correctos
					 String nombrecorrecto = "jessica";
					 String contrasenacorrecta = "marroquin";
					 // compruebo los datos
				//acciones a realizar al pulsar el boton
				//compruebo el usuario y la password
					String contrasena = new String(pwdContrasea.getPassword());
					if (true) {
						//si los datos coinciden
		
					    if(nombrecorrecto.equals(txtUsuario.getText()) && contrasenacorrecta.equals(contrasena)){
					    	 lblMensaje.setText("Bienvenido");
					       
					    } 
					    else {
					        lblMensaje.setText("Datos incorrectos");
					    }
										
				}
	
			}
		});
		panelContenedor.add(btnButton);
	
		
	}
	}


