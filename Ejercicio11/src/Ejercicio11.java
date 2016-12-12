//Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, cont=2, a=2;

		System.out.println("Escribe el numero del que quieres calcular los primos entre 1 y el numero:");
		entrada= teclado.nextInt();
		
		if (entrada<=1)
			System.out.print("No hay primos hasta: "+entrada);
		
		else
		System.out.println("Los numero primos hasta "+entrada+" son:\n2");
		
		while (cont<=entrada)
		{
			while(cont>a)
			{
				if (cont%a==0)
					a=cont;

				else if (a==cont-1)
					System.out.println(cont);
			
				++a;
			}
			a=2;
			++cont;
		}
	}
}
