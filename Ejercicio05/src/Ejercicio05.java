//Hacer un programa que lea una serie de n�meros por teclado de manera que cuando el n�mero
//le�do sea el cero ya no se introduzcan m�s, el programa debe calcular y escribir la suma de los
//n�meros de la serie y cu�ntos se han introducido en total.

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
