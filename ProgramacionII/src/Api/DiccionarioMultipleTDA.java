package Api;

public interface DiccionarioMultipleTDA {
	void Inicializar();
	void Agregar(int c, int v);
	ConjuntoTDA Claves();
	ConjuntoTDA Recuperar(int c);
	void Eliminar(int c);
	void EliminarValor(int c, int v);


}
