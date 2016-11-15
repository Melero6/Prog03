import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,x1,x2,divisor,dividendo1,dividendo2,raiz;	
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el valor de a:");
		a =teclado.nextFloat();
		System.out.println("Escribe el valor de b:");
		b =teclado.nextFloat();
		System.out.println("Escribe el valor de c:");
		c =teclado.nextFloat();
		raiz=b*b-4*a*c;
		if (raiz<0)
			raiz=raiz-(raiz*2);

		dividendo1=(float) (-b+Math.sqrt(raiz));
		dividendo2=(float) (-b-Math.sqrt(raiz));
		divisor=(2*a);
		x1=dividendo1/divisor;
		x2=dividendo2/divisor;
		raiz=b*b-4*a*c;
		if (raiz<0)
		{	
			System.out.println("El valor de x1 es:"+x1+"*√-1");
			System.out.println("El valor de x2 es:"+x2+"*√-1");
		}
		else
		{
			System.out.println("El valor de x1 es:"+x1);
			System.out.println("El valor de x2 es:"+x2);
		}


	}

}