package ClasesOperadores;

public class Ejercicio1 {

	public static void main (String args[]) {
		
		String nombre = "Juan David Zamora";
		double notauno = 3.5;
		double notados = 2.9;
		double notatres = 3.8;
		double notacuatro = 4.0;
		double notacinco = 4.2;
		
		double promedio = (notauno+notados+notatres+notacuatro+notacinco)/5;
		
		System.out.println("El estudiante " + nombre + "tiene un promedio de " + promedio);
		
	}
}
