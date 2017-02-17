package com.usac.testing;

public class ListaCircular {
	private Nodo inicio;
	private Nodo ultimo;
	private int tamano;
	private Nodo letras;

	public void ListaCircular() {
		inicio = null;
		ultimo = null;
		// letras = null;
		tamano = 0;
		letras = null;
	}

	public Nodo getInicio() {
		return this.inicio;
	}

	public boolean esVacia() {
		return inicio == null;
	}

	public int getTamano() {
		return tamano;
	}

	// public void agregarLetras(Nodo nodoLetra) {
	// letras = nodoLetra;
	// }

	public void agregarAlFinal(String valorNodo) {
		Nodo nuevo = new Nodo();
		nuevo.setValorNodo(valorNodo);
		if (esVacia()) {
			inicio = nuevo;
			ultimo = nuevo;
			ultimo.setSiguiente(ultimo);
		} else {
			ultimo.setSiguiente(nuevo);
			nuevo.setSiguiente(inicio);
			ultimo = nuevo;
		}
		tamano++;
	}

	public void agregarAlInicio(String valorNodo, NodoLetra letras) {
		Nodo nuevo = new Nodo();
		nuevo.setValorNodo(valorNodo);
		nuevo.setLetras(letras);
		if (esVacia()) {
			inicio = nuevo;
			ultimo = nuevo;
			ultimo.setSiguiente(inicio);
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
			ultimo.setSiguiente(inicio);
		}
		tamano++;
	}

	public void insertarPorReferencia(String referencia, String valorNodo) {
		Nodo nuevo = new Nodo();
		nuevo.setValorNodo(valorNodo);
		if (!esVacia()) {
			if (buscar(referencia)) {
				Nodo aux = inicio;
				while (!aux.getValorNodo().equals(referencia)) {
					aux = aux.getSiguiente();
				}
				if (aux == ultimo) {
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(inicio);
					ultimo = nuevo;
				} else {
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
				tamano++;
			}
		}
	}

	public boolean buscar(String referencia) {
		Nodo aux = inicio;
		boolean encontrado = false;
		do {
			if (referencia.equals(aux.getValorNodo())) {
				encontrado = true;
			} else {
				aux = aux.getSiguiente();
			}
		} while (aux != inicio && encontrado != true);
		return encontrado;
	}

	public int getPosition(String referencia) throws Exception {
		if (buscar(referencia)) {
			Nodo aux = inicio;
			int count = 0;
			while (!aux.getValorNodo().equals(referencia)) {
				count++;
				aux.getSiguiente();
			}
			return count;
		} else {
			throw new Exception("Valor inexistente en la lista.");
		}
	}

	public void insertarPorPosicion(int posicion, String valorNodo) {
		if (posicion > 0 && posicion < tamano) {

			Nodo nuevo = new Nodo();
			nuevo.setValorNodo(valorNodo);

			if (posicion == 0) {
				nuevo.setSiguiente(inicio);
				inicio = nuevo;
				ultimo.setSiguiente(inicio);
			} else {
				if (posicion == tamano) {
					ultimo.setSiguiente(nuevo);
					nuevo.setSiguiente(inicio);
					ultimo = nuevo;
				} else {
					Nodo aux = inicio;
					for (int i = 0; i < (posicion - 1); i++) {
						aux = aux.getSiguiente();
					}
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
			}
			tamano++;
		}
	}

	public String getValor(int posicion) throws Exception {
		if (posicion > 0 && posicion < tamano) {
			if (posicion == 0) {
				return inicio.getValorNodo();
			} else {
				Nodo aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				return aux.getValorNodo();
			}
		} else {
			throw new Exception("Posicion inexistente en la lista.");
		}
	}

	public void removerPorReferencia(String referencia) {
		if (buscar(referencia)) {
			if (inicio.getValorNodo().equals(referencia)) {
				inicio = inicio.getSiguiente();
				ultimo.setSiguiente(inicio);
			} else {
				Nodo aux = inicio;
				while (!aux.getSiguiente().getValorNodo().equals(referencia)) {
					aux = aux.getSiguiente();
				}
				if (aux.getSiguiente() == ultimo) {
					aux.setSiguiente(inicio);
					ultimo = aux;
				} else {
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(siguiente.getSiguiente());
				}
			}
			tamano--;
		}
	}

	public void removerPorPosicion(int posicion) {
		if (posicion > 0 && posicion < tamano) {
			if (posicion == 0) {
				inicio = inicio.getSiguiente();
				ultimo.setSiguiente(inicio);
			} else {
				Nodo aux = inicio;
				for (int i = 0; i < posicion - 1; i++) {
					aux = aux.getSiguiente();
				}
				if (aux.getSiguiente() == ultimo) {
					aux.setSiguiente(inicio);
					ultimo = aux;
				} else {
					Nodo siguiente = aux.getSiguiente();
					aux.setSiguiente(siguiente.getSiguiente());
				}
			}
			tamano--;
		}
	}

	public void eliminar() {
		inicio = null;
		ultimo = null;
		tamano = 0;
	}

	public void listar() {
		if (!esVacia()) {
			Nodo aux = inicio;
			int i = 0;
			System.out.print("-> ");
			do {
				System.out.print(i + ".[ " + aux.getValorNodo() + " ]" + " ->  ");
				aux = aux.getSiguiente();
				i++;
			} while (aux != inicio);
			System.out.println();
		}
	}
}
