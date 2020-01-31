package Ejercicio2;

public class Triangulo extends Figura
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
	public Triangulo() {}
	public Triangulo(double altura,double base)
	{
		this.setAltura(altura);
		this.setBase(base);
	}
	@Override
	public void calcularArea() 
	{
		double area=(altura*base)/2;
		setArea(area);
	}
	@Override
	public String toString()
	{
		this.calcularArea();
		return "TRIANGULO:\r\tbase: "+this.base+"\r\taltura: "+this.altura+"\r\tarea: "+this.getArea();
	}
}
