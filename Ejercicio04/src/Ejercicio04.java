//Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es
//o no primo (NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont;
		boolean a=false;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		cont=n-1;
		while(cont>1)
		{
			if(n%cont==0)
			{
				System.out.println("El numero "+n+" no es primo");
				cont=2;
				a=true;
			}
			--cont;
		}
		if (a==false)
			System.out.println("El numero "+n+" es primo");
	}

}
