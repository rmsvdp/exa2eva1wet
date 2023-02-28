package exa2eva1wet_E2;

public class Principal {

	
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		Pieza[] CajasPiezas = new Pieza[8];
		CajasPiezas[0]= new Clavo("T-MK000",50,1.2,0.35);
		CajasPiezas[1]= new Clavo("T-MK000",50,1.2,0.35);
		CajasPiezas[2]= new Tornillo("R-MK001",50,1.2,"Cabeza Plana");
		CajasPiezas[3]= new Clavo("T-MK000",50,1.2,0.35);
		CajasPiezas[4]= new Tornillo("R-MK001",50,1.2,"Cabeza Cruz");
		CajasPiezas[5]= new Tornillo("R-MK001",50,1.2,"Cabeza Hexagonal");
		CajasPiezas[6]= new Tuerca("H-BB000",50,1.2,"M3");
		CajasPiezas[7]= new Tornillo("R-MK001",50,1.2,"Cabeza Plana");

		totalPiezas(CajasPiezas);
	}
	
	public static void totalPiezas(Pieza[] misCajas) {

		int totT=0;
		int totC=0;
		int totU=0;
	for (int i=0; i< misCajas.length;i++) {
		
		if (misCajas[i] instanceof Tornillo) {
			totT++;
		}
		else if (misCajas[i] instanceof Clavo) {
			totC++;
		} else totU++;
	}
	System.out.println("Resumen:");
	System.out.println("Cajas de Tornillos: "+totT);
	System.out.println("Cajas de Clavos: "+totC);
	System.out.println("Cajas no Identificadas:"+totU);
	} // totalPiezas
	
}
