package MisImplementaciones.Estaticas;

import Api.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	int vector[];
	int tam;
	int pertenece_pos;
	
	public void inicializar() {
	
	vector = new int[100];
	tam=0;
	}

	public void agregar(int x) {
		
		if(!this.pertenece(x)) {
			vector[tam] = x;
			tam++;
		}
		
	}

	public void sacar(int x) {
		if (this.pertenece(x)) {
			vector[pertenece_pos]=vector[tam];
			tam--;
		}
	}

	public int elegir() {
		return vector[tam-1];
	}

	public boolean conjuntovacio() {
		return tam==0;
	}

	public boolean pertenece(int x) {
		boolean per = false;
		for(int i=0;i<(tam-1) && per==false;i++){
			if (vector[i]==x) {
				per=true;
				pertenece_pos=i;
			}
		}
		return per;
	}

}
