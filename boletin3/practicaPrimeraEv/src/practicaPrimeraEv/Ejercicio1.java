/*Realizar un programa con tres opciones. Realizar la multiplicación, la división entera y el 
 * 	cálculo del resto entre dos números solicitados al usuario. Cada operación (multiplicación, 
 * 	división y cálculo del resto) deberá realizarse mediante el uso de funciones y tan sólo podrán
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
		int multiplicacion;	//Variable que almacena el resultado de la multiplicación.
		int division;		//Variable que almacena el resultado de la division de enteros.
		int resto;			//Variable que almcaena el resultado del cálculo de resto entre enteros.
		boolean compWhile=false;		//Variable booleana de control del While.
		boolean compDoWhile=false;		//Variable booleana de control del DoWhile
		do
		{
			System.out.println("Para seleccionar una operación, pulse el número que se "
					+ "indica a continuación:\r"+"\t 1 - Multiplicación.\r"+"\t 2 - División entera."
							+ "\r\t 3 - Cálculo del resto.");
			int operacionSeleccionada=Util.obtenerNumeroInt();	//Llamada al paquete utilidades.
			while(!compWhile)	/*El bucle esta diseñado para repetirse en caso de que 
			introduzca un número distinto a los dados anteriormente.*/
			{
				switch (operacionSeleccionada)
				{
					case 1:	//Multiplicación
					{
						multiplicacion=Util.multiplicacion();
						System.out.println("El resultado de la multiplicación es "+multiplicacion);
						compWhile=true;
						break;
					}
					case 2:	//División entera
					{
						division=Util.division();
						System.out.println("el resultado de la división de enteros es "+division);
						compWhile=true;
						break;
					}
					case 3:	//Resto
					{
						resto=Util.resto();
						System.out.println("el resto de la división de enteros es "+resto);
						compWhile=true;
						break;
					}
					default:	//Mensaje de error y repetición del bucle.
					{
						System.out.println("El número introducido no es válido.\r"+"Introduzca "
								+ "un número válido");
						operacionSeleccionada=Util.obtenerNumeroInt();	
					}
				}
			}
			compWhile=false;
			while(!compWhile)	//Bucle opcional para introducir otra operación.
			{
				System.out.println("Quiere realizar otra operación?\r\t 1 - Realizar otra operación"
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
					System.out.println("El número introducido no es válido.\r"+"Introduzca "
							+ "un número válido");
				}
			}
			compWhile=false;
		}
		while(!compDoWhile);
	}
}
