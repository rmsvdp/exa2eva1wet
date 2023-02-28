package exa2eva1wet_E2;

public abstract class Pieza {

	private String Nombre;
	public int Unidades;
	private double precio_ud;
	public Pieza() {
		// TODO Auto-generated constructor stub
	}

	public Pieza(String nombre, int unidades, double precio_ud) {
		super();
		Nombre = nombre;
		Unidades = unidades;
		this.precio_ud = precio_ud;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getUnidades() {
		return Unidades;
	}

	public void setUnidades(int unidades) {
		Unidades = unidades;
	}

	public double getPrecio_ud() {
		return precio_ud;
	}

	public void setPrecio_ud(double precio_ud) {
		this.precio_ud = precio_ud;
	}

	public abstract double ValorStock();
}
