//Escribir un programa que una vez que lea un número N por teclado calcule y escriba sus
//divisores por la pantalla (sin incluirse a si mismo).

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		cont=n;
		System.out.print("Los divisores de "+n+" son: ");
		while(cont!=0)
		{
			--cont;
			if(cont!=0&&(n%cont)==0)
			{
				System.out.print(cont+" ");
			}
		}
	}
}
