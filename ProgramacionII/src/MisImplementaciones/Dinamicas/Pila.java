package MisImplementaciones.Dinamicas;

import Api.PilaTDA;

public class Pila implements PilaTDA {
	
	public class Nodo{
		int d;
		Nodo sig;
	}
	
	int tam;
	Nodo actual = new Nodo();
	
	public void inicializar() {
	tam=0;
	actual = null;
	}
	
	public void apilar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.sig = actual;
		nuevo.d =x;
		actual = nuevo;
		tam++;
	}

	
	public void desapilar() {
		if(!pilavacia()) // podria poner la pre condicion de que se supone no debe estar vacia la pila 
			actual = actual.sig;
			tam--;
		
	}

	public int tope() {
	
		return actual.d;
	}

	@Override
	public boolean pilavacia() {
		return actual == null;
	}

}
