package exa2eva1wet_E2;

public class Tornillo extends Pieza {

	private String TipoCabeza;


	public Tornillo(String nombre, int unidades, double precio_ud,String TCab) {
		super(nombre, unidades, precio_ud);
		TipoCabeza = TCab;
	}
	/**
	 * Calcula precio del stock de cajas de tornillos, existen 3 casos en 
	 * función del tipo de cabeza.
	 */
	public double ValorStock() {
		
		double precio_gen = this.getPrecio_ud() * this.Unidades; // Genérico
		
		if (this.TipoCabeza.equals("Cabeza Plana")) { // Cabeza plana
			precio_gen = precio_gen*1.20;
		}
		else if (this.TipoCabeza.equals("Cabeza Hexagonal")) { // Cabeza hexagonal
			precio_gen = precio_gen*1.30;
		}
		
		return precio_gen;
	}

}
