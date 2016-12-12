//Escribir un programa que calcule e imprima la suma de los números enteros comprendidos
//entre A y B que deben leerse por teclado y filtrarse para que A<=B. Los valores de A y B no
//deben incluirse en la suma.

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int a,b,resultado=0;

		System.out.println("Escribe el valor de A:");
		a= teclado.nextInt();
		System.out.println("Escribe el valor de B:");
		b= teclado.nextInt();

		if(a<b){
			for(int i=a+1;i<b;i++)	
				resultado+=i;
			
			System.out.println("El resultado es: " +resultado);
		}
		
		else
			System.out.println("ERROR: A no es menor que B.");

	}

}
