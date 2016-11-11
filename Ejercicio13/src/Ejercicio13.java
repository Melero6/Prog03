import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,x1,x2,z,x,v;	
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el valor de a:");
		a =teclado.nextInt();
		System.out.println("Escribe el valor de b:");
		b =teclado.nextInt();
		System.out.println("Escribe el valor de c:");
		c =teclado.nextInt();
		z=(int) (-b+Math.sqrt((b*b)-4*a*c));
		x=(int) (-b-Math.sqrt((b*b)-4*a*c));
		v=(2*a);
		x1=z/v;
		x2=x/v;
		if(z%v==0)
			System.out.println("El valor de x1 es:"+x1);

		else
			System.out.println("El valor de x1 es:"+z+"/"+v);

		if (x%v==0)
			System.out.println("El valor de x2 es:"+x2);

		else
			System.out.println("El valor de x2 es:"+x+"/"+v);
	}

}
