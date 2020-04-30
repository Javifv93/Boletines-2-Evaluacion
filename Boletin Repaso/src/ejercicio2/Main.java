/**Apartado 1: Realizar un m�todo que recibiendo un array de caracteres construya tres cadenas de texto,
una con los n�meros enteros de ese array, otro con las letras y otro con los caracteres que no son
n�meros ni letras.
Apartado 2: Realizar un m�todo para la impresi�n de esas cadenas de texto sacando por pantalla su
valor caracter a caracter
*/
package ejercicio2;

public class Main 
{
	public static void main (String[] args)
	{
		String cadena = "1ntr0duc3 3l t3xt0 d3 pru3b@";
		int x = cadena.length();
		char[] array=new char[x];
		for (int z=0;z<x;z++)
			array[z]=cadena.charAt(z);
		clasificachars(array);
	}
	static void clasificachars (char[] array)
	{
		String cadenaText="";
		String cadenaNum="";
		String cadenaSymb="";
		for (int x=0;x<array.length;x++)
		{				//Hago la comprobaci�n de los car�cteres seg�n su valor ASCII
			char caracter=array[x];
			if ((caracter>=48)&&(caracter<=57))
				cadenaNum=cadenaNum + caracter;
			else if(((caracter>=65)&&(caracter<=90))||((caracter>=97)&&(caracter<=122)))
				cadenaText=cadenaText + caracter;
			else
				cadenaSymb=cadenaSymb + caracter;
		}
		imprimirCadenas(cadenaText, cadenaNum, cadenaSymb);
	}
	static void imprimirCadenas (String cadenaText,String cadenaNum,String cadenaSymb )
	{
		System.out.println("Car�cteres de texto: " + cadenaText +
				"\rCar�cteres num�ricos: " +cadenaNum+
				"\rOtros car�cteres: "+ cadenaSymb);
	}
}
