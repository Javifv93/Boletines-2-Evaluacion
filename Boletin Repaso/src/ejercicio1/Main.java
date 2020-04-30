/** Realizar un método que recibiendo una cadena de texto devuelva un entero con la suma de
los valores numéricos de esa cadena.
Por ejemplo, si recibe la cadena "as15j7@21" deberá devolver el valor de 1+5+7+2+1, es decir 16.*/
package ejercicio1;

public class Main 
{
	public static void main (String[] args)
	{
		String cadena="1ntr0duc3 t3xt0 d3 pru3b4";
		int suma=contador(cadena);
		System.out.println(suma);
	}
	static int contador (String cadena)
	{
		int suma=0;
		for(int x=0; x<cadena.length(); x++)
		{
			Character c=cadena.charAt(x);
			if ((c>=48)&&(c<=57)) //ASCII
			{
				int conversor = c.getNumericValue(c);
				suma=suma+conversor;
			}
		}
		return suma;
	}
	
	
}
