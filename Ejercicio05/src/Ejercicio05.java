import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, d=0, a=0;
		
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		
		while(n!=0)
		{
			d=d+n;
			++a;
			System.out.println("Escribe el valor de N:");
			n= teclado.nextInt();
			
		}
		System.out.println("La suma de la serie es igual a: "+d);
		System.out.println("La serie contiene "+a+" numeros.");
	}

}
