

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, cont;
		boolean a=false;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		n=n+1;
		if (n<=2&&n>=-1)
			n=2;
		
		cont=n-1;
		while(cont>1)
		{
			a=false;
			if(n%cont==0&&(n!=1||n!=0))
			{
				cont=2;
				a=true;
			}
			--cont;
			if (cont==1&&a==true)
			{
				n=n+1;
				cont=n-1;
			}
		}
		if (a==false)
		System.out.println("El numero "+n+" es el siguiente primo.");
		
	}
}
	


