/**Realizar de forma recursiva la potencia de un n�mero. La cabecera de la funci�n recibir�
como par�metros la base y el exponente como n�meros enteros (mayores o iguales a 0).*/
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
		/*  La primera vez que se invoca la funci�n, si el exponente es 0 o 1, devolvera el valor asociado sin volver a recurrir 
		 *  a si misma. 
		 *  En caso de que el exponente sea superior a 1, entrar� en un bucle en el que se volver� a recurrir a la 
		 *  funci�n "potencia" restando una unidad al exponente hasta que este sea 1, momento en el cual "pot" tomar� el valor de 
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
