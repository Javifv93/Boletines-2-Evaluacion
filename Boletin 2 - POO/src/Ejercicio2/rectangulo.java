package Ejercicio2;

public class rectangulo 
{
	private double altura;
	private double base;
	
	public double getAltura()
	{
		return altura;
	}
	public void setAltura(double altura)
	{
		this.altura=altura;
	}
	public double getBase()
	{
		return base;
	}
	public void setBase(double base)
	{
		this.base=base;
	}
	public rectangulo(double altura,double base)
	{
		this.setAltura(altura);
		this.setBase(base);
	}
	public double areaRectangulo()
	{
		double area=(this.altura*this.base);
		return area;
	}
}
