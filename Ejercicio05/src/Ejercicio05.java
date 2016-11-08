//Hacer un programa que lea una serie de números por teclado de manera que cuando el número
//leído sea el cero ya no se introduzcan más, el programa debe calcular y escribir la suma de los
//números de la serie y cuántos se han introducido en total.

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, d=0, a=0;

		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();

		while(n!=0)
		{
			d=d+n;
			++a;
			System.out.println("Escribe el valor de N:");
			n= teclado.nextInt();

		}
		System.out.println("La suma de la serie es igual a: "+d);
		System.out.println("La serie contiene "+a+" numeros.");
	}

}
