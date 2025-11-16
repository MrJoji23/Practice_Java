package Paquete;

public class Variables {
	
	// NUMEROS ENTEROS
	
//Byte: Emplea un sólo byte (8 bits) de almacenamiento
//Esto permite almacenar valores entre [-128, 127].
	
	byte numeroByte = 9;
	
//short: Emplea el doble de almacenamiento de (byte)
//Esto permite almacenar valores entre [-32.768, 32.767].
	
	short numeroShort = 32767;

//int: Emplea un tamaño mayor, 4 bytes (32 bits)
//Esto permite almacenar valores entre [-2,147,483,648 a 2,147,483,647]
	
	int numeroInt = 41825;
	
//long: Emolea el tamaño mayor de todos los enteros, 8 bytes (64 bits)
//Esto permite almacenar valores muy grandes
	
	long numeroLong = 922284545;
	
	// NUMEROS FLOTANTES
	
//float: Emplea un tamaño de 32 bits (4 bytes)
//Esto permite almacenar valores grandes
	
	float numeroFloat = 5976464F;
	
//double: Emplea un tamaño de 64 bits (8 bytes)
//Esto permite almacenar valores grandes 
	
	double numerDouble = 2654792142478F;
	

	// BOOLEANOS //

//boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos(booleanos)
//Se traducen sus valores en true/falso
	
	boolean variableBoolean = true;
	
//char: Se emplea para almacenar carcteres individuales (letras, aunque puede contener numeros).
//Utiliza 16 bits y se codifica sobre UTF-16 unicode
	
	char numeroChar = 1;
	char letraChar = '0';

	// CADENAS DE CARACTERES
	
//String: Se emplea creando una instancia de la clase String,
//aunque parezca trabajar con datos primitivos
	
	String variableString = "Hola a todos.";
	
		
}
