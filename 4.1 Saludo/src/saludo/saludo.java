package saludo;

//Crea u programa que  pregunte tu nombre y te salude


//Importamos la libreria del scanner

import java.util.Scanner;

public class saludo {

	
	public static void main(String[] args) {
	 
	//Activamos el scanner
		
	Scanner sc = new Scanner (System.in);

		//Añadimos unas instrucciones
	
		System.out.println("Hey, oh, hey forastero. ¿Cómo te llamas encanto?");
		
		
		String nombre = sc.nextLine();
		
		//Escupimos resultados
		System.out.println("Saludos " + nombre + ", un placer conocerte.");
		
		
		//Cerramos el scanner para que no de error
		
	sc.close();
	
	}
}
