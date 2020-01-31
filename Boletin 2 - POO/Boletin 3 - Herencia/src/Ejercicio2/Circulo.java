package Ejercicio2;

public class Circulo extends Figura
{
	private double radio;
	private final double PI=Math.PI;
	
	public double getRadio()
	{
		return radio;
	}
	public void setRadio(double radio)
	{
		this.radio=radio;
	}
	public Circulo() {}
	public Circulo(double radio)
	{
		this.setRadio(radio);
	}
	@Override
	public void calcularArea()
	{
		double area=PI*Math.pow(radio, 2);
		setArea(area);
	}
	@Override
	public String toString()
	{
		this.calcularArea();
		return "CIRCULO:\r\tradio: "+this.radio+"\r\tarea: "+this.getArea();
	}
}
