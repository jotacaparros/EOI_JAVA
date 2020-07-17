package hipotenusa;

import java.util.Scanner;

// Programa que calcule la hiptenusa de un triangulo

public class hipotenusaMilagrosa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
// Lo voy a definr como short porque le vamos a dar otra historia bizarra al ejercicio, y con el short nos sobra.
		
		float cat1, cat2;
		
		System.out.println("Colega ¡LO TENEMOS! Tenemos la fórmula definitiva contra la disfunción eréctil.");
		System.out.println("Es una fórmula sencilla, solo se necesita calcular la hipotenusa entre el miembro erecto y la base púbica del individuo.");
		System.out.println("Vamos a probarlo contigo. Va, dime ¿Cuanto te mide empalmada? y no te flipes que sino no funciona.");
		
		cat1 = sc.nextFloat();
		
		System.out.println("¡WOW! ¿Todo eso es tuyo campeón? Te doy un 8 punto 5 sobre 10.");
		System.out.println("Ahora agárratela y pégatela contra la zona púbica, mídetela, mira si llega hasta el ombligo e introduce el dato.");
		
		cat2 = sc.nextFloat();
		
//Aquí insistiendo un poco he conseguido que funcione, pero no he entendido porque con hipo no puede ser float. Me indicaba como que estaba repetido
		
		double hipo = Math.sqrt((Math.pow(cat1,2)) + (Math.pow(cat2,2)));
		
		System.out.println("Vale chaval lo tenemos. Tu hipotenusa es de " + hipo + " cm. Guárdatela porque la tendrás que introducir más adelante.");
		
		sc.close();
	}
	
}
