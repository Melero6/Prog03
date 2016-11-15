import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int entrada, centena, decena,unidad;
		
		System.out.println("Escribe un numero entre 100 y 999 (incluidos)");
		entrada = teclado.nextInt();
		if (entrada>=100&&entrada<=999)
		{
			System.out.print("El numero "+entrada+" al reves es: ");
			centena=entrada/100;
			decena=(entrada-centena*100)/10;
			unidad=entrada-(centena*100+decena*10);
			System.out.print(unidad);
			System.out.print(decena);
			System.out.print(centena);
			
		}
		else
			System.out.println("Error: "+entrada+" no esta entre 100 y 999");
	}

}
