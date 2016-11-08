//Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará
//el fin de la entrada de datos. El programa debe calcular y escribir la suma de los números
//introducidos en lugar par y de los introducidos en lugar impar, es decir los introducidos primero,
//tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, par=0, a=1, impar=0;

		System.out.println("Escribe el valor de la 1º posición");
		n= teclado.nextInt();
		impar=impar+n;
		while(n!=0)
		{
			++a;
			if(a%2==0)
			{
				System.out.println("Escribe el valor de la "+a+"º posición");
				n= teclado.nextInt();
				par=par+n;
			}
			else
			{
				System.out.println("Escribe el valor de la "+a+"º posición");
				n= teclado.nextInt();
				impar=impar+n;
			}
		}
		System.out.println("La suma de numeros pares es igual a: "+par);
		System.out.println("La suma de numeros impares es igual a: "+impar);
	}

}
