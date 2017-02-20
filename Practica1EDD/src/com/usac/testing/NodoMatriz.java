package com.usac.testing;

public class NodoMatriz {

	NodoMatriz siguiente;
	NodoMatriz anterior;
	NodoMatriz abajo;
	NodoMatriz arriba;

	int x;
	int y;

	String imagen;

	public NodoMatriz() {
		this.x = 0;
		this.y = 0;
		imagen = "null";
		siguiente = anterior = abajo = arriba = null;
	}

	public NodoMatriz getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoMatriz siguiente) {
		this.siguiente = siguiente;
	}

	public NodoMatriz getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoMatriz anterior) {
		this.anterior = anterior;
	}

	public NodoMatriz getAbajo() {
		return abajo;
	}

	public void setAbajo(NodoMatriz abajo) {
		this.abajo = abajo;
	}

	public NodoMatriz getArriba() {
		return arriba;
	}

	public void setArriba(NodoMatriz arriba) {
		this.arriba = arriba;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}