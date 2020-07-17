package media;

//4.5 Calcular la media de tres números pedidos por teclado.

import java.util.Scanner;

public class media {
 public static void main(String[] args) {
	
	 float n1, n2, n3, media;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("HOY ES UN DÍA GLORIOSO.");
	 System.out.println("Vais a calcular vuestra media del curso vosotros mismos.");
	 System.out.println("Tan solo tendréis que poner las notas en este delicioso programa.");
	 System.out.println("Introduce tu primera nota:");
	 
	 	n1 = sc.nextFloat();
	 
	 System.out.println("Introduce tu segunda nota:");
	 
	 	n2 = sc.nextFloat();
	 
	 System.out.println("Ahora introduce tu segunda nota:");
	 
	 	n3 = sc.nextFloat();
	 
	 System.out.println("Finalmente introduce tu tercera nota:");
	 
	 	media = ((n1 + n2 + n3) / 3);
	 
	 System.out.println("Tu media es de "+ media + ". Si has suspendido como un pringado, no me vengas con lloros. Haber studiao.");
	  
	 sc.close();
	 
 	}
}
