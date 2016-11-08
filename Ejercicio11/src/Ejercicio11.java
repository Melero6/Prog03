

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont;
		boolean a=false;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		
		if (n<=2&&n>=-1)
			n=3;
		
		cont=n-1;
		System.out.print("Los primos son: ");
		while(cont>1)
		{
			a=false;
			if(n%cont==0)
			{
				cont=2;
				a=true;
			}
			--cont;
//			if (cont==1&&n>=3&&n%cont!=0)
//			{
//				a=true;
//			}
			if (cont==1&&a==false)
			{
				System.out.print(n);
				--n;
				cont=n-1;
				if(n==3)
					cont=0;
			}		
		}
		
	}
}
	