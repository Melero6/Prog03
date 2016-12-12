//Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, contador;
		boolean noPrimo=false;
		
		System.out.println("Escribe un numero para saber cual es el numero primo mas cercano por exceso:");
		entrada= teclado.nextInt();
		entrada=entrada+1;

		if (entrada<2) //Si introduces un numero menor a 2, el siguiente primo va a ser siempre 2.
			entrada=2;

		contador=entrada-1;
		while(contador>1)
		{
			if(entrada%contador==0&&(entrada!=1||entrada!=0))
			{
				contador=2;
				noPrimo=true; //Indica si el numero que se comprueba no es primo.
			}
			if (noPrimo==true) //Si el numero es divisible entre un numero que no es el mismo o uno, se cumple la condicion y se suma 1.
			{
				++entrada;
				contador=entrada;
				noPrimo=false;
			}
			--contador;
		}
		System.out.println("El numero "+entrada+" es el siguiente primo.");
	}
}



