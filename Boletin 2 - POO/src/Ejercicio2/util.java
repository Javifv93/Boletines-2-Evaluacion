package Ejercicio2;
import java.util.Scanner;

public class util 
{
	public static int obtenerNumeroMenu()
	{
		Scanner sc=new Scanner(System.in);
		boolean x=false;
		int numero=0;
				
		while(!x)
		{
			while(!x)
			{
				if(sc.hasNextInt())
				{
					numero=sc.nextInt();
					if((numero>=0)&&(numero<=4))
					{
						x=true;
					}
					else
					{
						System.out.println("Introduce una opción válida");
						sc.next();
					}
				}
				else
				{
					System.out.println("Introduce una opción válida");
					sc.next();
				}
			}
		}
		return(numero);
	}
	public static double obtenerNumeroPositivoDouble()
	{
		Scanner sc=new Scanner(System.in);
		boolean x=false;
		double numeroPositivo=0;
				
		while(!x)
		{
			while(!x)
			{
				if(sc.hasNextDouble())
				{
					numeroPositivo=sc.nextDouble();
					x=true;
				}
				else
				{
					System.out.println("Introduce un valor numérico válido");
					sc.next();
				}
			}
			if(numeroPositivo<0)
			{
				System.out.println("Introduce un valor positivo");
				x=false;
			}
		}
		return(numeroPositivo);
	}
}
