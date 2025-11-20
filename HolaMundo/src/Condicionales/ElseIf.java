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
		
		    if(velocidad >= 0 && velocidad <= 30){
		        System.out.println("Zonas Escolares");
		    }
		    else if(velocidad > 30 && velocidad <= 60){
		        System.out.println("Vías Urbanas");
		    }
		    else if(velocidad > 60 && velocidad <= 80){
		        System.out.println("Vías Rurales");
		    }
		    else if(velocidad > 80 && velocidad <= 100){
		        System.out.println("Rutas Nacionales");
		    }
		    else{
		        System.out.println("Estás infringiendo los límites de velocidad");
		    }
		}

	
}
