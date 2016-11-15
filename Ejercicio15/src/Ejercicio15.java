import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.println("Introduce el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		numero2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero: ");
		numero3 = teclado.nextInt();
		if(numero1==numero2&&numero2==numero3)
		{
			System.out.print(numero3+" ");
			System.out.print(numero2+" ");
			System.out.print(numero1+" ");
		}
		else
		{
			if(numero1>numero2&&numero1>numero3&&numero2!=numero3)
			{
				if (numero2>numero3)
				{
					System.out.print(numero3+" ");
					System.out.print(numero2+" ");
					System.out.print(numero1+" ");
				}
				else
				{
					System.out.print(numero2+" ");
					System.out.print(numero3+" ");
					System.out.print(numero1+" ");
				}
			}
			if(numero2>numero1&&numero2>numero3&&numero1!=numero3)
			{
				if (numero1>numero3)
				{
					System.out.print(numero3+" ");
					System.out.print(numero1+" ");
					System.out.print(numero2+" ");
				}
				else
				{
					System.out.print(numero1+" ");
					System.out.print(numero3+" ");
					System.out.print(numero2+" ");
				}
			}
			if(numero3>numero2&&numero3>numero1&&numero2!=numero1)
			{
				if (numero1>numero2)
				{
					System.out.print(numero2+" ");
					System.out.print(numero1+" ");
					System.out.print(numero3+" ");
				}
				else
				{
					System.out.print(numero1+" ");
					System.out.print(numero2+" ");
					System.out.print(numero3+" ");
				}
			}
			if(numero1==numero2)
			{
				if(numero1>numero3)
				{
					System.out.print(numero3+" ");
					System.out.print(numero1+" ");
					System.out.print(numero2+" ");
				}
				else
				{
					System.out.print(numero1+" ");
					System.out.print(numero2+" ");
					System.out.print(numero3+" ");
				}
			}
			if(numero2==numero3)
			{
				if(numero2>numero1)
				{
					System.out.print(numero1+" ");
					System.out.print(numero2+" ");
					System.out.print(numero3+" ");
				}
				else
				{
					System.out.print(numero3+" ");
					System.out.print(numero2+" ");
					System.out.print(numero1+" ");
				}
			}
			if(numero1==numero3)
			{
				if(numero3>numero2)
				{
					System.out.print(numero2+" ");
					System.out.print(numero1+" ");
					System.out.print(numero3+" ");
				}
				else
				{
					System.out.print(numero1+" ");
					System.out.print(numero3+" ");
					System.out.print(numero2+" ");
				}
			}

		}
	}

}
