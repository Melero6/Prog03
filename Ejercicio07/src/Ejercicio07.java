//Escribir un programa que lea una secuencia de datos numéricos de longitud indefinida, de
//manera que cuando el número sea el cero cesará la entrada de dicha secuencia. El programa
//debe imprimirnos la media de todos ellos, el mayor y el menor.

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		float suma=0, cantidaDeNumeros=0, entrada, media=0, menor=0, mayor=0;
		System.out.println("Escribe un numero (la suma se detiene al introducir 0):");
		entrada = teclado.nextInt();
		mayor=entrada;
		menor=entrada;
		while(entrada!=0)
		{
			suma+=entrada;
			++cantidaDeNumeros;
			
			if(entrada>=menor)
				menor=entrada;
			
			else if(entrada<=mayor)
				mayor=entrada;

			System.out.println("Escribe el siguiente numero");
			entrada= teclado.nextInt();
		}
		media=suma/cantidaDeNumeros;
		System.out.println("La media de los numeros es igual a: "+media);
		System.out.println("El mayor numero es: "+menor);
		System.out.println("El menor numero es: "+mayor);
	}

}
