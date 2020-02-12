package Ejercicio2;
import Util.Util;

public class Main 
{
	public static void main (String[] args)
	{
		/*boolean iterador=false;
		while(!iterador)
		{
			System.out.println("Elige que figura quieres crear:\r\t1 - Tri�ngulo\r\t"
					+ "2 - Cuadrado\r\t3 - C�rculo\r\t0 - Salir");
			int respuesta=Util.obtenerNumeroPositivoInt();
			switch(respuesta)
			{
				case 1:
				{
					Triangulo nuevoTriangulo=UtilEj2.crearTriangulo();
					System.out.println("El �rea del c�rculo es "+nuevoTriangulo.getArea());
					break;
				}
				case 2:
				{
					Cuadrado nuevoCuadrado=UtilEj2.crearCuadrado();
					System.out.println("El �rea del cuadrado es "+nuevoCuadrado.getArea());
					break;
				}
				case 3:
				{
					Circulo nuevoCirculo=UtilEj2.crearCirculo();
					System.out.println("El �rea del circulo es "+nuevoCirculo.getArea());
					break;
				}	
				case 0:
				{
					iterador=true;
					break;
				}
				default:
				{
					System.out.println("Elige una opci�n establecida");
					break;
				}
			}
		}		*/
		Figura[] arrayFiguras= 
			{
				new Triangulo(3,2),
				new Cuadrado(5),
				new Triangulo(15,3),
				new Triangulo(8,7),
				new Rectangulo(9,5),
				new Rectangulo(15,6),
				new Circulo(5),
				new Circulo(9),
				new Rectangulo(8,3),
				new Cuadrado(9)
			};
		
		UtilEj2.ordenarArrayFiguras(arrayFiguras);
		

	}
	public static void imprimirArrayTriangulo(Triangulo[] arrayTriangulos)
	{
		int y=0;
		for (Triangulo x:arrayTriangulos)
		{
			if(x!=null)
			{
				y++;
				System.out.println("\rTRIANGULO "+y+"\r\t");
				x.imprimirDatosFigura();
			}
		}
	}
	public static void imprimirArrayCuadrado(Cuadrado[] arrayCuadrados)
	{
		int y=0;
		for (Cuadrado x:arrayCuadrados)
		{
			if(x!=null)
			{
				y++;
				System.out.println("\rCUADRADO "+y+"\t");
				x.imprimirDatosFigura();
			}
		}
	}
	public static void imprimirArrayCirculo(Circulo[] arrayCirculos)
	{
		int y=0;
		for (Circulo x:arrayCirculos)
		{
			if(x!=null)
			{
				y++;
				System.out.println("\rCIRCULO "+y+"\r\t");
				x.imprimirDatosFigura();
			}
		}
	}
	public static void imprimirArrayRectangulo(Rectangulo[] arrayRectangulos)
	{
		int y=0;
		for (Rectangulo x:arrayRectangulos)
		{
			if(x!=null)
			{
				y++;
				System.out.println("\rRECTANGULO "+y+"\t");
				x.imprimirDatosFigura();
			}
		}
	}
	
}
