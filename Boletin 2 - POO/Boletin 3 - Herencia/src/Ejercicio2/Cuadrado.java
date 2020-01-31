package Ejercicio2;

public class Cuadrado extends Rectangulo 
{
	public Cuadrado(double lado)
	{
		super(lado, lado);
	}
	@Override
	public String toString()
	{
		this.calcularArea();
		return "CUADRADO:\r\tlado: "+this.getBase()+"\r\tarea: "+this.getArea();
	}
}
