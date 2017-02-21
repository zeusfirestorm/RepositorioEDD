package com.usac.edd.interfaz;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.usac.edd.utils.LoadXML;
import com.usac.testing.Lista;
import com.usac.testing.ListaLetra;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PrincipalMenu {

	private JFrame frame;
	public static ListaLetra listaLetras;
	public static Lista listaPalabras;
	private String letras = "aaaaaaaaaaaaeeeeeeeeeeeeoooooooooiiiiiissssssnnnnnllllrrrrruuuuuttttdddddggccccbbmmpphhfvyqjñxz";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalMenu window = new PrincipalMenu();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		listaLetras = new ListaLetra();
		listaPalabras = new Lista();

		JButton btnNewButton = new JButton("Leer Archivo");
		JButton btnNewButton_1 = new JButton("Jugar");
		btnNewButton_1.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoadXML loadXML = new LoadXML();
				if (loadXML.cargarXML()) {
					JOptionPane.showMessageDialog(null, "La configuración se realizó con éxito!");
					btnNewButton_1.setEnabled(true);
				} else {
					JOptionPane.showMessageDialog(null, "No se pudo cargar el archivo de configuración!");
				}
			}
		});
		btnNewButton.setBounds(51, 91, 102, 52);
		panel.add(btnNewButton);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!abecedarioOpcional.getText().equals("")) {
					letras = abecedarioOpcional.getText();
				}
				cargarLetras(letras);
				listaLetras.listar();
				IngresoJugadores ingresoJugadores = new IngresoJugadores();
				ingresoJugadores.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(250, 91, 89, 52);
		panel.add(btnNewButton_1);
		
		abecedarioOpcional = new JTextField();
		abecedarioOpcional.setBounds(67, 208, 296, 20);
		panel.add(abecedarioOpcional);
		abecedarioOpcional.setColumns(10);
		
		JLabel lblAbecedario = new JLabel("Puede agregar el abecedario");
		lblAbecedario.setBounds(67, 177, 296, 20);
		panel.add(lblAbecedario);
	}
	int inx = 0;
	private JTextField abecedarioOpcional;
	public void cargarLetras(String letras) {
		// listaLetras.listar();
		int longitud = letras.length();
		int posicion = (int) (Math.random() * longitud);
		// System.out.println("Posición a extraer: " + posicion);

		char extraer = letras.charAt(posicion);
		// System.out.println("Letra a Extraer: " + extraer);

		String remanente = "";
		
		for (int letra_i = 0; letra_i < letras.length(); letra_i++) {
			char extraerAux = letras.charAt(letra_i);
			if (extraer == extraerAux && posicion == letra_i) {
				// finalletras = finalletras + b;
				System.out.println("I: " + inx);
				inx++;
				listaLetras.agregarAlFinal(extraerAux + "", obtenerPuntuacion(extraerAux + ""), inx);
				continue;
			}
			remanente = remanente + extraerAux;
		}
		if (remanente.length() > 0) {
			cargarLetras(remanente);
		}

	}

	private int obtenerPuntuacion(String letra) {
		String letrasPuntos1 = "aeoisnlrut";
		String letrasPuntos2 = "dg";
		String letrasPuntos3 = "cbmp";
		String letrasPuntos4 = "hfvy";
		String letrasPuntos5 = "q";
		String letrasPuntos8 = "jñx";
		String letrasPuntos10 = "z";
		if (letrasPuntos1.contains(letra)) {
			return 1;
		} else if (letrasPuntos2.contains(letra)) {
			return 2;
		} else if (letrasPuntos3.contains(letra)) {
			return 3;
		} else if (letrasPuntos4.contains(letra)) {
			return 4;
		} else if (letrasPuntos5.contains(letra)) {
			return 5;
		} else if (letrasPuntos8.contains(letra)) {
			return 8;
		} else if (letrasPuntos10.contains(letra)) {
			return 10;
		} else {
			return 0;
		}
	}
}
