package distancia;

import java.util.Scanner;

public class distancia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cor1, cor2, distancia;
		
	System.out.println("La distancia entre dos números es como la distancia entre dos corazones.");
	System.out.println("Introduce el número de tu alma");
	
		cor1 = sc.nextInt();
		
	System.out.println("Ahora introduce el número de tu alma gemela");
	
		cor2 = sc.nextInt();
		
	distancia = cor1 - cor2;
	
		System.out.println("Estas a " + Math.abs(distancia) + " de distancia. Corre a por ella");
	
	
	
	
	
	sc.close();

	}
}
