package Condicionales;

public class SwitchCaseString {

	public static void main(String[] args) {
		
		//En JDK7 se puede usar una cadena literal/constante para controlar una declaración switch.
		//Usar un modificador basado en cadena/String es una mejora con respecto al uso de la secuencia
		//equivalente if/else
		
		String nombre = "JuanPA"; //variable texto 
		switch (nombre) // evalua la variable
		{
		    case "Diego": //Empieza a comparar la variable con el caso diego
		        System.out.println("Hola Diego, lindo día");
		        break;

		    case "Juan": //Empieza a comparar la variable con el caso Juan
		        System.out.println("Juan, ¿cómo estás?");
		        break;

		    case "Stiven": //Empieza a comparar la variable con el caso Stiven
		        System.out.println("Stiven, buena barba");
		        break;
 
		    case "Ana": //Empieza a comparar la variable con el caso Ana
		        System.out.println("Lindo cabello Ana");
		        break;

		    case "Susana": //Empieza a comparar la variable con el caso Susana
		        System.out.println("Susana ¿y la familia?");
		        break;

		    default: // Evalua si ha colocado un valor que no esta en el switchcase
		        System.out.println("Error");
		}

		
	}
	
}
