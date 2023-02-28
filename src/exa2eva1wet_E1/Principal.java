package exa2eva1wet_E1;

import java.util.Scanner;

public class Principal {

	/**
	 * Array de colecciones
	 */
	public static Coleccion[] miCol; // mis colecciones
	
	/**
	 * Constructor por defecto de la clase Principal
	 */
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Módulo main
	 * @param args linea de parámetros para ejecución desde línea de comandos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] titulos ={"War of the worlds","Lepanto", "IRobot","Leningrado","Dune",
				"Episodios Nacionales","1984","Emérita Augusta","Time Machine"};
		String[] tipos = {"Historia","Ciencia Ficción"};
		
		miCol = new Coleccion[2];	// Dos colecciones
		miCol[0]= new Coleccion("Coleccion 2",6);
		miCol[1]= new Coleccion("Coleccion 1",6);

		int j =0;
		for (int i=0;i<titulos.length/2;i++) {
			// pares en una colección 
			miCol[0].ejemplares[i]=new Libro(titulos[j],tipos[1]);
			// impares en otra
			if ((j+1)<titulos.length)
			miCol[1].ejemplares[i]=new Libro(titulos[j+1],tipos[0]);
			j+=2;
		}
		
		lista_Col();
	}
	
	/**
	 * Lista el contenido de una de las dos colecciones
	 * sólo acepta los valores 1 y 2 para referirse a las colecciones
	 * 0 y 1 creadas en el método main.
	 */
	public static void lista_Col() {
		
		Scanner sc = new Scanner(System.in);
		boolean _end= false;
		int opc = 0;
		while (!_end) {
			System.out.println("Elige una colección (1-2):?");		
			opc = sc.nextInt();
			if ((opc==1) || (opc==2)) _end = true;
			else System.out.println("Elección no valida");
		} // !_end
		opc--; // Pasamos a índice array
		 System.out.println("Libros de la colección :"+ miCol[opc].getNombre());
		 Coleccion c;
		 for (int i = 0; i<miCol[opc].getBiblioTam();i++) {
			 c = miCol[opc];
			 if (c.ejemplares[i]!= null) {
			 System.out.println((i+1)+": "+ c.ejemplares[i].toString());
			 }
			 else {
				 System.out.println((i+1)+": Vacía");
			 }
		 }
	} // lista_Col
}
