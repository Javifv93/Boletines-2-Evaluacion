/** Realizar un m�todo que, pasado un array de caracteres, 
 * pida al usuario tantos valores como sean necesarios para llenar el array. 
 * Por ejemplo, si se le pasa un array de tama�o 3 deber� pedir al usuario 3 
 * valores y guardarlos en el array.
*/
package ejercicio3;
import java.util.Scanner;
public class Main 
{
	public static void main (String[] args)
	{
		int tamanhoArray = 7; 	//Modificar para probar distintos tama�os
		char[] array = new char[tamanhoArray];
		rellenarArray(array);
	}
	static void rellenarArray (char[] array)
	{
		int longArray = array.length;
		System.out.println("Introduce "+longArray+" car�cteres:");
		for (int x=0;x<longArray;x++)
		{
			array[x] = obtenerChar();
		}
		
		// El ejercicio no lo pide, pero a�ado este for con el print para visualizar el resultado
		for (int z=0;z<longArray;z++)	
		System.out.println("\r"+array[z]);	 
	}
	static char obtenerChar ()
	{
		Scanner sc = new Scanner(System.in);
		String linea="";
		char caracter=' ';
		boolean hayCaracter=false;
		while (hayCaracter==false) 
		{
			if (sc.hasNext())
				linea=sc.next();
			if (linea.length()>1)
			{
				System.out.println("Introduce solo un car�cter");
				sc.reset();
			}
			else
			{
				caracter = linea.charAt(0);
				hayCaracter = true;
			}
		}
		return caracter;
	}
}
