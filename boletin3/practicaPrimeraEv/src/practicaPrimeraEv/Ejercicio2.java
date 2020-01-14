/*Realizar un programa que, mediante un menú, nos ofrezca calcular el área de las siguientes figuras:
 * 			1 - Área del triangulo: (base*altura)/2
 * 			2 - Área del cuadrado: (lado*lado)
 * 			3 - Área del rectángulo: (base*altura)
 * 			4 - Área del rombo: (diagonal mayor*diagonal menor)/2
 * 			5 - Área del trapecio: (base mayor+base menor)*altura/2
 * 			6 - Área del círculo: Pi * radio^2
 *			7 - Área de la esfera: 4* Pi * radio^2 */

package practicaPrimeraEv;

import Utilidades.Util;
import java.util.Scanner;

public class Ejercicio2 
{
	public static void main(String[] args)
	{
		double areaTriangulo;
		double areaCuadrado;
		double areaRectangulo;
		double areaRombo;
		double areaTrapecio;
		double areaCirculo;
		double areaEsfera;
		boolean compWhile=false;		//Variable booleana de control del While.
		boolean compDoWhile=false;		//Variable booleana de control del DoWhile
		
		do
		{
			System.out.println("Para seleccionar una operación, introduce el número correspondiente:\r"
					+"\t 1 - Área del triangulo\r\t 2 - Área del cuadrado\r\t 3 - Área del "
					+ "rectangulo\r\t 4 - Área del rombo\r\t 5 - Área del trapecio\r\t 6 - Área del"
					+ " círculo\r\t 7 - Área de la esfera");
			int operacionSeleccionada=Util.obtenerNumeroInt();	
			while(!compWhile)	/*El bucle esta diseñado para repetirse en caso de que introduzca un
				número distinto a los dados anteriormente.*/
			{
				switch (operacionSeleccionada)
				{
					case 1:	
					{
						areaTriangulo=Util.areaTriangulo();
						System.out.println("El área del triangulo es "+areaTriangulo);
						compWhile=true;
						break;
					}
					case 2:	
					{
						areaCuadrado=Util.areaCuadrado();
						System.out.println("El área del cuadrado es "+areaCuadrado);
						compWhile=true;
						break;
					}
					case 3:	
					{
						areaRectangulo=Util.areaRectangulo();
						System.out.println("El área del rectangulo es "+areaRectangulo);
						compWhile=true;
						break;
					}
					case 4:	
					{
						areaRombo=Util.areaRombo();
						System.out.println("El área del rombo es "+areaRombo);
						compWhile=true;
						break;
					}
					case 5:	
					{
						areaTrapecio=Util.areaTrapecio();
						System.out.println("El área del trapecio es "+areaTrapecio);
						compWhile=true;
						break;
					}
					case 6:
					{
						areaCirculo=Util.areaCirculo();
						System.out.println("El área del circulo es "+areaCirculo);
						compWhile=true;
						break;					
					}
					case 7:
					{
						areaEsfera=Util.areaEsfera();
						System.out.println("El área de la esfera es "+areaEsfera);
						compWhile=true;
						break;
					}
					default:	//Mensaje de error y repetición del bucle.
					{
						System.out.println("El número introducido no es válido.\r"+"Introduce "
								+ "un número válido");
						operacionSeleccionada=Util.obtenerNumeroInt();	//Llamada al paquete utilidades.
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
					compDoWhile=true;
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
