package MisImplementaciones.Estaticas;

import Api.ColaPrioridadTDA;

public class ColaPrioridad implements ColaPrioridadTDA {
    int tam;
    Nodo vector [];
	
	public void inicializar() {
		vector = new Nodo[100]; 
		tam=0;
	}

	
	public void acolar(int x, int y) {

	}

	
	public void desacola() {

	}

	
	public int primero() {
		return 0;
	}

	
	public int prioridad() {
		return 0;
	}

	
	public boolean colavacia() {

		return false;
	}
	
	private class Nodo {
		int pri;
		int d;
	}

}
