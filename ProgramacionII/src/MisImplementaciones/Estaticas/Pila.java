package MisImplementaciones.Estaticas;

import Api.PilaTDA;

public class Pila implements PilaTDA {
	int vector [];
	int tam;
	
	public void inicializar() {
		vector = new int[100];
		tam = 0;

	}

	public void apilar(int x) {
		vector[tam]=x;
		tam++;

	}

	public void desapilar() {
		tam--;
	}

	public int tope() {
		return vector[tam-1];
	}

	public boolean pilavacia() {

		return tam==0;
	}

}
