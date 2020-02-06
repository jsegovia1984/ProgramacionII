package Herramientas;
import Api.PilaTDA;
import MisImplementaciones.Estaticas.Pila;


public class Tp1{
  // Pasar una pasa a una pila b quedando en orden inverso.
	
	public static void pasarPilaPila(PilaTDA d, PilaTDA o) {
		while(!o.pilavacia()) {
			d.apilar(o.tope());
			o.desapilar();
		}
	}
	
	public static void copiarPilaPila(PilaTDA d, PilaTDA o) {
		PilaTDA aux;
		aux = new Pila();
		aux.inicializar();
		pasarPilaPila(aux, o);
		while(!aux.pilavacia()) {
			d.apilar(aux.tope());
			o.apilar(aux.tope());
			aux.desapilar();
		}

	}

	public static int ContarPila(PilaTDA A) {
		
		int cont=0;
		
		while(!A.pilavacia()) {
			cont++;
			A.desapilar();
		}
				
		return cont;
	}
	
	public static int SumarPila(PilaTDA A) {
			int suma=0;
			while(!A.pilavacia()) {
				A.tope();
				suma = suma + A.tope();
				A.desapilar();
			}
			
		return suma;
	}
	
	public static float PromedioPila(PilaTDA A) {
		float promedio;
		int suma, contador;
		PilaTDA C1 = new Pila();
		PilaTDA C2 = new Pila();
		C1.inicializar();
		C2.inicializar();
		Tp1.copiarPilaPila(C1, A);
		contador = Tp1.ContarPila(C1);
				
		Tp1.copiarPilaPila(C2, A);
		suma = Tp1.SumarPila(C2);
		promedio = suma/contador;
		
		return promedio;
		
		

	}
}


