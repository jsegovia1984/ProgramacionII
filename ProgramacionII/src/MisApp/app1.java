package MisApp;
import Herramientas.*;
import MisApp.*;

import Api.*;

import MisImplementaciones.Dinamicas.*;

public class app1 {

	public static void main(String[] args) {
		ejer1();
	}
	
	
	public static void ejer1(){
		int suma, cont;
		float prom;
		PilaTDA A = new Pila();
		PilaTDA C1 = new Pila();
		PilaTDA C2 = new Pila();
		C1.inicializar();
		C2.inicializar();
		A.inicializar();
		
		A.apilar(3);
		A.apilar(4);
		A.apilar(5);
		A.apilar(4);
		A.apilar(4);
		Tp1.copiarPilaPila(C1, A);
	    suma = Tp1.SumarPila(C1);
		Tp1.copiarPilaPila(C2, A);
		cont = Tp1.ContarPila(C2);
		prom = Tp1.PromedioPila(A);
		System.out.println("la pila contine " + cont + " elementos y su suma es: " + suma );
		System.out.println("El promedio de los valores de la pila es: " + prom);
		
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
		
		A.acolar(3);

	}
}

