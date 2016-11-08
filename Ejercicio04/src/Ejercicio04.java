//Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es
//o no primo (NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont,sal;
		boolean a=false;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		sal=n;
		if(n<-1) //Para numeros negativos
		{
			n=((n/n-n)-1);//Asi conseguimos el positivo del negativo que introducimos Ejem: -4 = 4 ; -7 = 7
		}	
		cont=n-1;
		while(cont>1)
		{
			if(n%cont==0)
			{
				System.out.println("El numero "+sal+" no es primo.");
				cont=2;
				a=true;
			}
			--cont;
		}
		if (n<=1&&n>=-1)
			System.out.println("El numero "+sal+" no es primo.");
		else if (a==false)
			System.out.println("El numero "+sal+" es primo.");
	}

}