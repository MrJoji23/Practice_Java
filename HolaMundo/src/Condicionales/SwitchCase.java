package Condicionales;

public class SwitchCase {

	public static void main(String[] args) {
		
		int num = 2; // variable int
		
		//El valor para un case debe ser del mismo tipo  de datos que la variable en el switch
		//El valor para un case debe ser una constante o un literal. Las variables no están permitidas
		//La declaracion break se usa dentro del switch para finalizar una secuencia de instruccion
		
		switch(num) {
		
		case 1: // valor int
			System.out.println("Numero 1");
			break;
		case 2: // valor int
			System.out.println("Numero 2");
			break;
		case 3: // valor int
			System.out.println("Numero 3");
			break;
		default:
			System.out.println("Error");
		
		}
		
	}
	
}
