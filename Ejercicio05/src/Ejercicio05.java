//Hacer un programa que lea una serie de n�meros por teclado de manera que cuando el n�mero
//le�do sea el cero ya no se introduzcan m�s, el programa debe calcular y escribir la suma de los
//n�meros de la serie y cu�ntos se han introducido en total.

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, resultado=0, cantidadNumeros=0;

		System.out.println("Escribe un numero:");
		entrada= teclado.nextInt();

		while(entrada!=0)
		{
			resultado+=entrada;
			++cantidadNumeros;
			System.out.println("Escribe otro numero para sumarlo (El resultado se muestra al escribir 0:");
			entrada= teclado.nextInt();
		}
		System.out.println("La suma de la serie es igual a: "+resultado);
		System.out.println("La serie contiene "+cantidadNumeros+" numeros.");
	}

}
