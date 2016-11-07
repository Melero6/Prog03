import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		float d=0, a=0,z=0,n,s=0,e=0;
		
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		e=n;
		s=n;
		while(n!=0)
		{
			d=d+n;
			++a;
			if(n>=s)
			s=n;
			else if(n<=e)
			e=n;
			System.out.println("Escribe el valor de N:");
			n= teclado.nextInt();
			
		}
		z=d/a;
		System.out.println("La media de los numeros es igual a: "+z);
		System.out.println("El mayor numero es: "+s);
		System.out.println("El menor numero es: "+e);
	}

}
