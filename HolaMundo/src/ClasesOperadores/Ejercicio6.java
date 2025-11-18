package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String args[]) {
		
		 System.out.println("INFORMACION CUADRADO");
		 int ladoCuadrado = 8;
		 
		 int areaCuadrado = ladoCuadrado * ladoCuadrado;
		 int perimetroCuadrado = ladoCuadrado+ladoCuadrado+ladoCuadrado+ladoCuadrado;
		 
		 System.out.println("El area del cuadrado es: " + areaCuadrado);
		 System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);;
		 System.out.println(" ");
		 
		 
		 System.out.println("INFORMACION TRIANGULO");
		 int baseTriangulo = 9;
		 int alturaTriangulo = 8;
		 int ladoUnoTriangulo = 8;
		 int ladoDosTriangulo = 8;
		 
		 int areaTriangulo = ((baseTriangulo*alturaTriangulo)/2);
		 int perimetroTriangulo = (ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo);
		
		 System.out.println("El area del triangulo es: "+ areaTriangulo);
		 System.out.println("El perimetro del triangulo es: "+ perimetroTriangulo);
		 System.out.println(" ");
		 
		 
		 System.out.println("INFORMACION RECTANGULO");
		 int baseRectangulo = 8;
		 int alturaRectangulo = 6;
		 
		 int areaRectangulo = baseRectangulo*alturaRectangulo;
		 int perimetroRectangulo = 2*(baseRectangulo+alturaRectangulo);
		 
		 System.out.println("El area del rectangulo es: "+areaRectangulo);
		 System.out.println("El perimetro del rectangulo es: "+perimetroRectangulo);
		 
		 
		 
		 
		 
	}
	
}
