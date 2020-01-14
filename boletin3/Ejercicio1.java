/*Implementar un programa que obtenga un valor de texto del usuario, recorra
ese texto y lo guarde en un array de caracteres. Posteriormente se tendrá que imprimir por
pantalla dicho array.
Para la realización de este ejercicio habrá que usar tres métodos:
● Una función que obtenga el texto por consola.
● Una función a la que se le pase el texto y devuelva el array de caracteres.
● Un procedimiento que, pasado un array de caracteres, lo imprima por pantalla.
*/
package boletin3;
import utilBoletin3.util;
public class Ejercicio1
{
/*	public static void main (String[] args)				//Con toCharArray
		{
			String texto=util.obtenerTexto();
			util.imprimirArrayCharbyChar(texto);
		}											*/
	public static void main (String[] args)				//Sin toCharArray
	{
		String texto=util.obtenerTexto();
		char textoArray[]=deStringAArray(texto);
		imprimirArray(textoArray);
	}
	public static char[] deStringAArray(String texto)
	{
		char textoArray[]=new char[texto.length()];
		for(int i=0;i<texto.length();i++)
		{
			textoArray[i]=texto.charAt(i);
		}
		return textoArray;
	}
	public static void imprimirArray(char textoArray[])
	{
		for(char letras:textoArray)
		{
			System.out.println(letras);
		}
	}
}