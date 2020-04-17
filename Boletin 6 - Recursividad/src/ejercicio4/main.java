/**Realizar un método de forma recursiva calcule si un número es primo o no (solo es
divisible por si mismo y por la unidad).*/

package ejercicio4;

public class main 
{
	public static void main (String[] args)
	{
		int num = 2;	//Modificar manualmente para hacer pruebas
		boolean primo = esPrimo(num);
		System.out.println(num + " es primo? "+primo);
	}
	private static boolean esPrimo (int num)
	{
		/*Esta primera función es una función intermedia entre el main
		 * y la recursiva, simplemente por que tal y como lo plantee en un
		 * principio necesitaba una variable a la que ir restandole uno
		 * en cada vuelta (div) y calculando el resto contra num, y a mi
		 * modo de ver, o pasaba num y div directamente desde el main, 
		 * o lo hacia de esta manera*/
		int div = num;
		boolean primo = false;
		if ((num == 1)||(num ==0))
			primo = false;
		else if (bucle(num, div) == true)
		{
			primo = true;
		}
		return primo;
	}
	private static boolean bucle (int num, int div)
	{				
		/*La función recursiva es esta, que se repite en bucle
		y en caso de que num sea divisible por otro número aparte del 1
		dará false.
		Empiezo haciendo la division por div-1 directamente por que todos
		los números son divisibles por si mismos.*/
		boolean primo = false;
		if (num%(div-1) != 0)
		{
			primo = bucle(num, div-1);
		}
		else if (div == 2)
		{
			primo = true;
		}
		return primo;
	}
}
