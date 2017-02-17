package com.usac.testing;

public class Nodo {
	private String valorNodo;
	private Nodo siguiente;
	private NodoLetra letras;
	private int puntos;
	
	public Nodo() {
		this.valorNodo = "";
		this.siguiente = null;
		this.letras = null;
		this.setPuntos(0);
	}

	public String getValorNodo() {
		return valorNodo;
	}

	public void setValorNodo(String valorNodo) {
		this.valorNodo = valorNodo;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public NodoLetra getLetras() {
		return letras;
	}

	public void setLetras(NodoLetra letras) {
		this.letras = letras;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
