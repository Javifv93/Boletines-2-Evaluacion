/*: Realiza un programa que asigne datos num�ricos a un array bidimensional y a
continuaci�n escriba las sumas correspondientes a las filas del array (consideramos que la
primera dimensi�n del array son las filas).
Un ejemplo de ejecuci�n del programa es el siguiente:
N�mero de filas del array: 2
N�mero de columnas del array: 2
Introducir los valores del array
m[0][0] = 5
m[0][1] = 6
m[1][0] = 4
m[1][1] = 2
Con estos datos, de entrada, ha de mostrar en pantalla la siguiente informaci�n:
Suma de la fila 0: 11
Suma de la fila 1: 6*/

package boletin3;
import java.util.Scanner;
import utilBoletin3.util;

public class Ejercicio4 
{
	public static void main (String[] args)
	{
		int almacenNumeros[][]=pedirNumerosArray();
		util.visualizarTablaArrayBiD(almacenNumeros);
		operacionArray(almacenNumeros);
	}
	public static int [][] pedirNumerosArray()
	{
		Scanner sc=new Scanner(System.in);
		int numA=0;int numB=0;
		System.out.println("Vamos a realizar un cuadro num�rico en el cual se almacenen y sumen valores\r");
		System.out.println("Introduce el n�mero de filas del cuadro (MAX 10)");
		numA=util.obtenerNumeroPositivoInt();
		System.out.println("Introduce el n�mero de columnas del cuadro (MAX 10)");
		numB=util.obtenerNumeroPositivoInt();
		int almacenNumeros[][]=new int[numA][numB];
		for(int x=0;x<numA;x++)
		{
			System.out.println("Introduzca los "+numB+" n�meros de la fila "+x);
			for(int xA=0;xA<numB;xA++)
			{
				int num=util.obtenerNumeroPositivoInt();
				almacenNumeros[x][xA]=num;
			}
		}
		return almacenNumeros;
	}
	public static void operacionArray(int almacenNumeros[][])
	{
		int numFilas=almacenNumeros.length;
		int numColumnas=almacenNumeros[0].length;	
		
		System.out.println("Quieres sumar los n�meros de una fila o de una columna?");
		System.out.println("1- Fila \r2- Columna");
		int num=util.obtenerNumeroPositivoInt();
		boolean esCorrecto=false;
		while(!esCorrecto)
		{
			if((num!=0)&&(num!=1))
			{
				System.out.println("El n�mero introducido no es v�lido");	
			}
			else
				esCorrecto=true;
		}
		switch(num)
		{
			case 1:
			{
				System.out.println("Elige la fila a sumar");
				for( int y=1;y<numFilas+1;y++)
				{
					System.out.print("Fila "+y+" ");
					System.out.print("[ \r");
					for (int x=0;x<numFilas;x++)
					{
						System.out.print(" "+almacenNumeros[0][x]);
					}
					System.out.print(" ]");
					
				}
				boolean comprobacion=false;
				num=0;
				while(!comprobacion)
				{
					num=util.obtenerNumeroPositivoInt();
					if((num==0)||(num>numFilas))
					{
						System.out.println("Introduce una fila v�lida");
					}
					else
						comprobacion=true;
				}
				int Sumatorio=0;
				switch(num)
				{
					case 1:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[0][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 2:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[1][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 3:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[2][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 4:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[3][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 5:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[4][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 6:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[5][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 7:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[6][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 8:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[7][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 9:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[8][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
					case 10:
					{
						for(int x=0;x<numColumnas;x++)
						{
							Sumatorio=Sumatorio+almacenNumeros[9][x];
						}
						System.out.println("La suma de la fila "+num+" es "+Sumatorio);
					}
				}
				
			}
		}
	}
}
