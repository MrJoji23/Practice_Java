package Condicionales;

public class Estructura_If {

	//En caso de que se cumpla (true), se ejecuta el contenido entre las llaves 
	//En caso de que se omita, se ejecuta el código hasta el primer punto y coma (;) 
	//por lo tanto, si no se usan los «{}», la condición se aplica solo a la siguiente
	//instrucción al if.
	
	public static void main(String[] args) {
		
		if(9<12) {
			System.out.println("9 Si es menor a 12");
		}
		
		if(4>2) {
			System.out.println("4 si es mayor a 2");
		}
	}
	
	
}
