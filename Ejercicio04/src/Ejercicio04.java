//Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es
//o no primo (NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, contador, salida;
		boolean primo=true;
		System.out.println("Escribe un numero para comprobar si es primo:");
		entrada= teclado.nextInt();
		salida=entrada;
		contador=entrada-1;
		
		while(contador>1&&primo)
		{
			if(entrada%contador==0)
			{
				System.out.println("El numero "+salida+" no es primo.");
				primo=false;
			}
			--contador;
		}
		if (entrada<=1)
			System.out.println("El numero "+salida+" no es primo.");
		else if (primo)
			System.out.println("El numero "+salida+" es primo.");
	}

}