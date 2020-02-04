package MisApp;

import Api.*;

import MisImplementaciones.Dinamicas.*;

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
	
	public static void E2()
	{
		ColaPrioridadTDA A = new ColaPrioridad();
		A.inicializar();
		/*
		A.acolar(1, 1);
		A.acolar(2, 2);
		A.acolar(3, 11);
		A.acolar(5, 5);
		A.acolar(1, 3);
		A.acolar(2, 6);
		A.acolar(10, 10);

		
		;while (!A.colavacia()) {
			System.out.println(A.primero() + " " +  A.prioridad());
			A.desacola();

		}*/
		
	}
	public static void E3() {
		ColaTDA A = new Cola();
		A.inicializar();
		A.acolar(1);
		A.acolar(2);
		A.acolar(3);
		
		while (!A.colavacia()) {
			System.out.println(A.primero());
			A.desacolar();
		}
	}
}

