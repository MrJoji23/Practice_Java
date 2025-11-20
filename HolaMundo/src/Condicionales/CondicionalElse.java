package Condicionales;

public class CondicionalElse {

	public static void main(String[] args) {
		
		String respuesta1 = "No";
		String respuesta2 = "Si";

		System.out.println("- ¿Quieres un café?");
		System.out.println("* " + respuesta1);

		if(respuesta1 == "Si")
		{
		    System.out.println("- ¿Vas a comprarlo?");
		    if(respuesta2 == "Si")
		    {
		        System.out.println("* " + respuesta2);
		        System.out.println("- Comprar café");
		    }
		    else
		    {
		        System.out.println("* " + respuesta2);
		        System.out.println("- Hacer el café");
		    }

		    System.out.println("- Beber");
		}
		else
		{
		    System.out.println("- Sigue estudiando");
		}

		
	}
	
}
