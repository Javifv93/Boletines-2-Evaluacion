package Ejercicio2;

public class Triangulo extends Figura
{
											//CAMPOS
	private double altura;
	private double base;
											//CONSTRUCTORES
	public Triangulo() {}
	public Triangulo(double altura,double base)
	{
		this.setAltura(altura);
		this.setBase(base);
	}
											//GETTERS Y SETTERS
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
											//METODOS SOBRESCRITOS
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
		return "\tbase: "+this.base+"\r\taltura: "+this.altura;
	}
											//METODOS INTERFAZ
	public void calcularPerimetro()
	{
		double perimetro=base*3;
		setPerimetro(perimetro);
	}
	public void imprimirDatosFigura()
	{
		System.out.println(this.toString());
		this.imprimirArea();
		this.imprimirPerimetro();
	}
}
