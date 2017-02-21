package com.usac.testing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.usac.edd.utils.LoadXML;

public class TestingEDD {
	public TestingEDD(){
		
	}

	public static void main(String[] args) throws Exception {
		// // TODO Auto-generated method stub
		// System.out.println("Pruebas EDD");
		// Lista lista = new Lista();
		//
		// System.out.println("<<-- Ejemplo de lista simple -->>\n");
		//
		// // Agregar al final de la lista
		// lista.agregarAlFinal("12");
		// lista.agregarAlFinal("15");
		// lista.agregarAlFinal("9");
		// // Agregar in inicio de la lista
		// lista.agregarAlInicio("41");
		// lista.agregarAlInicio("6");
		//
		// System.out.println("<<-- Lista -->>");
		// lista.listar();
		// LoadXML loadXml = new LoadXML();
		// loadXml.cargarXML();

		// ListaCircular listaCircular = new ListaCircular();
		//
		// System.out.println("<<-- Ejemplo de lista circular simple -->>\n");
		//
		// // Agregar al final de la lista circular
		// listaCircular.agregarAlFinal("12");
		// listaCircular.agregarAlFinal("15");
		// listaCircular.agregarAlFinal("9");
		// // Agregar in inicio de la lista circular
		// listaCircular.agregarAlInicio("41");
		// listaCircular.agregarAlInicio("6");
		//
		// System.out.println("<<-- Lista Circular -->>");
		// listaCircular.listar();
		//
		// System.out.println("\n\n<<-- Tamaño -->");
		// System.out.println(listaCircular.getTamano());
		//
		// System.out.println("\n<<-- Obtener el valor del nodo en la posicion 3
		// -->>");
		// System.out.println(listaCircular.getValor(3));
		//
		// System.out.println("\nInsrta un nodo con valor 16 despues del 15");
		// listaCircular.insertarPorReferencia("15", "16");
		// listaCircular.listar();
		// System.out.print(" | Tamaño: ");
		// System.out.println(listaCircular.getTamano());
		//
		// System.out.println("\n\nInsrta un nodo con valor 44 en la posición
		// 5");
		// listaCircular.insertarPorPosicion(5, "44");
		// listaCircular.listar();
		// System.out.print(" | Tamaño: ");
		// System.out.println(listaCircular.getTamano());

		// System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
		// //listaCircular.editarPorReferencia(12, 13);
		// listaCircular.listar();
		// System.out.print(" | Tamaño: ");
		// System.out.println(listaCircular.getTamano());

		// System.out.println("\nActualiza el valor nodo en la posición 0 por
		// 17");
		// listaCircular.editarPorPosicion(0, 17);
		// listaCircular.listar();
		// System.out.print(" | Tamaño: ");
		// System.out.println(listaCircular.getTamanio());

		// System.out.println("\nElimina el nodo con el valor 41");
		// listaCircular.removerPorReferencia("41");
		// listaCircular.listar();
		// System.out.print(" | Tamaño: ");
		// System.out.println(listaCircular.getTamano());
		//
		// System.out.println("\nElimina el nodo en la posición 4");
		// listaCircular.removerPorPosicion(4);
		// listaCircular.listar();
		// System.out.print(" | Tamaño: ");
		// System.out.println(listaCircular.getTamano());
		//
		// System.out.println("\nConsulta si existe el valor 30");
		// System.out.println(listaCircular.buscar("30"));
		//
		// System.out.println("\nConsulta la posicion del valor 16");
		// System.out.println(listaCircular.getPosition("16"));
		//
		// System.out.println("\nElimina la lista");
		// listaCircular.eliminar();
		//
		// System.out.println("\nConsulta si la lista está vacia");
		// System.out.println(listaCircular.esVacia());
		//
		// System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
		// String letras = "abc";
		// char a = letras.charAt(1);
		// System.out.println("LETRA " + a);
		// llenarletras(abecedario);
		// }
		// static String finalletras = "";
		// static String abecedario =
		// "aaaaaaaaaaaaeeeeeeeeeeeeoooooooooiiiiiissssssnnnnnllllrrrrruuuuuttttdddddggccccbbmmpphhfvyqjñxz";
		// static void llenarletras (String abc){
		//
		// //int posicion = 0;
		//
		// int longitud = abc.length();
		// int posicion = (int) (Math.random()*longitud);
		//
		// System.out.println("Longitud palabra: " + longitud);
		// System.out.println("Posición a extraer: " + posicion);
		//
		// char a = abc.charAt(posicion);
		// System.out.println("Letra a Extraer: " + a);
		//
		// String remanente = "";
		// System.out.println("Pos1: " + abc);
		//
		// for (int i = 0; i < abc.length(); i++) {
		// char b = abc.charAt(i);
		// if (a==b && posicion == i) {
		// finalletras = finalletras + b;
		// continue;
		// }
		// remanente = remanente + b;
		// }
		// System.out.println("Pos2: " + remanente);
		// System.out.println("final Letras: " + finalletras);
		// System.out.println();
		// if (remanente.length()>0) {
		// llenarletras(remanente);
		// }
		// obtenerPuntuacion('c');
		// MatrizOrtogonal matrizOrtogona = new MatrizOrtogonal(5);
		// new TestingEDD("C:\\DiagramasEDD\\Graficas.txt",
		// "C:\\DiagramasEDD\\Graficas.jpg");
		generar();
//		ImageIcon image = new ImageIcon("Graficas.jpg");
//		System.out.println("TamanoImagen: " + image.getIconHeight() + " : " + image.getIconHeight());
		//TestingEDD  test = new TestingEDD();
		//test.abc("file:///C:/DiagramasEDD/Graficas.jpg");
//		String encabezado = "\"diagraph J { \nratio=\"fill\";\nsize=\"2,2.5!\";\nmargin=0; \n"
//				+ "node[height=0.02, width=0.01];\nnode [shape=circle];\nnode [style=filled];"
//				+ "\nnode [fillcolor=\"#EEEEEE\"];\nnode [color=\"#EEEEEE\"];\nedge [color=\"#31CEF0\"];\n";
//		System.out.println(encabezado);
		
		MatrizOrtogonal matriz = new MatrizOrtogonal(5);
		matriz.recorrer();
		
	}

