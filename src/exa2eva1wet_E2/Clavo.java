package exa2eva1wet_E2;

public class Clavo extends Pieza {

	private double Grosor;

	
	public Clavo(String nombre, int unidades, double precio_ud,double grosor) {
		super(nombre, unidades, precio_ud); // Usar superclase para inicializar
		Grosor = grosor;
	}

/**
 * Calcula valor del stock de clavos. No existe recargo,
 * cálculo genérico.
 */
	public double ValorStock() {
		return this.getPrecio_ud() * this.Unidades;
	}

}
