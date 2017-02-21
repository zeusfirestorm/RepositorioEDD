package com.usac.testing;

public class MatrizOrtogonal {
	NodoMatriz inicio;

	public MatrizOrtogonal(int tamano) {
		System.out.println("Crear");
		NodoMatriz nuevoNodoX = new NodoMatriz();
		NodoMatriz nuevoNodoY = new NodoMatriz();

		nuevoNodoX.setX(0);
		nuevoNodoX.setY(0);
		inicio = nuevoNodoX;

		NodoMatriz aux = inicio;
		int countX = 1;
		while (countX < tamano) {
			nuevoNodoX = new NodoMatriz();
			nuevoNodoX.setX(countX);
			nuevoNodoX.setY(0);
			int countY = 1;
			NodoMatriz aux2 = new NodoMatriz();
			while (countY < tamano) {
				aux2 = aux;
				nuevoNodoY = new NodoMatriz();
				nuevoNodoY.setX(countX);
				nuevoNodoY.setY(countY);
				System.out.println("x,y" + countX+ countX);
				aux2.setAbajo(nuevoNodoY);
				aux2 = aux.getAbajo();
				countY++;
			}
			aux.setSiguiente(nuevoNodoX);
			aux = aux.getSiguiente();
			countX++;
		}

		// for (int posX = 0; posX < tamano; posX++) {
		// nuevoNodoX = new NodoMatriz();
		//
		// for (int posY = 1; posY < tamano; posY++) {
		//// NodoMatriz nuevoNodoY = new NodoMatriz(posX, posY);
		//// nuevoNodoX.setAbajo(nuevoNodoY);
		// }
		// if (posX == 0) {
		// inicio = nuevoNodoX;
		// } else {
		// nuevoNodoX.setSiguiente(nuevoNodoX);
		// }
		//
		// }
	}

	public boolean esVacia() {
		return inicio == null;
	}

	// public void crearMatriz(int tamano) {
	// // inicio = new NodoMatriz(0, 0);
	// NodoMatriz nuevoNodoX;
	// for (int posX = 0; posX < tamano; posX++) {
	// nuevoNodoX = new NodoMatriz(posX, 0);
	// for (int posY = 1; posY < tamano; posY++) {
	// NodoMatriz nuevoNodoY = new NodoMatriz(posX, posY);
	// nuevoNodoX.setAbajo(nuevoNodoY);
	// }
	// if (posX == 0) {
	// inicio = nuevoNodoX;
	// }
	// }
	// }

	public void recorrer() {
		NodoMatriz nodo = new NodoMatriz();
		nodo = inicio;
		while (nodo.getSiguiente() != null) {
			System.out.print("(" + nodo.getX() + "," + nodo.getY() + ") ");
			NodoMatriz nodoY = new NodoMatriz();
			nodoY = nodo;
			while (nodoY.getAbajo()!= null) {
				System.out.print("(1" + nodoY.getX() + "," + nodoY.getY() + ") ");
				nodoY = nodoY.getAbajo();
			}
			nodo = nodo.getSiguiente();
		}
		System.out.print("(" + nodo.getX() + "," + nodo.getY() + ") \n");
	}

}
