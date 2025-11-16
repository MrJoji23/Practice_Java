package EjerciciosClaseMath;

public class Ejercicio3 {

	public static void main(String args[]) {
		
		// Definir las variables con el numero random
		
		
		double notaUno = (int) (Math.random()*10);
		double notaDos = (int) (Math.random()*10);
		double notaTres = (int) (Math.random()*10);
		double notaCuatro = (int) (Math.random()*10);
		double notaCinco = (int) (Math.random()*10);
		
		// Imprimir cada numero
		
		System.out.println("El primer numero es: " + notaUno);
		System.out.println("El primer numero es: " + notaDos);
		System.out.println("El primer numero es: " + notaTres);
		System.out.println("El primer numero es: " + notaCuatro);
		System.out.println("El primer numero es: " + notaCinco);
		 
		
		System.out.println("// PROMEDIO DE LOS NUMEROS // ");
		
		double suma = (notaUno+notaDos+notaTres+notaCuatro+notaCinco);
		
		System.out.println("la suma de los numeros es: " + suma);
		
		double promedio = suma/5;
		
		System.out.println("El promedio de las notas es: " + promedio);
	}
}
