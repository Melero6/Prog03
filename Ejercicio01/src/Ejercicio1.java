//Escribir un programa que calcule e imprima la suma de los números enteros comprendidos
//entre A y B que deben leerse por teclado y filtrarse para que A<=B. Los valores de A y B no
//deben incluirse en la suma.

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		int a,b,resu;
		resu=0;
		System.out.println("Escribe el valor de A");
		a= teclado.nextInt();
		System.out.println("Escribe el valor de B");
		b= teclado.nextInt();
		int cont=1+a;
		if(a<b){
			while(cont<=b-1)
			{	
				resu = resu + cont;
				++cont;
			}
		} 
		else
			System.out.println("A no es menor que B");

		System.out.println("El valor es: " +resu);
	}

}
