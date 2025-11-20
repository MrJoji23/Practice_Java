package Condicionales;

public class CondicionalElse {

	public static void main(String[] args) {
		
		String respuesta1 = "No";
		String respuesta2 = "Si";

		System.out.println("- ¿Quieres un café?");
		System.out.println("* " + respuesta1);// Variable de respuesta

		if(respuesta1 == "Si")// Compara que respuesta1 sea Si
		{
		    System.out.println("- ¿Vas a comprarlo?");
		    if(respuesta2 == "Si")// Si respuesta1 es si, entonces se imprime el texto de comprar el cafe
		    {
		        System.out.println("* " + respuesta2);
		        System.out.println("- Comprar café");
		    }
		    else // Si no entonces hacer el vafe
		    {
		        System.out.println("* " + respuesta2);
		        System.out.println("- Hacer el café");
		    }

		    System.out.println("- Beber"); // Imprimir en caso de la respuesta es Si
		}
		else // En caso de que respuesta es no
		{
		    System.out.println("- Sigue estudiando");
		}

		
	}
	
}
