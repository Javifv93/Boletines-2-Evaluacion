package Ejercicio2;

public class Rectangulo extends Figura
{
											//CAMPOS
	private double base;
	private double altura;
	
											//CONSTRUCTORES
	public Rectangulo() {}
	public Rectangulo(double altura,double base)
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
		double area=base*altura;
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
		double perimetro=(base+altura)*2;
		setPerimetro(perimetro);
	}
	public void imprimirDatosFigura()
	{
		System.out.println(this.toString());
		this.imprimirArea();
		this.imprimirPerimetro();
	}
}
