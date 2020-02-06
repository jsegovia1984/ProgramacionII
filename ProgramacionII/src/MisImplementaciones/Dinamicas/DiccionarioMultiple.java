package MisImplementaciones.Dinamicas;

import Api.ConjuntoTDA;
import Api.DiccionarioMultipleTDA;

public class DiccionarioMultiple implements DiccionarioMultipleTDA {

	class nodo_clave{
		int c;
		nodo_valor inicio_valor;
		nodo_clave sig;
		
	}
	
	class nodo_valor{
		int v;
		nodo_valor sig;
	}
	
	nodo_clave inicio;
	
	public void Inicializar() {
		inicio=null;
	}

	
	public void Agregar(int c, int v) {
		nodo_clave aux = this.Buscar_Clave(c);
		if (aux==null) {
			nodo_clave nuevo = new nodo_clave();
			nuevo.c=c;
			nuevo.inicio_valor=null;
			nuevo.sig=inicio;
			inicio=nuevo;
			aux=inicio; // consultar si se puede igualar a nuevo
			
			
			
			
			
		}
	}

	public ConjuntoTDA Claves() {
		
		ConjuntoTDA Conjunto_Claves = new Conjunto();
		Conjunto_Claves.inicializar();
		nodo_clave actual;
		actual = inicio;
		while(actual != null) {
			Conjunto_Claves.agregar(actual.c); 
			actual= actual.sig;
		}
		return Conjunto_Claves;
		
	}

	
	public ConjuntoTDA Recuperar(int c) {
		nodo_clave actual = this.Buscar_Clave(c);
		return actual;
	}

	public void Eliminar(int c) {
		
		nodo_clave anterior=null, actual=inicio;
		
		while(actual!= null && actual.c!=c) {
			anterior=actual;
			actual = actual.sig;
			
		if (actual!=null)
		{
			if (anterior==null) 
			inicio = inicio.sig;
			else 
			anterior.sig=actual.sig;
		}
		}
	}
	
	public void EliminarValor(int c, int v) {
		
		nodo_clave actual = this.Buscar_Clave(c);
		if (actual!= null)
		{
			nodo_valor actual_valor = actual.inicio_valor, anterior_valor=null;
		
			while (actual_valor != null && actual_valor.v!=c)
			{
				anterior_valor = actual_valor;
				actual_valor = actual_valor.sig;
				
			}	
			
				if (actual_valor!=null) // encontro el elemento
				{
					if (anterior_valor==null) 
						inicio.inicio_valor = inicio.inicio_valor.sig; // en caso de que sea el primero o unico
					else
						anterior_valor.sig = actual_valor.sig;

				}
				
				if(inicio.inicio_valor==null) 
					this.Eliminar(c);
				
			
		}
	}
			
	private nodo_clave Buscar_Clave(int c) 
	{
		nodo_clave actual;
		actual=inicio;
		
		while(actual!=null && actual.c!=c) {
			actual=actual.sig;
		}
		return actual;	


	}

}
