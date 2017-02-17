package com.usac.testing;

public class NodoJugador {
	private String valorNodo;
	NodoJugador siguiente;
	NodoLetra nodoLetras;

	public void NodoJugador() {
		this.valorNodo = "";
		this.siguiente = null;
	}

	public String getValorNodo() {
		return valorNodo;
	}

	public void setValorNodo(String valorNodo) {
		this.valorNodo = valorNodo;
	}

	public NodoJugador getSiguiente() {
		return this.siguiente;
	}

	public void setSiguiente(NodoJugador siguiente) {
		this.siguiente = siguiente;
	}

	public NodoLetra getNodoLetras() {
		return this.nodoLetras;
	}

	public void setNodoLetras(NodoLetra nodoLetras) {
		this.nodoLetras = nodoLetras;
	}
}
