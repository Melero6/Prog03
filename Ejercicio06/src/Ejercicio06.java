//Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará
//el fin de la entrada de datos. El programa debe calcular y escribir la suma de los números
//introducidos en lugar par y de los introducidos en lugar impar, es decir los introducidos primero,
//tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int entrada, par=0, posicionEntrada=1, impar=0;

		do{
			System.out.println("Escribe el valor de la "+posicionEntrada+"º posición");
			++posicionEntrada;
			entrada = teclado.nextInt();
			
			if(posicionEntrada%2==0)
				par+=entrada;
			else
				impar+=entrada;
		}while(entrada!=0);
		
		System.out.println("La suma de numeros pares es igual a: "+par);
		System.out.println("La suma de numeros impares es igual a: "+impar);
	}

}
