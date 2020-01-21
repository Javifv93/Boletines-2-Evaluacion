package Ejercicio2;

public class triangulo 
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
	public triangulo(double altura,double base)
	{
		this.setAltura(altura);
		this.setBase(base);
	}
	public double areaTriangulo()
	{
		double area=(this.altura*this.base)/2;
		return area;
	}
}
