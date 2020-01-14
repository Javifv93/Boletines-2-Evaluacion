/*Realizar un programa que, mediante un men�, nos ofrezca calcular el �rea de las siguientes figuras:
 * 			1 - �rea del triangulo: (base*altura)/2
 * 			2 - �rea del cuadrado: (lado*lado)
 * 			3 - �rea del rect�ngulo: (base*altura)
 * 			4 - �rea del rombo: (diagonal mayor*diagonal menor)/2
 * 			5 - �rea del trapecio: (base mayor+base menor)*altura/2
 * 			6 - �rea del c�rculo: Pi * radio^2
 *			7 - �rea de la esfera: 4* Pi * radio^2 */

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
			System.out.println("Para seleccionar una operaci�n, introduce el n�mero correspondiente:\r"
					+"\t 1 - �rea del triangulo\r\t 2 - �rea del cuadrado\r\t 3 - �rea del "
					+ "rectangulo\r\t 4 - �rea del rombo\r\t 5 - �rea del trapecio\r\t 6 - �rea del"
					+ " c�rculo\r\t 7 - �rea de la esfera");
			int operacionSeleccionada=Util.obtenerNumeroInt();	
			while(!compWhile)	/*El bucle esta dise�ado para repetirse en caso de que introduzca un
				n�mero distinto a los dados anteriormente.*/
			{
				switch (operacionSeleccionada)
				{
					case 1:	
					{
						areaTriangulo=Util.areaTriangulo();
						System.out.println("El �rea del triangulo es "+areaTriangulo);
						compWhile=true;
						break;
					}
					case 2:	
					{
						areaCuadrado=Util.areaCuadrado();
						System.out.println("El �rea del cuadrado es "+areaCuadrado);
						compWhile=true;
						break;
					}
					case 3:	
					{
						areaRectangulo=Util.areaRectangulo();
						System.out.println("El �rea del rectangulo es "+areaRectangulo);
						compWhile=true;
						break;
					}
					case 4:	
					{
						areaRombo=Util.areaRombo();
						System.out.println("El �rea del rombo es "+areaRombo);
						compWhile=true;
						break;
					}
					case 5:	
					{
						areaTrapecio=Util.areaTrapecio();
						System.out.println("El �rea del trapecio es "+areaTrapecio);
						compWhile=true;
						break;
					}
					case 6:
					{
						areaCirculo=Util.areaCirculo();
						System.out.println("El �rea del circulo es "+areaCirculo);
						compWhile=true;
						break;					
					}
					case 7:
					{
						areaEsfera=Util.areaEsfera();
						System.out.println("El �rea de la esfera es "+areaEsfera);
						compWhile=true;
						break;
					}
					default:	//Mensaje de error y repetici�n del bucle.
					{
						System.out.println("El n�mero introducido no es v�lido.\r"+"Introduce "
								+ "un n�mero v�lido");
						operacionSeleccionada=Util.obtenerNumeroInt();	//Llamada al paquete utilidades.
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
					compWhile=true;
					compDoWhile=true;
				}
				else
				{
					System.out.println("El n�mero introducido no es v�lido.\r"+"Introduce "
							+ "un n�mero v�lido");
				}
			}
			compWhile=false;
		}
		while(!compDoWhile);
		System.out.println("FIN");
	}
}
