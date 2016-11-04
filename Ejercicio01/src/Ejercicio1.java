import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		int a;
		int b;
		int d;
		d=0;
		System.out.println("Escribe el valor de A");
		a= teclado.nextInt();
		System.out.println("Escribe el valor de B");
		b= teclado.nextInt();
		int c=1+a;
		if(a<b){
			while(c<=b-1)
			{	
				d = d + c;
				++c;
			}
		} 
		else
		{
			System.out.println("A no es menor que B");
		}
		System.out.println("El valor es: " +d);
	}

}
