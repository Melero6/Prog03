import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, d;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		d=n;
		System.out.print("Los divisores de "+n+" son: ");
		while(d!=0)
		{
			--d;
			if(d!=0&&(n%d)==0)
			{
				System.out.print(d+" ");
			}
		}
	}
}
