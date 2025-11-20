package Condicionales;

public class TablaVerdad {

	// P     | Q     | P && Q | P || Q | !P
		// -------------------------------------
		// True  | True  | True   | True   | False
		// True  | False | False  | True   | False
		// False | True  | False  | True   | True
		// False | False | False  | False  | True

		
		public static void mian(String[] args) {
			
			boolean p = false;
			boolean q = true;
			
			// Primera condicion donde P y Q tienen que ser true para cumplir el if
			
			if(p && q) {
				
				//Ejecucion en caso de que P y Q sean verdaderas
				System.out.println("P y Q tienen un valor true");
			
			}
			
			//Segunda condicion donde P o Q tienen que ser true para cumplir el if
			//Se tiene que cumplir cualquiera de las dos
			if(p || q) {
				
				//Ejecución en caso de que P o Q sean true
				System.out.println("P o Q tienen un valor true");
				
			}
			
			//Tercera condición donde P al ser true y agregar el operador
			//"!" niega el true y lo convierte a false (Sólo en ejecución
			//de la condición, la variable P sigue siendo true)

			if(!p)
			{
			    //Ejecución en caso de que P sea true
			    System.out.println("P tiene un valor true");
			}
			
			}
}
