import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,x1,x2,divisor,dividendo1,dividendo2,raiz;	
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el valor de a:");
		a =teclado.nextInt();
		System.out.println("Escribe el valor de b:");
		b =teclado.nextInt();
		System.out.println("Escribe el valor de c:");
		c =teclado.nextInt();
		raiz=b*b-4*a*c;
		if (raiz<0)
		raiz=raiz-(raiz*2);
		
		dividendo1=(int) (-b+Math.sqrt(raiz));
		dividendo2=(int) (-b-Math.sqrt(raiz));
		divisor=(2*a);
		x1=dividendo1/divisor;
		x2=dividendo2/divisor;
		raiz=b*b-4*a*c;
		if (raiz<0)
		{
		if(dividendo1%divisor==0)
			System.out.println("El valor de x1 es:"+x1);
		else
			System.out.println("El valor de x1 es:"+dividendo1+"/"+divisor);
		if (dividendo2%divisor==0)
			System.out.println("El valor de x2 es:"+x2+"*√-1");
		else
			System.out.println("El valor de x2 es:"+dividendo2+"*√-1/"+divisor);
		}
		else
		{
		if(dividendo1%divisor==0)
			System.out.println("El valor de x1 es:"+x1);
		else
			System.out.println("El valor de x1 es:"+dividendo1+"/"+divisor);
		if (dividendo2%divisor==0)
			System.out.println("El valor de x2 es:"+x2);
		else
			System.out.println("El valor de x2 es:"+dividendo2+"/"+divisor);
		}
	}

}