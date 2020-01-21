package Ejercicio2;

public class menu 
{
	public static void main (String[] args)
	{
		boolean iterador=false;
		while(!iterador)
		{
			System.out.println("Para calcular el �rea de las siguientes figuras, "
					+ "introduce el n�mero asociado a continuaci�n:\r\r\t"
					+ "1 - �rea del tri�ngulo\r\t"
					+ "2 - �rea del cuadrado\r\t"
					+ "3 - �rea del rect�ngulo\r\t"
					+ "4 - �rea del rombo\r\r"
					+ "Para salir, pulsa 0");
			int opcionElegida=util.obtenerNumeroMenu();
			switch(opcionElegida)
			{
				case 0:
					iterador=true;
					break;
				case 1:		//Tri�ngulo
				{
					System.out.println("Introduce la base del tri�ngulo");
					double base=util.obtenerNumeroPositivoDouble();
					System.out.println("Introduce la altura del tri�ngulo");
					double altura=util.obtenerNumeroPositivoDouble();
					triangulo nuevoTriangulo=new triangulo(altura, base);
					double area=nuevoTriangulo.areaTriangulo();
					System.out.println("El �rea del tri�ngulo es "+area+"\r");
					break;
				}
				case 2:		//Cuadrado
				{
					System.out.println("Introduce el lado del cuadrado");
					double lado=util.obtenerNumeroPositivoDouble();
					cuadrado nuevoCuadrado=new cuadrado(lado);
					double area=nuevoCuadrado.areaCuadrado();
					System.out.println("El �rea del cuadrado es "+area+"\r");
					break;
				}
				case 3:		//Rect�ngulo
				{
					System.out.println("Introduce la base del rect�ngulo");
					double base=util.obtenerNumeroPositivoDouble();
					System.out.println("Introduce la altura del rect�ngulo");
					double altura=util.obtenerNumeroPositivoDouble();
					rectangulo nuevoRectangulo=new rectangulo(altura, base);
					double area=nuevoRectangulo.areaRectangulo();
					System.out.println("El �rea del rect�ngulo es "+area+"\r");
					break;
				}
				case 4:		//Rombo
				{
					System.out.println("Introduce la diagonal mayor del rombo");
					double diagonalMayor=util.obtenerNumeroPositivoDouble();
					System.out.println("Introduce la diagonal menor del rombo");
					double diagonalMenor=util.obtenerNumeroPositivoDouble();
					rombo nuevoRombo=new rombo(diagonalMayor, diagonalMenor);
					double area=nuevoRombo.areaRombo();
					System.out.println("El �rea del rombo es "+area+"\r");
					break;
				}
			}
		}
	}
	
}
