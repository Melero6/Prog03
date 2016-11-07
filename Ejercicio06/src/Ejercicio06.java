import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, d=0, a=1, z=0;
		
		System.out.println("Escribe el valor de la 1º posición");
		n= teclado.nextInt();
		z=z+n;
		while(n!=0)
		{
			++a;
			if(a%2==0)
			{
				System.out.println("Escribe el valor de la "+a+"º posición");
				n= teclado.nextInt();
				d=d+n;
			}
			else
			{
				System.out.println("Escribe el valor de la "+a+"º posición");
				n= teclado.nextInt();
				z=z+n;
			}
		}
		System.out.println("La suma de numeros pares es igual a: "+d);
		System.out.println("La suma de numeros impares es igual a: "+z);
	}

}
