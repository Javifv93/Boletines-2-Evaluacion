/**Realizar la función recursiva que recibiendo dos números (suponer enteros mayores que 0)
realice el producto de uno por el otro mediante sumas (no utlizando el operador * ni métodos
auxiliares).*/
package ejercicio2;

public class main 
{
	public static void main (String[] args)
	{
		int numA=5;	//Modificar manualmente para hacer pruebas
		int numB=5;	//Modificar manualmente para hacer pruebas
		System.out.println(sumador(numA, numB));
	}
	
	static int sumador (int numA, int numB)
	{
		/* Se reduce el multiplicador (numB) hasta 0 en un bucle formado en el else if, momento en el que entraría por el 
		primer if y inversamente va sumando el multiplicando*/
		int prod = numA;
		if((numB == 0)||(numA ==0))
			prod = 0;
		else if(numB>0)
		{
			numB--;
			prod = numA + sumador(numA, numB);
		}
		return prod;
	}
}
