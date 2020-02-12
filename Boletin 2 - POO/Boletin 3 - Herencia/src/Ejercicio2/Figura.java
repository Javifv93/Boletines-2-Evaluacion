package Ejercicio2;

public abstract class Figura implements ICalculosFigura, IImpresionFigura
{
											//CAMPOS
	private double area;
	private double perimetro;
											//GETTERS Y SETTERS
	protected double getArea()
	{
		return area;
	}
	protected void setArea(double area)
	{
		this.area=area;
	}
	protected double getPerimetro()
	{
		return perimetro;
	}
	protected void setPerimetro(double perimetro)
	{
		this.perimetro=perimetro;
	}
											//METODOS INTERFAZ
	public void imprimirArea()
	{
		System.out.println("\tarea: "+area);
	}
	public void imprimirPerimetro()
	{
		this.calcularPerimetro();
		System.out.println("\tperimetro: "+perimetro);
	}
	
}

