package raizCubica;

import java.util.Scanner;

// 4.12 Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 

public class raizCubica {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	double raiz2, raiz3, num;
	
	System.out.println("¿Quieres calcular el cuadrado y el cubo de un número? ¡Introduce uno y verás!");
	
	num = sc.nextDouble();
	
	raiz2 = Math.pow(num, 2);
	raiz3 = Math.pow(num, 3);
	
	System.out.println("El cuadrado y el cubo de " + num + " son: " + raiz2 + " para el cuadrado y " + raiz3 + " para el cubo.");
	
	sc.close();
}
	
}
