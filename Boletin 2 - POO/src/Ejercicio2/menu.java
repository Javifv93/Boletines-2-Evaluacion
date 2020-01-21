package Ejercicio2;

public class menu 
{
	public static void main (String[] args)
	{
		boolean iterador=false;
		while(!iterador)
		{
			System.out.println("Para calcular el área de las siguientes figuras, "
					+ "introduce el número asociado a continuación:\r\r\t"
					+ "1 - Área del triángulo\r\t"
					+ "2 - Área del cuadrado\r\t"
					+ "3 - Área del rectángulo\r\t"
					+ "4 - Área del rombo\r\r"
					+ "Para salir, pulsa 0");
			int opcionElegida=util.obtenerNumeroMenu();
			switch(opcionElegida)
			{
				case 0:
					iterador=true;
					break;
				case 1:		//Triángulo
				{
					System.out.println("Introduce la base del triángulo");
					double base=util.obtenerNumeroPositivoDouble();
					System.out.println("Introduce la altura del triángulo");
					double altura=util.obtenerNumeroPositivoDouble();
					triangulo nuevoTriangulo=new triangulo(altura, base);
					double area=nuevoTriangulo.areaTriangulo();
					System.out.println("El área del triángulo es "+area+"\r");
					break;
				}
				case 2:		//Cuadrado
				{
					System.out.println("Introduce el lado del cuadrado");
					double lado=util.obtenerNumeroPositivoDouble();
					cuadrado nuevoCuadrado=new cuadrado(lado);
					double area=nuevoCuadrado.areaCuadrado();
					System.out.println("El área del cuadrado es "+area+"\r");
					break;
				}
				case 3:		//Rectángulo
				{
					System.out.println("Introduce la base del rectángulo");
					double base=util.obtenerNumeroPositivoDouble();
					System.out.println("Introduce la altura del rectángulo");
					double altura=util.obtenerNumeroPositivoDouble();
					rectangulo nuevoRectangulo=new rectangulo(altura, base);
					double area=nuevoRectangulo.areaRectangulo();
					System.out.println("El área del rectángulo es "+area+"\r");
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
					System.out.println("El área del rombo es "+area+"\r");
					break;
				}
			}
		}
	}
	
}
