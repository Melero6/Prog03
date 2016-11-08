//Escribir un programa que lea una secuencia de datos numéricos de longitud indefinida, de
//manera que cuando el número sea el cero cesará la entrada de dicha secuencia. El programa
//debe imprimirnos la media de todos ellos, el mayor y el menor.

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		float d=0, a=0,n,media=0,menor=0,mayor=0;
		System.out.println("Escribe el valor de N:");
		n = teclado.nextInt();
		mayor=n;
		menor=n;
		while(n!=0)
		{
			d=d+n;
			++a;
			if(n>=menor)
				menor=n;
			else if(n<=mayor)
				mayor=n;

			System.out.println("Escribe el valor de N:");
			n= teclado.nextInt();
		}
		media=d/a;
		System.out.println("La media de los numeros es igual a: "+media);
		System.out.println("El mayor numero es: "+menor);
		System.out.println("El menor numero es: "+mayor);
	}

}
