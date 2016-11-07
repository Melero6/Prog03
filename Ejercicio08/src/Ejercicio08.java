import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		long a,b,d;

		d=0;
		System.out.println("Escribe el valor de A");
		a= teclado.nextInt();
		d=a-1;

		while (d>0)
		{
			a=a*d;
			--d;
		}
		
		System.out.println("Escribe el valor de A"+ a);
	}

}
