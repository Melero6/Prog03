//Escribir un programa que una vez que lea un número N por teclado calcule y escriba sus
//divisores por la pantalla (sin incluirse a si mismo).

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada;
		System.out.println("Escribe un numero para calcular sus divisores:");
		entrada= teclado.nextInt();

		System.out.print("Los divisores de "+entrada+" (sin incluirse) son: ");
		
		for(int i=entrada-1;i>0;i--)
			if(entrada%i==0)
				System.out.print(i+" ");
		
		
	}
}
