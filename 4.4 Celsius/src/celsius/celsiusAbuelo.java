package celsius;
// 4.4 Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. Recordar que la fórmula para la conversión es: C = (F – 32) * 5/9

import java.util.Scanner;

public class celsiusAbuelo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

//Definimos variables
		
		float far, cel;

//Como es habitual un poco de narrativa para darle un poco de emoción
		
		System.out.println("Hola Abuelo. Sé que odias medir la temperatura en Celsius.");
		System.out.println("Sé que dices que eso es de judios, y que antes muerto que ceder a la ageneda mundial judia...");
		System.out.println("Abuelo, los tiempos han cambiado, tienes que ser más comprensivo.");
		System.out.println("Todo el mundo usa celsius ahora, y el doctor Galindo te pedirá la temperatura en celsius.");
		System.out.println("Por favor, no insultes al doctor llamandole sucio judio. Comportate y dale la temperatura como te pide.");
		System.out.println("He creado un conversor para que puedas ponerlo en Fahrenheit y te lo pase a celsius.");
		System.out.println("Solo introduce la temperatura en Fahrenheit y presiona la tecla enter.");
		
		far = sc.nextFloat ();
	
	// Aquí avance un poco más sobre como operar en java.
		
		cel = (Float) ((far - 32) * 5/9);
		
		System.out.println("Abuelo, en celsius la temperatura es " + cel + ". Te quiere tu nieto, besos.");
		
		
		sc.close();
	}

}
