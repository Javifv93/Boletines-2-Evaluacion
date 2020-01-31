package Ejercicio2;

public class Rectangulo extends Figura
{
	private double base;
	private double altura;
	
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
	public Rectangulo() {}
	public Rectangulo(double altura,double base)
	{
		this.setAltura(altura);
		this.setBase(base);
	}
	@Override
	public void calcularArea() 
	{
		double area=base*altura;
		setArea(area);
	}
	@Override
	public String toString()
	{
		this.calcularArea();
		return "Rectangulo:\r\tbase: "+this.base+"\r\taltura: "+this.altura+"\r\tarea: "+this.getArea();
	}
}
