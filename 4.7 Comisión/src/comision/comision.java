package comision;

import java.util.Scanner;

/* 4.7 Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor
  desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes
  y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones. */

public class comision {

	
	
	public static void main(String[] args) {
		

	Scanner sc = new Scanner (System.in);
	
		float v1, v2, v3, c1, c2, c3, total;
		
		System.out.println("¡VAYA FIERA! Sabía que no me equivocaba contigo. 3 VENTAS EN UN SOLO MES. ¡Así se hace campeón!");
		System.out.println("Bueno es hora de que calcules cuanta guita te has ganado.");
		System.out.println("Introduce el valor de la primera venta del mes:");
		
		v1 = sc.nextFloat();
		
		System.out.println("¡Vaya pastizal! Ahora el valor de la segunda venta");
		
		v2 = sc.nextFloat();
		
		System.out.println("Y por último la tercera venta");
		
		v3 = sc.nextFloat();
		
		c1 = v1 * 0.10f;
		c2 = v2 * 0.10f;
		c3 = v3 * 0.10f;
		
		total = c1 + c2 + c3 + 1800;
		
		System.out.println("Por tu primera venta te has sacado " + c1 + ", por tu segunda " + c2 + " y por tu tercera " + c3 );
		System.out.println("Que eso, sumado a tu sueldo de 1800 pavetes te sale unos " + total + " ¡Toma lana!" );
	
	sc.close();
		
	}
	
}
