package Ciclos;

public class Ciclofor {

	public static void main(String[] args) {
		
		//Ciclos for son una estructura de control cíclica, que permite 
		//ejecutar una o varias líneas de código de forma iterativa (o repetitiva), pero teniendo 
		//control y conocimiento sobre las iteraciones. En el ciclo for, es necesario tener un 
		//valor inicial, una condición y valor final, y opcionalmente hacer uso del tamaño del 
		//«paso» entre cada iteración del ciclo. 
		
		// ES NECESARIO tener el conocimiento del valor de inicio
		
		System.out.println("Ejercicio de mostrar los numeros del 0 al 10");
		
		for(int i = 0; i <10; i++) {
			System.out.println("Numero: "+i);
		}
		System.out.println(" ");
		System.out.println("Ejercicio de numeros pares entre 0 y 20");
		
		//int i = 0;  - Valor de inicio
		//i < 10;     - Condicional y valor de parada
		//i++;        - Valor de incremento
		
		// EJERCICIO 
		//Realizar un programa que muestre los numeros pares entre 0 y 20 de forma ascendente
		
		for(int o = 0; o<=20; o+=2) {
			System.out.println("Los numeros pares son: " + o);
		}
		//int o = 0; o - Valor de inicio
		// o <= 20 - Condicional hasta donde actuar
		// o+=2 - Valor de incremento de dos en dos(Intervalos de dos en dos)
		
		//Ejemplo Desarrollar un programa que permita contar cuántos números entre 1 y 1000 
		//son múltiplos de 7, mostrar el resultado final. 
		
		System.out.println(" ");
		System.out.println("Ejemplo de saber cuántos números entre 1 y 1000 son multiplos de 7 ");
		int contador = 0;

		for(int i = 1; i <= 1000; i++)
		{
		    if(i % 7 == 0)//% es el operador módulo, devuelve el residuo de una división. Ejemplo 14 % 7=0 21 % 7 = 0               
		    {
		        contador++;// Si el numero es multiplo de 7, se suma 1 al contador
		    }
		}

		System.out.println("Los multiplos de 7 entre 1 y 1000 son: "+contador);
		
		System.out.println(" ");
		System.out.println("Imprimir tablas de multiplicar del 1 al 10 ");
		
		for(int i =1; i<=10; i++) { //Bucle de la tabla que se quiere imprimir
			System.out.println(" ");//Imprimir espacio en blanco
			System.out.println("La tabla de multiplicar de: "+i);// Imprimir el titulo de la tabla que se esta imprimiendo
			for(int j = 1; j<=10; j++) {// bucle que recorre diez veces por cada i para una tabla
				System.out.println(i+"*"+j+"="+i*j);// Imprimir la tabla por i siendo el numerador y j siendo el multiplicador
			}
			
		}
		
		
		
	}
	
}
