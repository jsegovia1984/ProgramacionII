package Api;

public interface DiccionarioSimpleTDA {
	void Inicializar();
	void Agregar(int c, int v);
	ConjuntoTDA Claves();
	int Recuperar(int c);
	void EliminarClave(int c);
	
}
