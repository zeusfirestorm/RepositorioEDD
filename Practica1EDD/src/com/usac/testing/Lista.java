package com.usac.testing;

public class Lista {
	private Nodo inicio;
	private int tamano;

	public void lista() {
		inicio = null;
		tamano = 0;
	}

	public Nodo getInicial(){
		return inicio;
	}
	
	public void setInicio(Nodo inicio){
		this.inicio = inicio;
	}
	public boolean esVacia() {
		return inicio == null;
	}

	public int getTamano() {
		return tamano;
	}

	public void agregarAlFinal(String valor) {
		Nodo nuevo = new Nodo();
		nuevo.setValorNodo(valor);
		if (esVacia()) {
			inicio = nuevo;
		} else {
			Nodo aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		tamano++;
	}

	public void agregarAlInicio(String valor) {
		Nodo nuevo = new Nodo();
		nuevo.setValorNodo(valor);
		if (esVacia()) {
			inicio = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
		tamano++;
	}

	public void insertarPorReferencia(String referencia, String valor) {
		Nodo nuevo = new Nodo();
		nuevo.setValorNodo(valor);
		if (!esVacia()) {
			if (buscar(referencia)) {
				Nodo aux = inicio;
				while (aux.getValorNodo() != referencia) {
					aux = aux.getSiguiente();
				}
				Nodo siguiente = aux.getSiguiente();
				aux.setSiguiente(nuevo);
				nuevo.setSiguiente(siguiente);
				tamano++;
			}
		}
	}

	public boolean buscar(String referencia) {
		Nodo aux = inicio;
		boolean encontrado = false;
		while (aux != null && encontrado != true) {
			String valorNodo = aux.getValorNodo();
			if (referencia.equals(valorNodo)) {
				encontrado = true;
				//System.out.println("encontrado: " + encontrado);
			} else {
				aux = aux.getSiguiente();
			}
		}
		//System.out.println("encontrado1: " + encontrado);
		return encontrado;
	}

	public void insertarPorPosicion(int posicion, String valor) {
		if (posicion >= 0 && posicion <= tamano) {
			Nodo nuevo = new Nodo();
			nuevo.setValorNodo(valor);
			if (posicion == 0) {
				nuevo.setSiguiente(inicio);
				inicio = nuevo;
			} else {
				if (posicion == tamano) {
					Nodo aux = inicio;
					while (aux.getSiguiente() != null) {
						aux = aux.getSiguiente();
					}
					aux.setSiguiente(nuevo);
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
	
	public String getInicio(){
		String valorInicio = inicio.getValorNodo();
		inicio = inicio.getSiguiente();
		return valorInicio;
	}

	public int getPosition(String referencia) throws Exception {
		if (buscar(referencia)) {
			Nodo aux = inicio;
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
			Nodo aux = inicio;
			while (aux.getValorNodo() != referencia) {
				aux = aux.getSiguiente();
			}
			aux.setValorNodo(valor);
		}
	}

	public void editarPorPosicion(int posicion, String valor) {
		if (posicion > 0 && posicion < tamano) {
			if (posicion == 0) {
				inicio.setValorNodo(valor);
			} else {
				Nodo aux = inicio;
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				aux.setValorNodo(valor);
			}
		}
	}

	public void removerPorReferencia(String referencia) {
		if (buscar(referencia)) {
			if (inicio.getValorNodo() == referencia) {
				inicio = inicio.getSiguiente();
			} else {
				Nodo aux = inicio;
				while (aux.getSiguiente().getValorNodo() != referencia) {
					aux.getSiguiente();
				}
				Nodo siguiente = aux.getSiguiente().getSiguiente();
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
				Nodo aux = inicio;
				for (int i = 0; i < posicion - 1; i++) {
					aux = aux.getSiguiente();
				}
				Nodo siguiente = aux.getSiguiente();
				aux.setSiguiente(siguiente.getSiguiente());
			}
			tamano--;
		}
	}

	public void eliminar() {
		inicio = null;
		tamano = 0;
	}
	
	
	public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getValorNodo() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
            System.out.println();
        }
    }
}
