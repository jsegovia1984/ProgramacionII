package MisApp;

import Api.PilaTDA;
import MisImplementaciones.Estaticas.*;

public class app1 {

	public static void main(String[] args) {
		E1();
	
	}
	

	public static void E1() {
		PilaTDA X = new Pila();
		X.inicializar();
		X.apilar(1);
		X.apilar(2);
		X.apilar(3);
		while(!X.pilavacia())
		{
			System.out.println(X.tope());
			X.desapilar();
		}
	}
	
	public static void ej2()
	{
		ColaConPrioridad A = new ColaPrioridad();
		A.InicializarCola();
		A.AcolarPrioridad(1, 1);
		A.AcolarPrioridad(2, 2);
		A.AcolarPrioridad(3, 11);
		A.AcolarPrioridad(5, 5);
		A.AcolarPrioridad(1, 3);
		A.AcolarPrioridad(2, 6);
		A.AcolarPrioridad(10, 10);

		
		while (!A.ColaVacia()) {
			System.out.println(A.Primero() + " " +  A.Prioridad());
			A.Desacolar();

		}
	}
}

