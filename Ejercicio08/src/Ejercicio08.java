//Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Hacer un programa que
//lea un número N filtrando que debe ser mayor que cero y calcule su factorial.

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		long resultado;
		int entrada;

		System.out.println("Escribe el numero para calcular su factorial (Ten en cuenta que no puedes calcular el factorial de un numero superior a 20 con este programa).");
		entrada= teclado.nextInt();
		resultado=entrada;

		for (int i=entrada-1;i>0;i--)
			resultado=resultado*i;

		
		if (entrada<0)
			System.out.println("El numero no puede ser negativo.");
		else if (entrada==0)
			System.out.println("El factorial de "+entrada+" es igual a: 1");
		else
			System.out.println(entrada>20?"La entrada es mayor a 20, asi que "+resultado+" no es un resultado correcto.":"El factorial de "+entrada+" es igual a: "+ resultado);
	}

}
