package descuento;

import java.util.Scanner;

/* 4.8 Una tienda ofrece un descuento del 15% sobre 
el total de la compra y un cliente desea saber 
cuanto deberá pagar finalmente por su compra. */

public class descuento {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
		
		float compra, descuento, total;
		
		System.out.println("Hola, tú compra, tú tenel descuento. Más compra, más barato. ¿Cuanto compra? ");
		System.out.println("(Introduce el precio total)");
		
		compra = sc.nextFloat();
		
		System.out.println("Yo calculal 15% de descuento");
		
		descuento = compra * 0.15f;
		
		total = compra - descuento;
		
		System.out.println("Yo dejal todo a " + total + ". Muy buen plecio, amigo. No dudal ¡COMPLA, COMPLA, COMPLA!");
		
	sc.close();
 	}
	
}
