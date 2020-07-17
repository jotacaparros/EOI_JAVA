package nombresYEdades;
/*
7.8 Queremos guardar los nombres y la edades de los alumnos de un curso.
 Realiza un programa que introduzca el nombre y la edad de cada alumno. 
 El proceso de lectura de datos terminará cuando se introduzca un asterisco (*). 
 Al finalizar, se mostrarán los siguientes datos:
	
	- Todos los alumnos mayores de edad.
	- Los alumnos mayores (los que tienen más edad).

*/

import java.util.Scanner;

public class nombresYEdades {

public static void main(String[] args) {
	String [] arrayNombreAlum = new String[10];
	int [] arrayNombreAlum = new int[10];
	Scanner sc = new Scanner (System.in);
	Scanner sc2 = new Scanner (System.in);
	
	//edades ordenadas de mayor a menor
	int []arrayEdadesMayor = new int [10];
	
	//array con las posiciones originales 
	int []arrayPosEdaMayor = new int[10];
	
	for(int i=0; i<arrayNombreAlum.length; i++) {
		System.out.println( "mete nombre alumno" + (i+1) + ": ");
		arrayNombreAlum[i] = sc.nextInt();
		System.out.println("Edad alumno" + (i+1) + ": ");
		arrayEdadesAlum[i] = sc2.nextInt();
		if (arrayNombreAlum[i].contentEquals("*")) {
			i = arrayNombreAlum.length;	
		}
	}
	
	arrayEdadesMayor[0] = arrayEdadesAlum[0];
	for (int i=0; i < arrayEdadesAlum.length; i++){
		if(arrayEdadesAlum[i]>=18) {
			System.out.println(" el alumno " + arrayNombreAlum[i] + " es mayor de edad.");
			}
		}
	}
}
