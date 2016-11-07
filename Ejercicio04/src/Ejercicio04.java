import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, d;
		boolean a=false;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		d=n-1;
		while(d>1)
		{
			if(n%d==0)
			{
				System.out.println("El numero "+n+" no es primo");
				d=2;
				a=true;
			}
			--d;
		}
		if (a==false)
		System.out.println("El numero "+n+" es primo");
	}

}
