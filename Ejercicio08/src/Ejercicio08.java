//Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Hacer un programa que
//lea un número N filtrando que debe ser mayor que cero y calcule su factorial.

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		long a,resu,d;
		d=0;
		System.out.println("Escribe el valor de A");
		a= teclado.nextInt();
		d=a-1;
		resu=a;
		while (d>0)
		{
			resu=resu*d;
			--d;
		}
		System.out.println("El factorial de "+a+" es igual a: "+ resu);
	}

}
