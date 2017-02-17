package com.usac.edd.interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.usac.testing.ListaCircular;
import com.usac.testing.ListaLetra;
import com.usac.testing.Nodo;
import com.usac.testing.NodoJugador;
import com.usac.testing.NodoLetra;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfazJuego {

	JFrame frame;
	private JLabel letraActiva1;
	private JLabel letraActiva2;
	private JLabel letraActiva3;
	private JLabel letraActiva4;
	private JLabel letraActiva5;
	private JLabel letraActiva6;
	private JLabel letraActiva7;
	private JLabel JugadorEnTurno;
	JCheckBox cbLetra1;
	JCheckBox cbLetra2;
	JCheckBox cbLetra3;
	JCheckBox cbLetra4;
	JCheckBox cbLetra5;
	JCheckBox cbLetra6;
	JCheckBox cbLetra7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJuego window = new InterfazJuego();
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
	public InterfazJuego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.setBounds(100, 100, 826, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnListar = new JButton(IngresoJugadores.listaJugador.getInicio().getValorNodo());
		btnListar.setBounds(570, 35, 87, 23);
		frame.getContentPane().add(btnListar);

		letraActiva7 = new JLabel(llenarLetras(jugadorActivo, 7));
		letraActiva7.setBounds(313, 352, 39, 23);
		frame.getContentPane().add(letraActiva7);
		letraActiva7.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		letraActiva6 = new JLabel(llenarLetras(jugadorActivo, 6));
		letraActiva6.setBounds(264, 352, 39, 23);
		frame.getContentPane().add(letraActiva6);
		letraActiva6.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		letraActiva5 = new JLabel(llenarLetras(jugadorActivo, 5));
		letraActiva5.setBounds(215, 352, 39, 23);
		frame.getContentPane().add(letraActiva5);
		letraActiva5.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		letraActiva4 = new JLabel(llenarLetras(jugadorActivo, 4));
		letraActiva4.setBounds(166, 352, 39, 23);
		frame.getContentPane().add(letraActiva4);
		letraActiva4.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		letraActiva3 = new JLabel(llenarLetras(jugadorActivo, 3));
		letraActiva3.setBounds(121, 352, 35, 23);
		frame.getContentPane().add(letraActiva3);
		letraActiva3.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		letraActiva2 = new JLabel(llenarLetras(jugadorActivo, 2));
		letraActiva2.setBounds(72, 352, 39, 23);
		frame.getContentPane().add(letraActiva2);
		letraActiva2.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		letraActiva1 = new JLabel(llenarLetras(jugadorActivo, 1));
		letraActiva1.setBounds(23, 352, 39, 23);
		frame.getContentPane().add(letraActiva1);
		letraActiva1.setHorizontalAlignment(SwingConstants.CENTER);
		letraActiva1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JugadorEnTurno = new JLabel(jugadorActivo.getValorNodo());
		JugadorEnTurno.setBorder(new LineBorder(new Color(0, 0, 0)));
		JugadorEnTurno.setBounds(402, 30, 118, 32);
		frame.getContentPane().add(JugadorEnTurno);

		cbLetra1 = new JCheckBox(llenarLetras(jugadorActivo, 1));
		cbLetra1.setBounds(402, 276, 52, 23);
		frame.getContentPane().add(cbLetra1);

		cbLetra2 = new JCheckBox(llenarLetras(jugadorActivo, 2));
		cbLetra2.setBounds(402, 302, 52, 23);
		frame.getContentPane().add(cbLetra2);

		cbLetra3 = new JCheckBox(llenarLetras(jugadorActivo, 3));
		cbLetra3.setBounds(402, 328, 52, 23);
		frame.getContentPane().add(cbLetra3);

		cbLetra4 = new JCheckBox(llenarLetras(jugadorActivo, 4));
		cbLetra4.setBounds(402, 354, 52, 23);
		frame.getContentPane().add(cbLetra4);

		cbLetra5 = new JCheckBox(llenarLetras(jugadorActivo, 5));
		cbLetra5.setBounds(456, 276, 52, 23);
		frame.getContentPane().add(cbLetra5);

		cbLetra6 = new JCheckBox(llenarLetras(jugadorActivo, 6));
		cbLetra6.setBounds(456, 302, 52, 23);
		frame.getContentPane().add(cbLetra6);

		cbLetra7 = new JCheckBox(llenarLetras(jugadorActivo, 7));
		cbLetra7.setBounds(456, 328, 52, 23);
		frame.getContentPane().add(cbLetra7);

		JButton btnCambiarLetra = new JButton("Cambiar Letra");
		btnCambiarLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra();
			}
		});
		btnCambiarLetra.setBounds(402, 384, 124, 23);
		frame.getContentPane().add(btnCambiarLetra);

		list = new JList();
		list.setBounds(456, 163, 101, 72);
		frame.getContentPane().add(list);

		scrollPane_1 = new JScrollPane(list);
		scrollPane_1.setBounds(402, 105, 101, 72);
		frame.getContentPane().add(scrollPane_1);
		
		btnAgregarPalabra = new JButton("Agregar Palabra");
		btnAgregarPalabra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tfNuevaPalabra.getText().equals("")) {
					PrincipalMenu.listaPalabras.agregarAlInicio(tfNuevaPalabra.getText());
					tfNuevaPalabra.setText("");
				}
			}
		});
		btnAgregarPalabra.setBounds(402, 236, 143, 23);
		frame.getContentPane().add(btnAgregarPalabra);
		
		tfNuevaPalabra = new JTextField();
		tfNuevaPalabra.setBounds(402, 200, 143, 20);
		frame.getContentPane().add(tfNuevaPalabra);
		tfNuevaPalabra.setColumns(10);

		llenarListaJugadores();

		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// IngresoJugadores.listaJugador.listar();
				PrincipalMenu.listaPalabras.listar();
				// siguienteJugador();

			}
		});
	}

	Nodo jugadorActivo = IngresoJugadores.listaJugador.getInicio();
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JButton btnAgregarPalabra;
	private JTextField tfNuevaPalabra;

	private void siguienteJugador() {
		jugadorActivo = jugadorActivo.getSiguiente();
		actualizarValores();
	}

	private void actualizarValores() {
		JugadorEnTurno.setText(jugadorActivo.getValorNodo());
		letraActiva1.setText(llenarLetras(jugadorActivo, 1));
		letraActiva2.setText(llenarLetras(jugadorActivo, 2));
		letraActiva3.setText(llenarLetras(jugadorActivo, 3));
		letraActiva4.setText(llenarLetras(jugadorActivo, 4));
		letraActiva5.setText(llenarLetras(jugadorActivo, 5));
		letraActiva6.setText(llenarLetras(jugadorActivo, 6));
		letraActiva7.setText(llenarLetras(jugadorActivo, 7));
		cbLetra1.setText(llenarLetras(jugadorActivo, 1));
		cbLetra2.setText(llenarLetras(jugadorActivo, 2));
		cbLetra3.setText(llenarLetras(jugadorActivo, 3));
		cbLetra4.setText(llenarLetras(jugadorActivo, 4));
		cbLetra5.setText(llenarLetras(jugadorActivo, 5));
		cbLetra6.setText(llenarLetras(jugadorActivo, 6));
		cbLetra7.setText(llenarLetras(jugadorActivo, 7));
		cbLetra1.setSelected(false);
		cbLetra2.setSelected(false);
		cbLetra3.setSelected(false);
		cbLetra4.setSelected(false);
		cbLetra5.setSelected(false);
		cbLetra6.setSelected(false);
		cbLetra7.setSelected(false);
		list.updateUI();
	}

	private void cambiarLetra() {
		if (cbLetra1.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra2.getText());
			cambiarLetraProceso(0);
		}
		if (cbLetra2.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra2.getText());
			cambiarLetraProceso(1);
		}
		if (cbLetra3.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra3.getText());
			cambiarLetraProceso(2);
		}
		if (cbLetra4.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra4.getText());
			cambiarLetraProceso(3);
		}
		if (cbLetra5.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra5.getText());
			cambiarLetraProceso(4);
		}
		if (cbLetra6.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra6.getText());
			cambiarLetraProceso(5);
		}
		if (cbLetra7.isSelected()) {
			System.out.println("Cambiar letra: " + cbLetra7.getText());
			cambiarLetraProceso(6);
		}
		actualizarValores();
	}

	private void cambiarLetraProceso(int numeroLetra) {
		ListaLetra letraCambiarLetra = new ListaLetra();
		letraCambiarLetra.setInicio(jugadorActivo.getLetras());
		letraCambiarLetra.getTamano();
		System.out.println("Lista Letra Antes: ");
		letraCambiarLetra.listar();
		System.out.println("Lista antes: ");
		PrincipalMenu.listaLetras.listar();
		PrincipalMenu.listaLetras.agregarAlFinal(letraCambiarLetra.getValor(numeroLetra),
				letraCambiarLetra.getPuntuacion(numeroLetra));
		String valoresLetra = PrincipalMenu.listaLetras.getInicio();
		letraCambiarLetra.editarPorPosicion(numeroLetra, valoresLetra.split(",")[0],
				Integer.parseInt(valoresLetra.split(",")[1]));
		System.out.println("Lista Letra Despues: ");
		letraCambiarLetra.listar();
		System.out.println("Lista despues: ");
		PrincipalMenu.listaLetras.listar();
	}

	private String llenarLetras(Nodo jugador, int posicion) {
		NodoLetra nodoLetraX = jugador.getLetras();
		int count = 1;
		while (nodoLetraX.getSiguiente() != null) {
			String valor = nodoLetraX.getValorNodo();
			nodoLetraX = nodoLetraX.getSiguiente();
			count++;
			if (count - 1 == posicion) {
				return valor;
			}
		}
		return nodoLetraX.getValorNodo();
	}

	private void llenarListaJugadores() {
		ListaCircular jugadores = IngresoJugadores.listaJugador;
		Nodo nodoJugador = jugadores.getInicio();
		DefaultListModel modelo = new DefaultListModel();
		do {
			modelo.addElement(nodoJugador.getValorNodo() + " - " + nodoJugador.getPuntos());
			nodoJugador = nodoJugador.getSiguiente();
		} while (nodoJugador.getSiguiente() != jugadores.getInicio());
		System.out.println("Jugadores: " + nodoJugador.getValorNodo());
		modelo.addElement(nodoJugador.getValorNodo() + " - " + nodoJugador.getPuntos());
		list.setModel(modelo);
		list.updateUI();
	}
}
