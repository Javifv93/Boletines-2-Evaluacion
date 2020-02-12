package Ejercicio2;
import Util.Util;

public class UtilEj2 
{
	public static Cuadrado crearCuadrado()
	{
		System.out.println("Introduce el lado del cuadrado");
		double lado=Util.obtenerNumeroPositivoDouble();
		Cuadrado nuevoCuadrado=new Cuadrado(lado);
		nuevoCuadrado.calcularArea();
		return nuevoCuadrado;
	}
	public static Triangulo crearTriangulo()
	{
		System.out.println("Introduce la base del triángulo");
		double base=Util.obtenerNumeroPositivoDouble();
		System.out.println("Introduce la altura del triángulo");
		double altura=Util.obtenerNumeroPositivoDouble();
		Triangulo nuevoTriangulo=new Triangulo(altura, base);
		nuevoTriangulo.calcularArea();
		return nuevoTriangulo;
	}
	public static Circulo crearCirculo()
	{
		System.out.println("Introduce el radio del círculo");
		double radio=Util.obtenerNumeroPositivoDouble();
		Circulo nuevoCirculo=new Circulo(radio);
		nuevoCirculo.calcularArea();
		return nuevoCirculo;
	}
	public static void ordenarArrayFiguras(Figura[] arrayFiguras)
	{
		Triangulo[] arrayTriangulos=new Triangulo[arrayFiguras.length];
		int cTriangulos=0;
		Cuadrado[] arrayCuadrados=new Cuadrado[arrayFiguras.length];
		int cCuadrados=0;
		Circulo[] arrayCirculos=new Circulo[arrayFiguras.length];
		int cCirculos=0;
		Rectangulo[] arrayRectangulos=new Rectangulo[arrayFiguras.length];
		int cRectangulos=0;
		
		for(Figura x:arrayFiguras)
		{
			int controlSwitch=0;
			if(x instanceof Triangulo){controlSwitch=1;}
			if(x instanceof Cuadrado){controlSwitch=2;}
			else if(x instanceof Rectangulo){controlSwitch=4;}
			if(x instanceof Circulo){controlSwitch=3;}
			
			switch(controlSwitch)
			{
				case 1:
				{
					arrayTriangulos[cTriangulos]=(Triangulo) x;
					cTriangulos++;
					break;
				}
				case 2:
				{
					arrayCuadrados[cCuadrados]=(Cuadrado) x;
					cCuadrados++;
					break;
				}
				case 3:
				{
					arrayCirculos[cCirculos]=(Circulo) x;
					cCirculos++;
					break;
				}
				case 4:
				{
					arrayRectangulos[cRectangulos]=(Rectangulo) x;
					cRectangulos++;
					break;
				}
			}
		}
		Main.imprimirArrayTriangulo(arrayTriangulos);
		Main.imprimirArrayCuadrado(arrayCuadrados);
		Main.imprimirArrayCirculo(arrayCirculos);
		Main.imprimirArrayRectangulo(arrayRectangulos);
	}
}
