package alumno;

import java.util.Scanner;

/* 4.9 Un alumno desea saber cual será su calificación final en la materia de Algoritmos.
 Dicha calificación se compone de los siguientes porcentajes:

55% del promedio de sus tres calificaciones parciales.
30% de la calificación del examen final.
15% de la calificación de un trabajo final.*/

public class alumno {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
		
		float total, par1, par2, par3, parf, exf, traf;

System.out.println("El drama está servido. Introduce tus notas y averigua si has aprobado. ¡Muahahaha!");

System.out.println("Priemer parcial");
	
	par1 = sc.nextFloat();
	
System.out.println("Segundo parcial");
	
	par2 = sc.nextFloat();
	
System.out.println("Tercer parcial");
	
	par3 = sc.nextFloat();
	
	
	parf = (par1 + par2 + par3)/ 3;
	
	
System.out.println("Examen final");
	
	exf = sc.nextFloat();
	
System.out.println("Trabajo final "
			+ "");
	
	traf  = sc.nextFloat();
	
	
	total = (parf * 0.55f) + (exf * 0.30f) + (traf * 0.15f);
	
System.out.println("tu nota es "+ total);

		sc.close();
	
	}
}
