package com.usac.testing;

public class MatrizOrtogonal {
	NodoMatriz inicio;

	public MatrizOrtogonal(int tamano) {
		NodoMatriz nuevoNodoX = new NodoMatriz();
		if (esVacia()) {
			nuevoNodoX.setX(0);
			nuevoNodoX.setY(0);
			inicio = nuevoNodoX;
		} else {
			NodoMatriz aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevoNodoX);
		}

		for (int posX = 0; posX < tamano; posX++) {
			nuevoNodoX = new NodoMatriz();

			for (int posY = 1; posY < tamano; posY++) {
//				NodoMatriz nuevoNodoY = new NodoMatriz(posX, posY);
//				nuevoNodoX.setAbajo(nuevoNodoY);
			}
			if (posX == 0) {
				inicio = nuevoNodoX;
			} else {
				nuevoNodoX.setSiguiente(nuevoNodoX);
			}

		}
	}

	public boolean esVacia() {
		return inicio == null;
	}

//	public void crearMatriz(int tamano) {
//		// inicio = new NodoMatriz(0, 0);
//		NodoMatriz nuevoNodoX;
//		for (int posX = 0; posX < tamano; posX++) {
//			nuevoNodoX = new NodoMatriz(posX, 0);
//			for (int posY = 1; posY < tamano; posY++) {
//				NodoMatriz nuevoNodoY = new NodoMatriz(posX, posY);
//				nuevoNodoX.setAbajo(nuevoNodoY);
//			}
//			if (posX == 0) {
//				inicio = nuevoNodoX;
//			}
//		}
//	}

	public void recorrer() {

	}

}
