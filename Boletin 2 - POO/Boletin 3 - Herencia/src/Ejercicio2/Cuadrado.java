package Ejercicio2;

public class Cuadrado extends Rectangulo 
{
										//CONSTRUCTORES
	public Cuadrado(double lado)
	{
		super(lado, lado);
	}
										//METODOS SOBRESCRITOS
	@Override
	public String toString()
	{
		this.calcularArea();
		return "\tlado: "+this.getBase();
	}
}
