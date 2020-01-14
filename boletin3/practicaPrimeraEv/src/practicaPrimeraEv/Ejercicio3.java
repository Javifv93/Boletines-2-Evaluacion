/*: Realizar un programa que nos dé las siguientes opciones:
● Pasar de decimal a octal
● Pasar de octal a decimal
● Pasar de decimal a hexadecimal
● pasar de hexadecimal a decimal
● pasar de decimal a binario
● pasar de binario a decimal
En cada una de las opciones se pedirá el valor a convertir (numérico entero) y se mostrará
la solución.*/

package practicaPrimeraEv;
import Utilidades.Util;

public class Ejercicio3 
{
	public static void main(String[] args)
	{
		long binario;			//binario y decimal estan puestos en long por la longitud de las conversiones a binario
		int octal;
		long decimal;
		String hexadecimal;
		boolean compWhile=false;		//Variable booleana de control del While del menú principal
		boolean compDoWhile=false;		//Variable booleana de control del Do-While que vuelve al primer menú
		
		do
		{
			System.out.println("Para seleccionar una operación de cambio de bases, introduce el número correspondiente:\r"
					+ "\t 1 - Pasar de decimal a octal\r\t 2 - Pasar de octal a decimal\r\t 3 - Pasar de"
					+ " decimal a hexadecimal\r\t 4 - Pasar de hexadecimal a decimal\r\t 5 - Pasar de "
					+ "decimal a binario\r\t 6 - Pasar de binario a decimal");
			int operacionSeleccionada=Util.obtenerNumeroInt(); 			//Llamada al paquete utilidades.
			while(!compWhile)		/*El bucle esta diseñado para repetirse en caso de que introduzca un
				número distinto a los dados anteriormente.*/
			{
				switch (operacionSeleccionada)
				{
					case 1:	
					{				//Pasar de decimal a octal
						octal=Util.pasarDecimalOctal();
						System.out.println("Su equivalente en base octal es "+octal);
						compWhile=true;
						break;
					}
					case 2:	
					{				//Pasar de octal a decimal
						decimal=Util.pasarOctalDecimal();
						System.out.println("Su equivalente en base decimal es "+decimal);
						compWhile=true;
						break;
					}
					case 3:	
					{				//Pasar de decimal a hexadecimal
						hexadecimal=Util.pasarDecimalHexadecimal();
						System.out.println("Su equivalente en hexadecimal es "+hexadecimal);
						compWhile=true;
						break;
					}
					case 4:	
					{				//Pasar de Hexadecimal a decimal
						decimal=Util.pasarHexadecimalDecimal();
						System.out.println("Su equivalente en decimal es "+decimal);
						compWhile=true;
						break;
					}
					case 5:	
					{				//Pasar de decimal a binario
						binario=Util.pasarDecimalBinario();
						System.out.println("Su equivalente en binario es "+binario);
						compWhile=true;
						break;
					}
					case 6:
					{				//Pasar de binario a decimal
						decimal=Util.pasarBinarioDecimal();
						System.out.println("Su equivalente en decimal es "+decimal);
						compWhile=true;
						break;
					}
					default:	//Mensaje de error y repetición del bucle.
					{
						System.out.println("El número introducido no es válido.\r"+"Introduce "
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
					compWhile=true;
					compDoWhile = true;
				}
				else
				{
					System.out.println("El número introducido no es válido.\r"+"Introduce "
							+ "un número válido");
				}
			}
			compWhile=false;
		}
		while(!compDoWhile);
		System.out.println("FIN");
	}
}
// ACTUALIZAR MENSAJE DE ERROR EN EL CASE4 EN CASO DE NUMEROS NEGATIVOS O SIMBOLOS
// ACTUALIZAR MENSAJE DE ERROR EN EL CASE6 EN CASO DE NUMEROS NEGATIVOS O SIMBOLOS
