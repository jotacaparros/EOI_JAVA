package conversor;

import java.util.Scanner;

//4.6 Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.

public class conversor {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int cantidad, min, horas;	
	
	System.out.println("Ingresa los minutos que te quedan de vida");
	
	cantidad = sc.nextInt();
	
	horas = cantidad / 60;
	min = cantidad - (horas * 60);
	
	System.out.println("Te quedan " + horas + " h y " + min + " minutos de vida. Aprovecha el tiempo y haz lo que siempre quisiste hacer.");
	
	
	sc.close();
}	

}
