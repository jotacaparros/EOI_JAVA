package perimetro;

//Creau un programa que calcule perímetro y ärea de un rectángulo.

import java.util.Scanner;

public class perimetro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Definamos variables
		
		int per, area, bas, alt;
		
		//Le vamos a meter un poco de historia bizarra para que no sea tan aburrido
		
			System.out.println("Hola humano. Necesito calcular el perímtero de seguridad y el área de mi nuevo campamento sexual nonagenario.");
			System.out.println("No queremos que nos tachen de pervertidos, así que hagámoslo bien. Introduce la base del perimetro.");

				bas = sc.nextInt();
		
			System.out.println("Muy bien. Ahora introduce la altura.");
			
				alt = sc.nextInt();
		
		//Un poco de fórmulas para que ejecute
				
			per = (2 * bas + 2 * alt);
			area = (bas * alt);
			
		System.out.println("Vale pervertido. Tenemos un perimetro de " + per + " metros y un área de " + area + " metros cuadrados para poder realizar sexo consentido nonagenario.");
		System.out.println("Ahora ¡A frungir!");
		
		sc.close();
	}
}
