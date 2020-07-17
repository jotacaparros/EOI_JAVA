package distancaPlano;

import java.util.Scanner;

/*4.11 Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el plano.
 Calcula y muestra la distancia entre ellos. (d = raíz cuadrada de (x2-x1)^2 + (y2-y1)^2) */

public class distanciaPlano {
 
	public static void main(String[] args) {
	
	double x1, y1, x2, y2, distancia;
	
	 Scanner sc = new Scanner (System.in);
	
	 System.out.println("General, la tanqueta coreana está ropostando. Debemos aprovechar para atacar lanzando nuestros misiles.");
	 System.out.println("Lo importante es conocer la distancia entre sus cordenadas y las nuestras.");
	 System.out.println("Introduzca nuestras coordenadas X e Y. Primero X");
	 
	 x1 = sc.nextDouble();
	 
	 System.out.println("Ahora Y");
	 
	 y1 = sc.nextDouble();
	 
	 System.out.println("Ahora necesitamos las coordenadas de esos sucios amarillos. Primero X");
	 
	 x2 = sc.nextDouble();
	 
	 System.out.println("Ahora Y");
	 
	 y2 = sc.nextDouble();
	 
	
	distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	System.out.println("Lo tenemos General, se encuentran a " + distancia + "  metros de distancia. Solo de la orden y acabaremos con ellos.");
	
	 sc.close();
}
}
