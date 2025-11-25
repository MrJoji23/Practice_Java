package Vectores;

public class EstructuraVectores {

	public static void main(String[] args) {
		
		//Los elementos de un vector o array se empiezan a numerar en el 0 y permiten 
		//gestionar desde una sola variable múltiples datos del mismo tipo.
		
	String estudiantes[] = new String[3];
	
	estudiantes[0] = "Juan";
	estudiantes[1] = "Stiven";
	estudiantes[2] = "Andres";
	
	//El tamaño del vector no puede ser redefinido.
	
	
		// VECTORES DATOS
	
	//1. VECTORES DE NUMEROS
	int alturas[] = new int[3];
	
	System.out.println(alturas[0]);

	//2.  Vectores de texto
	
	String nombres[] = new String[3];
	System.out.println(nombres[0]);
	
	//3. Vectores booleanos
	
	boolean estados[] = new boolean[3];
	
	System.out.println(estados[0]);
	
	// Crea un arreglo de Strings con espacio para 3 nombres.
	 
	String nombresdos[] = new String[3];

	nombresdos[0] = "Juan";
	nombresdos[1] = "Stiven";
	nombresdos[2] = "Andres";

	for(int i = 0; i < nombresdos.length; i++)
	{
	    System.out.println("Nombre " + i + " - " + nombresdos[i]);
	}

	
	
	
	}
	
}
