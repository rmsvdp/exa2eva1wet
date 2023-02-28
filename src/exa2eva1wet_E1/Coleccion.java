package exa2eva1wet_E1;

public class Coleccion {

	/**
	 * Nombre de la colección
	 */
	private String nombre;
	/**
	 * Número de libros contenidos en la colección
	 */
	private int biblioTam;
	/**
	 * Array con los libros asociados a la colección
	 */
	public Libro[] ejemplares;

	/**
	 * Constructor con los atributos genéricos de de la lcase
	 * @param nombre Nombre de la colección
	 * @param biblioTam Número de ejemplares
	 */
	public Coleccion(String nombre, int biblioTam) {
		super();
		this.nombre = nombre;
		this.biblioTam = biblioTam;
		this.ejemplares= new Libro[biblioTam]; // Colección vacía
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Libro[] getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(Libro[] ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getBiblioTam() {
		return biblioTam;
	}
	public void setBiblioTam(int biblioTam) {
		this.biblioTam = biblioTam;
	}

/**
 * Añade un libro a la colección
 * @param _ejemplar Objeto Libro a añadir
 * @param posicion posición dentro de la colección
 * @return true: si la posición estaba libre
 *         false: si la pocisión ya estaba ocupada
 */
	public boolean AddLibro(Libro _ejemplar, int posicion) {
		
		if (this.ejemplares[posicion]== null) {
			this.ejemplares[posicion] = _ejemplar;
			return true;
		} else return false;
	}
	
	/**
	 * Devuelve el número de posiciones libres que quedan en la colección
	 * @return número de ejemplares restantes para completar la colección
	 */
	 public int posVacias() {
		 int npos=0;
		 
		 for (int i = 0; i<biblioTam;i++) {
			 if (this.ejemplares[i]== null) npos++;
		 }
		 return npos;
	 }
}
