/**Realizar de forma recursiva la potencia de un número. La cabecera de la función recibirá
como parámetros la base y el exponente como números enteros (mayores o iguales a 0).*/
package ejercicio1;

public class Directa 
{
	public static void main (String[] args)
	{
		int base=2;  //Modificar manualmente para hacer pruebas
		int exp=2;	//Modificar manualmente para hacer pruebas
		System.out.println(potencia(base, exp));
	}
	static int potencia (int base, int exp)
	{				
		/*  La primera vez que se invoca la función, si el exponente es 0 o 1, devolvera el valor asociado sin volver a recurrir 
		 *  a si misma. 
		 *  En caso de que el exponente sea superior a 1, entrará en un bucle en el que se volverá a recurrir a la 
		 *  función "potencia" restando una unidad al exponente hasta que este sea 1, momento en el cual "pot" tomará el valor de 
		 *  la base y recorrera el bucle inversamente multiplicando ese "pot", que sirve de acumulador, por el valor "base" 
		 *  hasta el inicio del mismo.
		 */
		int pot;
		if(exp==0)
			pot=1;
		else if(exp==1)
			pot=base;
		else
		{
			exp--;
			pot=base*potencia(base,exp);  
		}
		return pot;
			
	}
}
