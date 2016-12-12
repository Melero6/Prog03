//Un número se dice que es perfecto cuando la suma de sus divisores propios –todos los divisores
//a excepción del propio número-, es igual a dicho número. Hacer un programa que lea un
//número y nos diga si es perfecto o no.

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, sumaDivisores=0;
		
		System.out.println("Escribe el numero para saber si es perfecto:");
		entrada = teclado.nextInt();
		
		if(entrada<2)
			System.out.println("El numero "+entrada+" no es perfecto.");
		
		else {
		System.out.print("El numero "+entrada);
		
		for(int i=entrada-1;i>0;i--)
			if(entrada%i==0)
				sumaDivisores+=i;
		
		System.out.print(sumaDivisores==entrada?" es perfecto.":" no es perfecto.");
		}
	}
}
