package com.usac.edd.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.usac.edd.interfaz.IngresoJugadores;
import com.usac.edd.interfaz.PrincipalMenu;
import com.usac.testing.ListaCircular;
import com.usac.testing.Nodo;
import com.usac.testing.NodoLetra;

public class GenerarCodGraphviz {
	String encabezado = "digraph J {  graph [resolution=512, fontname=Arial, fontsize=50 ]; \nratio=\"fill\";\nsize=\"10,5!\"\n"
			+ "node [shape=circle,fixedsize=true,width=0.9];node[fontsize=60];\n";	
	
	public void generarColaFichas(){
		NodoLetra colaFichas = PrincipalMenu.listaLetras.getInicial();
		NodoLetra aux = colaFichas;
		String codigoCuerpo = encabezado;
		while(aux.getSiguiente()!=null){
			//System.out.println("Restantes: " + aux.getValorNodo());
			codigoCuerpo = codigoCuerpo + aux.getValorNodo() + aux.getPos() + " -> "+ aux.getSiguiente().getValorNodo()+ aux.getSiguiente().getPos() + ";\n";
			aux = aux.getSiguiente();
		}
		codigoCuerpo = codigoCuerpo + "rankdir=LR;\n}";
		System.out.println("Restantes: " + codigoCuerpo);
		generarArchivoDotJugadores(codigoCuerpo, "Fichas");
	}
	
	public void generarCodigoPalabras(){
		Nodo palabra = PrincipalMenu.listaPalabras.getInicial(); 
		Nodo aux = palabra;
		String codigoCuerpo = encabezado;
		while(aux.getSiguiente()!= null){
			System.out.println("Palabras: " + aux.getValorNodo());
			codigoCuerpo = codigoCuerpo + aux.getValorNodo() + " -> " + aux.getSiguiente().getValorNodo() + ";\n";
			aux = aux.getSiguiente();
		}
		codigoCuerpo = codigoCuerpo + "\n}";
		System.out.println("Palabrasv"+ codigoCuerpo);
		generarArchivoDotJugadores(codigoCuerpo, "Palabras");
	}
	
	public void generarCodigoMonedas(Nodo jugadorActivo) {
		System.out.println("generarCodigoMonedas()");
		NodoLetra nodoLetra = jugadorActivo.getLetras();
		NodoLetra nodoAux = nodoLetra;
		String codigoCuerpo = encabezado;
		while (nodoAux.getSiguiente() != null) {

			String letra = nodoAux.getValorNodo() + nodoAux.getPos();
			String letraSiguiente = nodoAux.getSiguiente().getValorNodo() + nodoAux.getSiguiente().getPos();
			System.out.println("POSICIONES " + letra + " : " + letraSiguiente);
			codigoCuerpo = codigoCuerpo + letra + " -> " + letraSiguiente + ";\n";
			nodoAux = nodoAux.getSiguiente();
		}
		codigoCuerpo = codigoCuerpo + "rankdir=LR;\n}";
		generarArchivoDotJugadores(codigoCuerpo, "Monedas");
	}

	public void generarCodigoJugador() {
		ListaCircular jugadores = IngresoJugadores.listaJugador;
		Nodo nodoJugador = jugadores.getInicio();
		String codigoCuerpo = encabezado;
		do {
			System.out.println("NombreJugador: " + nodoJugador.getValorNodo());
			codigoCuerpo = codigoCuerpo + nodoJugador.getValorNodo() + " -> "
					+ nodoJugador.getSiguiente().getValorNodo() + ";\n";
			nodoJugador = nodoJugador.getSiguiente();
		} while (nodoJugador.getSiguiente() != jugadores.getInicio());
		System.out.println("NombreJugador");
		codigoCuerpo = codigoCuerpo + nodoJugador.getValorNodo() + " -> " + nodoJugador.getSiguiente().getValorNodo()
				+ ";\n";
		codigoCuerpo = codigoCuerpo + "rankdir=LR;\n}";
		System.out.println(codigoCuerpo);
		generarArchivoDotJugadores(codigoCuerpo, "Graficas");
	}

	public void generarArchivoDotJugadores(String contenido, String nombre) {
		String ruta = "C:\\DiagramasEDD\\" + nombre + ".dot";
		System.out.println("Ruta: " + ruta);
		File archivo = new File(ruta);
		BufferedWriter bw;
		try {

			if (archivo.exists()) {
				System.out.println("Existe!! ");
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(contenido);
			} else {
				System.out.println("NO Existe!! ");
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(contenido);
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		generarImagen(nombre);
	}

	public void generarImagen(String nombre) {
		try {
			System.out.println("Nombre: " + nombre);
			String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

			String fileInputPath = "C:\\DiagramasEDD\\" + nombre + ".dot";

			String fileOutputPath = "C:\\DiagramasEDD\\" + nombre + ".jpg";

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
