package Utilidades;

import java.util.Scanner;

public class prueba 
{

	public static void main(String[] args)
	{
			String binarioString="";
			char binarioChar;
			int binario;
			boolean noBinario=false;
			char charComprobacionFor;
		
			do
			{	
				noBinario=false;
				System.out.println("Introduce un n�mero binario");
				binario=util.obtenerNumeroInt();
				binarioString=String.valueOf(binario);
				for(int x=binarioString.length()-1;x>=0;x--)
				{
					charComprobacionFor=binarioString.charAt(x);
					if
					((charComprobacionFor!='1')
							&&
					(charComprobacionFor!='0'))
					{
						noBinario=true;
					}
				}
				if(noBinario==true)
				{
					System.out.println("El n�mero introducido no es un n�mero binario");
				}		
			}
			while(noBinario==true);
			System.out.println("El numero introducido es "+binario);
		}

	}

