package Ejercicio2;

public class cuadrado 
{
	private double lado;
	
	public double getLado()
	{
		return lado;
	}
	public void setLado(double lado)
	{
		this.lado=lado;
	}
	
	public cuadrado(double lado)
	{
		this.setLado(lado);
	}
	public double areaCuadrado()
	{
		double area=(this.lado*this.lado);
		return area;
	}
}
