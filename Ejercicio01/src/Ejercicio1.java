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
//			for(c=a-b-1;c<b;c++)
//			{
//				a++;
//				b--;
//			}
	
		while(c<=b-1);
		{
			
			d = d + c;
			++c;
			System.out.println(c+"c");
			System.out.println(a+"a");
			System.out.println(d+"d");
		}
		} else{
			System.out.println("A no es menor que B");
		}
			
	}

}
