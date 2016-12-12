//Realizar un programa que elija mediante un menú un tipo de figura:
//- Triángulo
//- Cuadrado
//- Rectángulo
//Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos la muestre.

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, a, b, resultado;


		System.out.println("Introduce el numero correspondiente a la figura de la que quieres calcular el area:");
		System.out.println("    1 - Triángulo");
		System.out.println("    2 - Cuadrado");
		System.out.println("    3 - Rectangulo");

		entrada= teclado.nextInt();

		switch(entrada){
		case (1)://Triangulo
			System.out.println("Has seleccionado Triángulo:");
			System.out.println("Introduce la base:");
			b= teclado.nextInt();
			System.out.println("Introduce la altura");
			a= teclado.nextInt();
			resultado=(b*a)/2;
			System.out.println("El area del triangulo es: "+resultado);
			break;

		case (2)://Cuadrado
			System.out.println("Has seleccionado Cuadrado:");
			System.out.println("Introduce el lado:");
			b= teclado.nextInt();
			resultado=b*b;
			System.out.println("El area del Cuadrado es: "+resultado);
			break;

		case (3)://Rectangulo
			System.out.println("Has seleccionado Rectangulo:");
			System.out.println("Introduce la base:");
			b= teclado.nextInt();
			System.out.println("Introduce la altura");
			a= teclado.nextInt();
			resultado=b*a;
			System.out.println("El area del Rectangulo es: "+resultado);
			break;
			
		default:
			System.out.println("Error, seleccione un numero del 1 al 3");
		}

	}

}
