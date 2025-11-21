package Ciclos;

public class CicloWhile {

	public static void main(String[] args) {
		//Ciclos mientras
		//Es una estructura iterativa para ejectuar un mismo segmento de codigo, con la particularidad
		//de que en la mayoria de los casos se desconoce la cantidad de veces deseada para iterar por
		// el hecho de no tener un valor de inicio y un valor de parada
		
		boolean x = true;
	
		while(x) {// El while depende de x que es un boolean 
			System.out.println("Ciclo while");// Lo imprima una vez
			x= false;// Se cancela el while ya que x esta en false
		}
		int i =0;// Variable int en 0
		while(i<10)// Se ejecuta mientras i<10
		{
			System.out.println(i);//Cada iteracion imprime a i
			i++;//Lo incrementa de 1 en 1, hasta 10 como lo dice la condicion
		}
		System.out.println(" ");
		System.out.println("Ejercicio de imprimir numeros impares entre 1 y 25 ");
	
		
		//Seria int i = 1; pero como ya se establecio antes, entonces solo se le da un nuevo valor
		i = 1;// darle valor a la variable i
		while(i<=25) { // condicional de que i va hasta 25
			
			if(i%2 !=0) {// si i al % da residuo es impar, si da es 0 es par y es valido != es diferente de 
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Programa que descomponga todos sus caracteres");
		String palabra = "Politécnico de Colombia";//Crea una variable de texto con la frase
		i = 0;// iniciamos la variable para el contador

		while(i < palabra.length())// .length contado de caracteres dentro de la frase
		{
		    System.out.print(palabra.charAt(i) + " ");// El charAt imprime cada letra de la palabra separada por un espacio 
		    i++;
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Programa de contar las letras de un String ");
		palabra = "Diego";
		
		//.length devuelve el numero de caracteres del string, vector y otras estructuras de datos
		
		System.out.println("La palabra "+ palabra +" tiene " + palabra.length() + " caracteres ");
		palabra = "Politécnico de Colombia";
		System.out.println("La palabra "+ palabra +"tiene "+ palabra.length()+" caracteres");
		
		System.out.println(" ");
		System.out.println("Programa de obtener la posicion de cada letra la palabra Diego ");
		
		palabra= "Diego";// Da nuevo valor a la variable 
		i =0;// Da nuevo valor a la variable para inicializarla
		System.out.println("La palabra "+ palabra+ "tiene"+palabra.length()+ " caracteres");
		
		while(i< palabra.length()) {// El ciclo empieza cuando i sea menor a la n cantidad que 
			// la funcion .length(En este caso 5)
			System.out.println(palabra.charAt(i) + " en la posición: "+i);// la funcion charAt imprime uno por una la letra
			// de la cadena/variable palabra (En este caso Diego)
			// y le agrega la posicion que es i, que viene siendo en que parte el ciclo
			i++;//Aumenta i en cada vez que termina una vuelta del ciclo 
		}
		
		System.out.println(" ");
		System.out.println("Programa que genere numeros aletorios entre 1 y 50 y se detenga en un multiplo del 10");
		
		x = true; 	// Se le da el valor por que ya esta declarada antes
		while(x) { 	// se ejecuta mientras x sea true
			double n = Math.ceil(Math.random()*50);// La funcion ceil redondea a el siguiente entero más alto,
			// la funcion .random es para que diga numeros aletorios y numeros que no superen a los 50
			System.out.println(n);// Imprimi los numeros 
			if(n % 10 == 0 ) {// Hace la condicional que ese numero si al % y da 0 termine.
				// Si dado el caso no da 0, entonces sigue con otro numero
				x = false;
			}
		}
		
		
		
		
	}
	
}
