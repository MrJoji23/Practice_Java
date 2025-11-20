package Condicionales;

public class estructuras_anidadas {

	public static void main(String[] args) {
		
		int numero = 9; // Declaro la variable

		if (numero >= 0){ // primer If, pregunta si el numero es mayor o igual a 0
		    if (numero > 0 && numero <= 4)// Primera condicion si esta entre 1 y 4
		    {
		        System.out.println("Bajo valor");
		    }
		    else if (numero > 4 && numero <= 8) // Segunda condicion si esta entre 5 y 8
		    {
		        System.out.println("Medio valor");
		    }
		    else if (numero > 8 && numero <= 14) // Tercera condicion si esta entre 8 y 14
		    {
		        System.out.println("Alto valor");
		    }

		}
		else // SI FUERA UN NUMERO NEGATIVO 
		{
		    System.out.println("Es negativo");
		}

		
	}
	
}
