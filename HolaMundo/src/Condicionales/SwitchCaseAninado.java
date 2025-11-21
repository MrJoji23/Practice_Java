package Condicionales;

public class SwitchCaseAninado {

	public static void main(String[] args) {
		
		int promedio = 4;
		int parcial = 4;

		switch (promedio)
		{
		    case 1:
		    case 2:
		    case 3:
		        System.out.println("Perdiste la materia");// Bloque de resultados del 1 al 3 que pierden la materia
		        break;

		    case 4:
		    case 5:
		        System.out.println("Ganaste la materia");// Bloque de resultados del 4 a 5 que ganaron la materia
		        switch (parcial)// Evalua el valor del parcial
		        {
		            case 1:
		            case 2:
		            case 3:
		                System.out.println("Pero perdiste el parcial");// Bloque de resultados si perdierónn el parcial en 1 al 3
		                break;

		            case 4:
		            case 5:
		                System.out.println("Y también el parcial");//Bloque de resultados del parcial si lo pasaron del 4 al 5
		                break;
		        }
		        break;

		    default:
		        System.out.println("Error");
		}

		
	}
	
	
}
