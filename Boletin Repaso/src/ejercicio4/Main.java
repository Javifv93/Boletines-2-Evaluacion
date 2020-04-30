/** Realizar un m�todo que reciba un valor num�rico y un array de enteros.
Dependiendo del valor num�rico que se reciba deber� realizar:
a) Si es un 1 deber� realizar la suma de todos los valores del array e imprimirlo 
por pantalla.
b) Si es un 2 deber� realizar la resta de todos los valores e imprimirlo por 
pantalla.
c) Si es un 3 deber� realizar la multiplicaci�n de todos los valores e 
imprimirlo por pantalla.
d) Si es cualquier otro valor deber� mostrar un mensaje de error (valor no definido).
Realizar la comprobaci�n de los valores mediante un switch.*/
package ejercicio4;

public class Main 
{
	public static void main (String[]args)
	{
		int num = 1;								//Modificar los valores de estos
		int[] array = {1,2,3,4,5,6,7,8,9};			//parametros para hacer pruebas
		metodo(num, array);
	}
	static void metodo (int num, int[] array)
	{
		switch (num)
		{
			case 1:
				int suma = 0;
				for (int x=0;x<array.length;x++)
					suma = suma + array[x];
				System.out.println("La suma de los valores del array es: " + suma);
				break;
			case 2:
				int resta = 0;
				for (int x=0;x<array.length;x++)
					resta = resta - array[x];
				System.out.println("La resta de los valores del array es: " + resta);
				break;
			case 3:
				int multi = 1;
				for (int x=0;x<array.length;x++)
					multi = multi * array[x];
				System.out.println("La multiplicaci�n de los valores del array es: " + multi);
				break;
			default:
				System.out.println("Error. Valor no definido");
				break;
		}
	}
}
