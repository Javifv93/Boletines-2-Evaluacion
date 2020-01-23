package Ejercicio1;

public class Camion extends Vehiculo
{
	private int altura;
	private Remolque remolque;
	
	@Override
	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("\t- La altura es: "+this.altura);
	}
	public void setAltura(int altura)
	{
		this.altura=altura;
	}
	public Remolque getRemolque()
	{
		return remolque;
	}
	public void setRemolque(Remolque remolque)
	{
		this.remolque=remolque;
	}
	public Camion (String matricula, String tipo, int velocidadMaxima, Remolque remolque)
	{
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
		this.remolque=remolque;
	}
	//Apartado5.3
	/*public Camion (String matricula, String tipo, int vMaxima, int altura)
	{
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(vMaxima);
		this.setAltura(altura);
	}*/
	public Camion (String matricula, String tipo, int vMaxima, int altura)
	{
		super(matricula, tipo, vMaxima);
		this.altura=altura;
	}
}
