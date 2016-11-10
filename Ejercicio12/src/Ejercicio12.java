import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, a, b;

		System.out.println("Introduce el numero correspondiente a la figura de la que quieres calcular el area:");
		System.out.println("    1 - Triángulo");
		System.out.println("    2 - Cuadrado");
		System.out.println("    3 - Rectangulo");

		n= teclado.nextInt();
		if (n>=1&&n<=3)
		{
			
			switch(n)
			{
			case (1):
			case (2):
			case (3):	
			}
		}	
		else	
			System.out.println("Error, seleccione un numero del 1 al 3");

	}

}
