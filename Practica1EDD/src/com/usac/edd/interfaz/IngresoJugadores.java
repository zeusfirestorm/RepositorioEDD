package com.usac.edd.interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.usac.testing.Lista;
import com.usac.testing.ListaCircular;
import com.usac.testing.ListaLetra;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoJugadores {

	JFrame frame;
	// public static Lista lista;
	private JTextField textField;
	public static ListaCircular listaJugador;
	private ListaLetra listaLetrasJugador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoJugadores window = new IngresoJugadores();
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
	public IngresoJugadores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblIngresoDeJugadores = new JLabel("Ingreso de Jugadores");
		lblIngresoDeJugadores.setBounds(148, 11, 125, 37);
		frame.getContentPane().add(lblIngresoDeJugadores);

		JLabel lblNombreDelJugador = new JLabel("Nombre del Jugador");
		lblNombreDelJugador.setBounds(145, 61, 141, 37);
		frame.getContentPane().add(lblNombreDelJugador);

		textField = new JTextField();
		textField.setBounds(145, 109, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		listaJugador = new ListaCircular();
		listaLetrasJugador = new ListaLetra();

		JButton btnAgregarJugador = new JButton("Agregar Jugador");
		btnAgregarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonAgregarJugador();
				listaJugador.listar();
			}
		});
		btnAgregarJugador.setBounds(148, 166, 138, 20);
		frame.getContentPane().add(btnAgregarJugador);

		JButton btnNewButton = new JButton("Comenzar Juego");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonComenzarJuego();
			}
		});
		btnNewButton.setBounds(148, 197, 138, 23);
		frame.getContentPane().add(btnNewButton);
	}

	private void botonAgregarJugador() {
		String nombreJugador = textField.getText();
		if (nombreJugador.equals("")) {
			JOptionPane.showMessageDialog(null, "El campo usuario no puede estar vacio, ingrese un nombre válido.");
		} else {
			if (listaJugador.esVacia()) {
				agregarJugador(nombreJugador);
				textField.setText("");
			} else {
				if (listaJugador.buscar(nombreJugador)) {
					JOptionPane.showMessageDialog(null,
							"El jugador que desea agregar ya ha existe! Intente con otro nombre.");
				} else {
					agregarJugador(nombreJugador);
					textField.setText("");
				}
			}
		}
	}

	private void botonComenzarJuego() {
		if (listaJugador.getTamano() < 1) {
			JOptionPane.showMessageDialog(null, "No se han agregado Jugadores");
		} else {
			// cargarLetras(letras);
			// System.out.println("Listar: ");
			InterfazJuego interfazJuego = new InterfazJuego();
			frame.setVisible(false);
			interfazJuego.frame.setVisible(true);
		}

	}

	public void agregarJugador(String jugador) {
		crearListaLetras();
		listaJugador.agregarAlInicio(jugador, listaLetrasJugador.getInicial());
		// System.out.println("Listar letras: ");
		// PrincipalMenu.listaLetras.listar();
		// System.out.println("Listar Jugadores: ");
		// listaJugador.listar();
	}

	private void crearListaLetras() {
		listaLetrasJugador = new ListaLetra();
		PrincipalMenu.listaLetras.getTamano();
		String letraPuntuacionValor = "";
		for (int i = 0; i < 7; i++) {
			letraPuntuacionValor = PrincipalMenu.listaLetras.getInicio();
			System.out.println("Letra: " + i + ": " + letraPuntuacionValor);
			String letra = letraPuntuacionValor.split(",")[0];
			int puntuacion = Integer.parseInt(letraPuntuacionValor.split(",")[1]);
			listaLetrasJugador.agregarAlInicio(letra, puntuacion,i);
			letraPuntuacionValor = "";
		}
		listaLetrasJugador.listar();
	}
}
