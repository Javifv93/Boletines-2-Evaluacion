package Ejercicio2;

public abstract class Figura 
{
	private double area;
	
	protected abstract void calcularArea();
	
	protected void imprimirArea()
	{
		System.out.println(area);
	}
	protected double getArea()
	{
		return area;
	}
	protected void setArea(double area)
	{
		this.area=area;
	}
}

