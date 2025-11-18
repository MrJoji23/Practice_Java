package Paquete;

public class operadoresAritmeticos {

	public static void main(String args[]) {
		
		// Los operadores aritmeticos incrementales son operadores unarios 
		//Un unico operando
		
		// ++A Incrementa el valor y luego se utiliza la variable
		//A++ Utiliza la variable y luego incrementa el valor 
		//--A Decrementa el valor y luego se utiliza la variable 
		//A-- Utiliza la variable y luego decrementa el valor
		
		// OPERADORES ARITMETICOS INCREMENTALES
		
		int a = 5;
		int b = ++a;
		System.out.println("Operador: ++A");
		System.out.println("Variable :"+a); // 6
		System.out.println("Incrementable :"+b); // 6
		
		//++a incrementa primero a → ahora vale 6
		//Luego devuelve ese valor para asignarlo a b
		
		System.out.println(" ");
		
		int c = 5;
		int d = c++;
		System.out.println("Operador: A++");
		System.out.println("Variable :"+c); //6
		System.out.println("Incrementable :"+d); //5
		
		//c++ devuelve primero el valor actual de c → 5
		//Luego lo incrementa → ahora c vale 6
			
		System.out.println(" ");
		
		int e = 5;
		int f = --e;
		System.out.println("Operador: --A");
		System.out.println("Variable :"+e); //4
		System.out.println("Decrementa :"+f); //4
		
		//--e decrementa primero → e pasa a 4
		//Luego devuelve ese valor para asignarlo a f
		
		System.out.println(" ");
		
		int g = 5;
		int h = g--;
		System.out.println("Operador: A--");
		System.out.println("Variable :"+g); //4
		System.out.println("Decrementa :"+h); //5

		//g-- devuelve primero el valor actual → 5
		//Luego decrementa → g pasa a 4
		
		
		
		
	}
}
