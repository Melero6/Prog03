

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont, resu=0;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		cont=n;
		System.out.print("El numero "+n);
		while(cont!=0)
		{
			--cont;
			if(cont!=0&&(n%cont)==0)
			{
				resu=resu+cont;
			
			}
		}
		if (resu==n)
			System.out.print(" es perfecto.");
		else
			System.out.print(" no es perfecto.");
			
	}
}
