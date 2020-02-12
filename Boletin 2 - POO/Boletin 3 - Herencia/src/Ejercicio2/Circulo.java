package Ejercicio2;

public class Circulo extends Figura
{
											//CAMPOS
	private double radio;
	private final double PI=Math.PI;
											//CONSTRUCTORES
	public Circulo() {}
	public Circulo(double radio)
	{
		this.setRadio(radio);
	}
											//GETTERS Y SETTERS
	public double getRadio()
	{
		return radio;
	}
	public void setRadio(double radio)
	{
		this.radio=radio;
	}
											//METODOS SOBRESCRITOS
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
		return "\tradio: "+this.radio;
	}
											//METODOS INTERFAZ
	public void calcularPerimetro()
	{
		double perimetro=(PI*radio)*2;
		setPerimetro(perimetro);
	}
	public void imprimirDatosFigura()
	{
		System.out.println(this.toString());
		this.imprimirArea();
		this.imprimirPerimetro();
	}
}