	// static private void obtenerPuntuacion(char letra){
	// System.out.println('c'|'x');
	// switch (letra) {
	// case 'a'|'o'|'e'|'i'|'s'|'n'|'l'|'r'|'u'|'t':
	// System.out.println(1); ;
	// case 'd' || case'g':
	// System.out.println(2);
	// case ('c'):
	// System.out.println(3);
	// //C ×4, B ×2, M ×2, P ×2
	// default:
	// break;
	// }
	// }

	public TestingEDD(String direccionDot, String direccionPng) {
		dibujar(direccionDot, direccionPng);
	}
	BufferedImage fondo;
	public void dibujar(String direccionDot, String direccionPng) {
		try {
			ProcessBuilder pbuilder;

			/*
			 * Realiza la construccion del comando en la linea de comandos esto
			 * es: dot -Tpng -o archivo.png archivo.dot
			 */
			pbuilder = new ProcessBuilder("dot", "-Tpng", "-o", direccionPng, direccionDot);
			pbuilder.redirectErrorStream(true);
			// Ejecuta el proceso
			pbuilder.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void abc(String ruta) {
		try {
			URL url = new URL(ruta);
			Image image = ImageIO.read(url.openStream());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

	}

	public static void generar() {
		try {

			String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

			String fileInputPath = "C:\\DiagramasEDD\\Monedas.dot";

			String fileOutputPath = "C:\\DiagramasEDD\\Monedas.jpg";

			String tParam = "-Tjpg";

			String tOParam = "-o";
			
			String[] cmd = new String[5];
			cmd[0] = dotPath;
			cmd[1] = tParam;
			cmd[2] = fileInputPath;
			cmd[3] = tOParam;
			cmd[4] = fileOutputPath;

			Runtime rt = Runtime.getRuntime();
			rt.exec(cmd);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
		}
	}
}
