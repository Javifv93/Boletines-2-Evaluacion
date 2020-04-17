/**Realizar el siguiente método de forma recursiva, sabiendo que tiene que imprimir una
cadena al revés:
	private static String obtenerReverso(String cadena, int pos)
El valor de pos comenzará en la última posición a obtener de la cadena (cadena.length -1).*/

package ejercicio3;

public class main 
{
	public static void main (String[] args)
	{
		String cadena = "Feliz Cuarentena!";//Modificar manualmente para hacer pruebas
		int pos = cadena.length()-1;
		cadena = obtenerReverso(cadena, pos);
	}
	private static String obtenerReverso(String cadena, int pos)
	{
		System.out.print(cadena.charAt(pos));
		pos--;
		if (pos >= 0)
		{
			obtenerReverso(cadena, pos);
		}
		return cadena;
	}
}
