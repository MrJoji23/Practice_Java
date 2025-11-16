package EjerciciosClaseMath;

public class Ejercicio4 {

	
	public static void main(String args[]) {
		
		double numeroUno = (int) (Math.random()*50);
		double numeroDos = (int) (Math.random()*50);
		
		// IMPRIMIR
		
		System.out.println("El primer numero es: " + numeroUno);
		System.out.println("El segundo numero es: " + numeroDos);
		
		// Numeros Redondados
		
		System.out.println("El primer numero es y es redondado a: " + Math.round(numeroUno));
		System.out.println("El segundo numero es y es redondado a: " + Math.round(numeroDos));
		
		// Numero mayor 
		
		long numeroMayor = Math.max(Math.round(numeroUno), Math.round(numeroDos));

		
		System.out.println("El numero mayor es el: " + numeroMayor);
		
	}
}
