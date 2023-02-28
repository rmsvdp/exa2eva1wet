package exa2eva1wet_E2;

public class Tuerca extends Pieza {

	private String metrica;

	public Tuerca(String nombre, int unidades, double precio_ud,String metrica) {
		super(nombre, unidades, precio_ud);
		// TODO Auto-generated constructor stub
	}

	public String getMetrica() {
		return metrica;
	}

	public void setMetrica(String metrica) {
		this.metrica = metrica;
	}

	@Override
	public double ValorStock() {
		// TODO Auto-generated method stub
		return 0;
	}

}
