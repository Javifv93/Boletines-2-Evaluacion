/*Realizar un programa con tres opciones. Realizar la multiplicaci�n, la divisi�n entera y el 
 * 	c�lculo del resto entre dos n�meros solicitados al usuario. Cada operaci�n (multiplicaci�n, 
 * 	divisi�n y c�lculo del resto) deber� realizarse mediante el uso de funciones y tan s�lo podr�n
 * 	realizarse las operaciones mediante sumas o restas (no usar los operadores * ni / ni tampoco
 * 	funciones de Math).*/

package practicaPrimeraEv;
import java.util.Scanner;
import Utilidades.Util;		//Importa el paquete de utilidades que creamos.

public class Ejercicio1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int multiplicacion;	//Variable que almacena el resultado de la multiplicaci�n.
		int division;		//Variable que almacena el resultado de la division de enteros.
		int resto;			//Variable que almcaena el resultado del c�lculo de resto entre enteros.
		boolean compWhile=false;		//Variable booleana de control del While.
		boolean compDoWhile=false;		//Variable booleana de control del DoWhile
		do
		{
			System.out.println("Para seleccionar una operaci�n, pulse el n�mero que se "
					+ "indica a continuaci�n:\r"+"\t 1 - Multiplicaci�n.\r"+"\t 2 - Divisi�n entera."
							+ "\r\t 3 - C�lculo del resto.");
			int operacionSeleccionada=Util.obtenerNumeroInt();	//Llamada al paquete utilidades.
			while(!compWhile)	/*El bucle esta dise�ado para repetirse en caso de que 
			introduzca un n�mero distinto a los dados anteriormente.*/
			{
				switch (operacionSeleccionada)
				{
					case 1:	//Multiplicaci�n
					{
						multiplicacion=Util.multiplicacion();
						System.out.println("El resultado de la multiplicaci�n es "+multiplicacion);
						compWhile=true;
						break;
					}
					case 2:	//Divisi�n entera
					{
						division=Util.division();
						System.out.println("el resultado de la divisi�n de enteros es "+division);
						compWhile=true;
						break;
					}
					case 3:	//Resto
					{
						resto=Util.resto();
						System.out.println("el resto de la divisi�n de enteros es "+resto);
						compWhile=true;
						break;
					}
					default:	//Mensaje de error y repetici�n del bucle.
					{
						System.out.println("El n�mero introducido no es v�lido.\r"+"Introduzca "
								+ "un n�mero v�lido");
						operacionSeleccionada=Util.obtenerNumeroInt();	
					}
				}
			}
			compWhile=false;
			while(!compWhile)	//Bucle opcional para introducir otra operaci�n.
			{
				System.out.println("Quiere realizar otra operaci�n?\r\t 1 - Realizar otra operaci�n"
						+ "\r\t 0 - Salir");
				operacionSeleccionada=Util.obtenerNumeroInt();
				if(operacionSeleccionada==1)
					compWhile=true;
				else if(operacionSeleccionada==0)
				{
					System.out.println("FIN");
					compWhile=true;
					compDoWhile=true;
				}
				else
				{
					System.out.println("El n�mero introducido no es v�lido.\r"+"Introduzca "
							+ "un n�mero v�lido");
				}
			}
			compWhile=false;
		}
		while(!compDoWhile);
	}
}
