package com.usac.testing;

public class NodoLetra {
	private String valorNodo;
	private NodoLetra siguiente;
	private int puntuacion;

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public NodoLetra getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLetra siguiente) {
		this.siguiente = siguiente;
	}

	public String getValorNodo() {
		return valorNodo;
	}

	public void setValorNodo(String valorNodo) {
		this.valorNodo = valorNodo;
	}

}
