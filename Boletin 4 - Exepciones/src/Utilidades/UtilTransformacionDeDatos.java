package Utilidades;
import java.io.IOException;
import java.util.Scanner;

public class UtilTransformacionDeDatos 
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
			//Ej1 y Ej 2
		//String str1=sc.nextLine();
			//Ej1
		/*
		boolean comprobacion=esValorNumerico(str1);
		if(comprobacion==true)
			System.out.println("El primer valor es correcto");
		*/
			//Ej2
		/*
		try
		{
			obtenerValorDouble(str1);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Se ha producido un error. El numero introducido no tiene un formato adecuado");
		}
		*/
			//Ej3
		/*
		boolean comprobacion=false;
		double valor = 0;
		while(!comprobacion)
		{
			System.out.println("Introduce un numero");
			String str2=sc.nextLine();
				try 
				{
					valor=obtenerValorNumericoPositivo(str2);
					comprobacion=true;
				}
				catch (ValorNumericoNegativoException e) 
				{
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		System.out.println("El numero introducido es: \r"+valor);
		*/
	}
	public static boolean esValorNumerico (String str1)
	{														//Ej1
		boolean comprobacion=true;
		try
		{
			int valor=Integer.parseInt(str1);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Se ha producido un error. El numero introducido no tiene un formato adecuado");
			comprobacion=false;
		}
		return comprobacion;
	}
	public static double obtenerValorDouble(String str1)throws NumberFormatException
	{														//Ej2
		double valorDouble=Double.parseDouble(str1);
		return valorDouble;
	}
	public static double obtenerValorNumericoPositivo (String str1)throws ValorNumericoNegativoException
	{														//Ej3
		double valor=Double.parseDouble(str1);
		if(valor<0)
			throw new ValorNumericoNegativoException("Error. Introduzca un numero positivo");
		return valor;	
	}
}
