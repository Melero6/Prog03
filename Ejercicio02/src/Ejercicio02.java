//Leer un número N que debe filtrarse entre 1 y 100 y a continuación calcular y escribir la tabla de
//multiplicar de ese número con el siguiente formato:
//TABLA DE MULTIPLICAR DE 8
//8 * 1 = 8
//8 * 2 = 16
//8 * 3 = 24
//......
//8 * 10 = 80

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		if (n>0&&n<=100)
		{
			System.out.println("TABLA DE MULTIPLICAR DE "+n);
			for(int i=1;i<=10;++i)
			{
				System.out.println(n+" * "+i+" = "+n*i);
			}
		}
		else
			System.out.println("El valor no esta entre 1 y 100");
	}

}
