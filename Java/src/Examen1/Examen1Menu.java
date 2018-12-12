package Examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Examen1Menu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtResultado;
	String n; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Menu frame = new Examen1Menu();
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
	public Examen1Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		textField.setBounds(5, 5, 424, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnEsprimo = new JButton("EsPrimo");
		btnEsprimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
	
			}
		});
		btnEsprimo.setBounds(25, 58, 179, 62);
		contentPane.add(btnEsprimo);
		
		JButton btnCircunferencia = new JButton("Circunferencia");
		btnCircunferencia.setBounds(238, 58, 135, 62);
		contentPane.add(btnCircunferencia);
		
		JButton btnMultiplos = new JButton("10 Multiplos");
		btnMultiplos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplos.setBounds(25, 143, 179, 62);
		contentPane.add(btnMultiplos);
		
		JButton btnParOImpar = new JButton("Par o Impar");
		btnParOImpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnParOImpar.setBounds(238, 146, 135, 59);
		contentPane.add(btnParOImpar);
		
		txtResultado = new JTextField();
		txtResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("el numero introducido es");
			}
		});
		txtResultado.setBounds(5, 230, 424, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
}
