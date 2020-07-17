package declaracionDeVectores;

import java.util.Scanner;

/* 7.7 Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros 
 cada uno, pida valores para ‘vector1’ y ‘vector2’ y calcule vector3=vector1+vector2. */

public class declaracionDeVectores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] v1, v2, v3;
		
		v1 = new int [5];
		v2 = new int [5];
		v3 = new int [5];
		
		int i;
		
		for (i = 0; i < 5; i++) {
			
			//Aquí guarda el valor pasado por consola en el array
			System.out.println(Mete vector 1);
			
			v1[i] = sc.nextInt();
			
			
		}
		
		
		
	sc.close();	
	}
}
