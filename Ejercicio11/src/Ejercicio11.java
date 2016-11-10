

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont=2, a=2;

		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		if (n<=1)
		{
			System.out.print("No hay primos hasta: "+n);
			cont=n;
			++cont;
		}
		else
		System.out.print("Los numero primos hasta "+n+" son: 2 ");
		while (cont<=n)
		{
			while(cont>a)
			{
				if (cont%a==0)
				{
					a=cont;
				}
				else if (a==cont-1)
					System.out.print(cont+" ");
			
				++a;
			}
			a=2;
			++cont;
		}
	}
}
