package Condicionales;

public class ElseIf {

	public static void main(String[] args) {
		
	// ESTRUCTURA //
//	if(false) {
//		
//	}else if(true) {
//	
//		
//	}else {
//	
//		
//	}
		// EJEMPLO
		
		    int velocidad = 48;
		
		    if(velocidad >= 0 && velocidad <= 30){ // Pregunta si la velocidad esta entre 0 y 30
		        System.out.println("Zonas Escolares");
		    }
		    else if(velocidad > 30 && velocidad <= 60){ // Segunda pregunta si esta entre 30 y 60
		        System.out.println("Vías Urbanas");
		    }
		    else if(velocidad > 60 && velocidad <= 80){// tercera pregunta si esta entre 60 y 80
		        System.out.println("Vías Rurales");
		    }
		    else if(velocidad > 80 && velocidad <= 100){ // Cuarta pregunta si esta entre 80 y 100
		        System.out.println("Rutas Nacionales");
		    }
		    else{ // Si no esta el valor en el rango, saldría esto
		        System.out.println("Estás infringiendo los límites de velocidad");
		    }
		}

	
}
