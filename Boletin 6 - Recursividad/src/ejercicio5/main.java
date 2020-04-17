/**Realizar un método recursivo que determine si un número entero pasado por 
 * parámetro es par o no (sin usar operadores distintos a la resta - 
 * (no podéis usar %, ni /, ni métodos auxiliares)*/
package ejercicio5;

public class main 
{
	public static void main (String[] args)
	{
		int num = 1;	//Modificar manualmente para hacer pruebas
		boolean esPar = bucle(num);
		System.out.println(num + " es par? "+ esPar);
	}
	private static boolean bucle(int num)
	{
		/*Se resta 2 en bucle hasta que llega a 0 o dar negativo, en 
		 * caso del 0 da true y si se pasa false.*/
		boolean esPar = false;
		if (num == 0)
		{
			esPar = true;
		}
		else if (num > 0)
		{
			esPar = bucle(num - 2);
		}
		return esPar;
		
	}
}
