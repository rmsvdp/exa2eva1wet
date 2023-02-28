package exa2eva1wet_E1;

/**
 * Clase pública libro
 * @author root
 *
 */
public class Libro {

	/**
	 * Título de libro
	 */
	private String titulo;
	/**
	 * Tipo de libro, campo de libre descripción
	 */
	private String tipo;
	/**
	 * Constructor con todos los atributos de la clase
	 * @param _titulo Título del libro
	 * @param _tipo Temática
	 */
	public Libro(String _titulo,String _tipo) {
		
		this.titulo = _titulo;
		this.tipo = _tipo;
	}
	/**
	 * getter para recuperar el atributo privado titulo
	 * @return título del libro
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * setter para fijar el valor del atributo privado titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * getter para recuperar el atributo privado tipo
	 * @return título del libro
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * setter para fijar el valor del atributo privado tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Sobrecarga del método generico del objeto object toString
	 *  @return string con el contenido compuesto del objeto
	 */
	

	public String toString() {
		
		return this.titulo + ", " + this.tipo;
	}
}
