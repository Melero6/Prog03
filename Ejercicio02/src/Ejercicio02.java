import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n;
		System.out.println("Escribe el valor de N:");
		n= teclado.nextInt();
		if (n>0&&n<=100)
		{
			System.out.println("TABLA DE MULTIPLICAR DE "+n);
			System.out.println(n+" * 1 = "+n*1);
			System.out.println(n+" * 2 = "+n*2);
			System.out.println(n+" * 3 = "+n*3);
			System.out.println(n+" * 4 = "+n*4);
			System.out.println(n+" * 5 = "+n*5);
			System.out.println(n+" * 6 = "+n*6);
			System.out.println(n+" * 7 = "+n*7);
			System.out.println(n+" * 8 = "+n*8);
			System.out.println(n+" * 9 = "+n*9);
			System.out.println(n+" * 10 = "+n*10);
		}
		else
			System.out.println("El valor no esta entre 1 y 100");
			
			
		
		
	}

}
