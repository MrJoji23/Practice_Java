package Condicionales;

public class Equals {

	//Se encarga de comparar la cadena de texto contra un objeto que devolverá 
	//true si las cadenas comparadas son iguales; en caso contrario, devolverá false. 
	
	public static void main(String[]args) {
		
		String nombre = "Alejo";
		
		if(nombre.equals("Alejo")) { // Compara nombre sea igual a lo que aparece en los ()
			
			System.out.println("True, si es igual"); 
			
		}
		
		System.out.println(" ");
		System.out.println("Nuevo ejercicio");
		System.out.println(" ");
		
		String x = new String("Saludo");
		String y = new String("Saludo");

		if (x == y) // Comprobar si ambos apuntan a la misma ubicacion de memoria
		{
		    System.out.println("true");
		}
		else
		{
		    System.out.println("false");
		}

		if (x.equals(y)) // equals compara que tenga el mismo contenido 
		{
		    System.out.println("true");
		}
		else
		{
		    System.out.println("false");
		}
		//En palabras simples, == comprueba si ambos objetos apuntan a 
		//la misma ubicación de memoria, mientras que equals () evalúa la 
		//comparación de valores en los objetos.
	}
}
