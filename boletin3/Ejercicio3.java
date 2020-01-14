/* Implementar un programa que, obteniendo una frase del usuario, guarde en un
array multidimensional el conteo de apariciones de cada carácter. Al final deberá imprimir un
resultado con cada caracter seguido del número de apariciones en la frase.
Realizarlo con al menos tres métodos (pedir texto, obtener el array de apariciones e
imprimir).
*/
/*package boletin3;
import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.Scanner;
import utilBoletin3.UtilPrimeraEv;


public class Ejercicio3 
{
	public static void main(String[] args)
	{
		String texto=obtenerFrase();
		char[][]almacenCoincidencias=obtenerArray(texto);
		imprimirEstaMierda(almacenCoincidencias);
		
	}
	public static String obtenerFrase()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un texto");
		String texto=sc.nextLine();
		return texto;
	}
	public static char [][]obtenerArray(String texto)
	{
		int longitudTexto=texto.length();
		char [][]almacenCoincidencias=comprobadorCoincidencias(longitudTexto,texto);
		return almacenCoincidencias;
		
	}
	public static char [][]comprobadorCoincidencias(int longitudTexto, String texto)
	{
		boolean comprobacion=false;
		int contadorCoincidencias=1;
		int contadorIncidencias=0;
		char[]textoArray=new char[longitudTexto];
		char[]charMander=new char[longitudTexto];
		int[]contadorArray=new int[500];
		for(int x=0;x<longitudTexto;x++)
		{
			textoArray[x]=texto.charAt(x);			//Recorro los caracteres de texto guardandolos en textoArray
		}
		int contadorBucles=0;
		for(int x=0;x<textoArray.length;x++)
		{
			char caracterTexto=texto.charAt(contadorBucles);
			for(int y=x+1;y<textoArray.length;y++)
			{
				char caracterTextoY=textoArray[y];
				if(caracterTexto==caracterTextoY)
				{
					contadorCoincidencias++;
					comprobacion=true;
				}
			}
			if(comprobacion==true)
			{
				charMander[contadorIncidencias]=caracterTexto;
				contadorArray[contadorIncidencias]=contadorCoincidencias;
				contadorIncidencias++;
				contadorCoincidencias=1;
				for(char y:textoArray)
				{
					if(y==charMander[contadorIncidencias-1])
					{
						int contadorZ=0;
						for(int z:textoArray)
						{
							if(textoArray[contadorZ]==y)
								textoArray[contadorZ]='_';
							contadorZ++;
						}
					}
				}
			}
			comprobacion=false;
			contadorBucles++;
		}
		contadorCoincidencias=0;
		for(int x:contadorArray)
		{
			if(x!=0)
				contadorCoincidencias++;
			else
				break;
		}
		
		int []contadorGuay=new int[contadorCoincidencias];
		for(int x:contadorGuay)
		{
			contadorGuay[x]=contadorArray[x];
		}
		char[][] elPutoContadorFinal=new char[2][charMander.length];
		elPutoContadorFinal[0]=charMander;
		char []contadorGuayChar=new char[contadorGuay.length];
		contadorCoincidencias=0;
		for(int x:contadorGuay)
		{
			int num=contadorGuay[contadorCoincidencias];
			char caracter=(char)(num+48);
			contadorGuayChar[contadorCoincidencias]=caracter;
			contadorCoincidencias++;
		}
		for(int x=0;x<contadorGuay.length;x++)
		{
			elPutoContadorFinal[1][x]=contadorGuayChar[x];
		}
		return elPutoContadorFinal;
	}
	public static void imprimirEstaMierda(char [][]almacenCoincidencias)
	{
			System.out.println("Las coincidencias son las siguientes: "+Arrays.deepToString(almacenCoincidencias));
	}
}	
*/
package boletin3;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 
{
	public static void main(String[] args)
	{
		String texto=obtenerFrase();
		String[][]almacenCoincidencias=obtenerArray(texto);
		imprimirEstaMierda(almacenCoincidencias,texto); 
	}
	public static String obtenerFrase()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un texto");
		String texto=sc.nextLine();
		return texto;
	}
	public static String [][]obtenerArray(String texto)
	{
		int longitudTexto=texto.length();
		String [][]almacenCoincidencias=comprobadorCoincidencias(longitudTexto,texto);
		return almacenCoincidencias;
		
	}
	public static String [][]comprobadorCoincidencias(int longitudTexto, String texto)
	{
		char []textoArray=new char[longitudTexto];
		int []contadorArray=new int[longitudTexto];
		int posicionEnTextoArray=0;
		int contadorCoincidencias=1;
		
		for(int x=0;x<longitudTexto;x++)
		{
			boolean noEstaRepetida=true;
			char caracterX=texto.charAt(x);
			for (char i:textoArray)
			{
				if(caracterX==i)
					noEstaRepetida=false;
			}
			if(noEstaRepetida==true)
			{
				boolean hayCoincidencias=false;
				for(int y=(x+1);y<longitudTexto;y++)
				{
					char caracterY=texto.charAt(y);
					if(caracterX==caracterY)
					{
						contadorCoincidencias++;
						hayCoincidencias=true;
					}
				}
				if(hayCoincidencias==true)
				{
					contadorArray[posicionEnTextoArray]=contadorCoincidencias;
					contadorCoincidencias=1;
				}
				else
					contadorArray[posicionEnTextoArray]=contadorCoincidencias;
				textoArray[posicionEnTextoArray]=caracterX;
				posicionEnTextoArray++;
			}
		}
		String [][]arrayFinal=new String[2][posicionEnTextoArray];
		for(int x=0;x<posicionEnTextoArray;x++)
		{
			String z=String.valueOf(textoArray[x]);
			arrayFinal[0][x]=z;
		}
		for(int y=0;y<(posicionEnTextoArray);y++)
		{
			String z=String.valueOf(contadorArray[y]);
			arrayFinal[1][y]=z;
		}
		return arrayFinal;
	}
	public static void imprimirEstaMierda(String [][]almacenCoincidencias, String texto)
	{
		//Arrays.deepToString(almacenCoincidencias)
		for(int x=0;x<almacenCoincidencias[0].length;x++)
		{
			
			System.out.println(almacenCoincidencias[0][x]+" -> "+almacenCoincidencias[1][x]);
		}
	}
}
