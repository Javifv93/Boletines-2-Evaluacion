package Util;

import java.util.Scanner;

public class Util 
{
	public static int obtenerNumeroPositivoInt()
	{
		Scanner sc=new Scanner(System.in);
		boolean x=false;
		int numeroPositivo=0;
				
		while(!x)
		{
			while(!x)
			{
				if(sc.hasNextInt())
				{
					numeroPositivo=sc.nextInt();
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
