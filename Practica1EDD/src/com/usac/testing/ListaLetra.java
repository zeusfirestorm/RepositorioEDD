package com.usac.testing;

public class ListaLetra {

	private NodoLetra inicio;
	private int tamano;
	
	
	public void lista() {
		inicio = null;
		tamano = 0;
	}

	public NodoLetra getInicial() {
		return inicio;
	}

	public void setInicio(NodoLetra inicio) {
		this.inicio = inicio;
	}

	public boolean esVacia() {
		return inicio == null;
	}

	public int getTamano() {
		int count = 0;
		if (inicio != null){
			NodoLetra aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
				count ++;
			}
			count++;
		}
		tamano = count;
		return tamano;
	}

	public void agregarAlFinal(String valor, int puntuacion) {
		NodoLetra nuevo = new NodoLetra();
		nuevo.setValorNodo(valor);
		nuevo.setPuntuacion(puntuacion);
		if (esVacia()) {
			inicio = nuevo;
		} else {
			NodoLetra aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		tamano++;
	}

	public void agregarAlInicio(String valor, int puntuacion) {
		NodoLetra nuevo = new NodoLetra();
		nuevo.setValorNodo(valor);
		nuevo.setPuntuacion(puntuacion);
		if (esVacia()) {
			inicio = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
		tamano++;
	}

	public void insertarPorReferencia(String referencia, String valor) {
		NodoLetra nuevo = new NodoLetra();
		nuevo.setValorNodo(valor);
		if (!esVacia()) {
			if (buscar(referencia)) {
				NodoLetra aux = inicio;
				while (aux.getValorNodo() != referencia) {
					aux = aux.getSiguiente();
				}
				NodoLetra siguiente = aux.getSiguiente();
				aux.setSiguiente(nuevo);
				nuevo.setSiguiente(siguiente);
				tamano++;
			}
		}
	}

	public boolean buscar(String referencia) {
		NodoLetra aux = inicio;
		boolean encontrado = false;
		while (aux != null && encontrado != true) {
			String valorNodo = aux.getValorNodo();
			if (referencia.equals(valorNodo)) {
				encontrado = true;
				// System.out.println("encontrado: " + encontrado);
			} else {
				aux = aux.getSiguiente();
			}
		}
		// System.out.println("encontrado1: " + encontrado);
		return encontrado;
	}

	public void insertarPorPosicion(int posicion, String valor) {
		if (posicion >= 0 && posicion <= tamano) {
			NodoLetra nuevo = new NodoLetra();
			nuevo.setValorNodo(valor);
			if (posicion == 0) {
				nuevo.setSiguiente(inicio);
				inicio = nuevo;
			} else {
				if (posicion == tamano) {
					NodoLetra aux = inicio;
					while (aux.getSiguiente() != null) {
						aux = aux.getSiguiente();
					}
					aux.setSiguiente(nuevo);
				} else {
					NodoLetra aux = inicio;
					for (int i = 0; i < (posicion - 1); i++) {
						aux = aux.getSiguiente();
					}
					NodoLetra siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
			}
			tamano++;
		}
	}

	public String getValor(int posicion) {
		System.out.println("Tamano0: " + tamano);
		if (posicion >=0 && posicion <= tamano) {
			if (posicion == 0) {
				return inicio.getValorNodo();
			} else {
				NodoLetra aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				return aux.getValorNodo();
			}
		} else {
			System.out.println("Posición no existe");
			return null;
		}
	}

	public int getPuntuacion(int posicion){
		if (posicion >= 0 && posicion <= tamano) {
			if (posicion == 0) {
				return inicio.getPuntuacion();
			} else {
				NodoLetra aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				return aux.getPuntuacion();
			}
		} else {
			System.out.println("Posición no existe");
			return 0;
		}
	}

	public String getInicio() {
		String valorInicio = inicio.getValorNodo();
		valorInicio = valorInicio + "," + inicio.getPuntuacion();
		inicio = inicio.getSiguiente();
		return valorInicio;
	}
	

	public int getPosition(String referencia) throws Exception {
		if (buscar(referencia)) {
			NodoLetra aux = inicio;
			int count = 0;
			while (aux.getValorNodo() != referencia) {
				count++;
				aux.getSiguiente();
			}
			return count;
		} else {
			throw new Exception("Valor inexistente en la lista.");
		}
	}

	public void editarPorReferencia(String referencia, String valor) {
		if (buscar(referencia)) {
			NodoLetra aux = inicio;
			while (aux.getValorNodo() != referencia) {
				aux = aux.getSiguiente();
			}
			aux.setValorNodo(valor);
		}
	}

	public void editarPorPosicion(int posicion, String valor, int puntuacion) {
		if (posicion >= 0 && posicion <= tamano) {
			if (posicion == 0) {
				inicio.setValorNodo(valor);
				inicio.setPuntuacion(puntuacion);
			} else {
				NodoLetra aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				aux.setValorNodo(valor);
				aux.setPuntuacion(puntuacion);
			}
		}
	}

	public void removerPorReferencia(String referencia) {
		if (buscar(referencia)) {
			if (inicio.getValorNodo() == referencia) {
				inicio = inicio.getSiguiente();
			} else {
				NodoLetra aux = inicio;
				while (aux.getSiguiente().getValorNodo() != referencia) {
					aux.getSiguiente();
				}
				NodoLetra siguiente = aux.getSiguiente().getSiguiente();
				aux.setSiguiente(siguiente);
			}
		}
		tamano--;
	}

	public void removerPorPosicion(int posicion) {
		if (posicion > 0 && posicion < tamano) {
			if (posicion == 0) {
				inicio = inicio.getSiguiente();
			} else {
				NodoLetra aux = inicio;
				for (int i = 0; i < posicion - 1; i++) {
					aux = aux.getSiguiente();
				}
				NodoLetra siguiente = aux.getSiguiente();
				aux.setSiguiente(siguiente.getSiguiente());
			}
			tamano--;
		}
	}

	public void eliminar() {
		inicio = null;
		tamano = 0;
	}

	public void listar() {
		if (!esVacia()) {
			NodoLetra aux = inicio;
			int i = 0;
			while (aux != null) {
				System.out.print(i + ".[ " + aux.getValorNodo() + "," + aux.getPuntuacion() + " ]" + " ->  ");
				aux = aux.getSiguiente();
				i++;
			}
			System.out.println();
		}
	}

}
