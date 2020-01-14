/*Dado el siguiente array, realizar la ordenación e impresión del array resultado.
int[] arrayDesordenado= {121,24,1,258,0,-3,8}
Realizarlo con dos métodos. Uno para ordenar el array y otro para la impresión.
Deberá realizarse ‘a mano‘ y no mediante ningún método de ordenación como sort*/

package boletin3;
import java.io.ObjectStreamException;
import java.util.Scanner;
import utilBoletin3.UtilPrimeraEv;

public class Ejercicio2 
{
	public static void main (String[] args)
	{
		int arrayDesordenado[]=introducirSecuenciaDeNúmerosEnArray(); 								//{121,24,258,0,-3,8};
		int arrayOrdenado[]=ordenarArray(arrayDesordenado);
		imprimirArrayOrdenado(arrayOrdenado);
	}
	public static int[] ordenarArray(int arrayDesordenado[])
	{
		int arrayOrdenado[]=new int[arrayDesordenado.length];
		int longitud=0;
		for(int x:arrayOrdenado)
		{
			arrayOrdenado[longitud]=Integer.MIN_VALUE;
			longitud++;
		}
		longitud=0;
		do
		{
			int baul=Integer.MIN_VALUE;
			for(int x:arrayDesordenado)
			{
				if(x!=arrayOrdenado[longitud])
				{
					if(x>baul)
					baul=x;
				}
			}
			arrayOrdenado[longitud]=baul;
			int longitud2=0;
			for(int x:arrayDesordenado)
			{
				if(x==baul)
					arrayDesordenado[longitud2]=Integer.MIN_VALUE;
				longitud2++;
			}
			longitud++;
		}
		while(longitud!=arrayOrdenado.length);		
		
		return arrayOrdenado;
	}
	public static void imprimirArrayOrdenado(int arrayOrdenado[])
	{
		for(int menudoCoñazoDeEjercicio:arrayOrdenado)
			System.out.println(menudoCoñazoDeEjercicio);	
	}
	public static int[] introducirSecuenciaDeNúmerosEnArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Indica la cantidad de cifras a ordenar");
		int longitud=UtilPrimeraEv.obtenerNumeroInt();
		int secuencia[]=new int[longitud];
		System.out.println("Introduce las cifras que quieras ordenar");
		while(longitud!=0)
		{
			int num=UtilPrimeraEv.obtenerNumeroInt();
			secuencia[longitud-1]=num;
			longitud--;
		}
		return secuencia;
	}
}
