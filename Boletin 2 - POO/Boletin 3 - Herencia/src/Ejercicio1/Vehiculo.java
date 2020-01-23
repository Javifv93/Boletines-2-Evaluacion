package Ejercicio1;

public class Vehiculo 
{
	protected String matricula;
	protected String tipo;
	protected int velocidadMaxima;
	protected Conductor conductor;
	
	public String getMatricula()
	{
		return matricula;
	}
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)
	{
		this.tipo=tipo;
	}
	public int getVelocidadMaxima()
	{
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima)
	{
		this.velocidadMaxima=velocidadMaxima;
	}
	public Conductor getConductor()
	{
		return conductor;
	}
	public void setConductor (Conductor conductor)
	{
		this.conductor=conductor;
	}
	public void mostrarDatos()
	{
		
		System.out.println("\rPara este vehiculo :\r\t"
				+"- Matricula: "+this.matricula
				+"\r\t- Tipo: "+this.tipo
				+"\r\t- Velocidad máxima: "+this.velocidadMaxima+"km/h");
	}
	public Vehiculo() 
	{}
	public Vehiculo(String matricula, String tipo, int vMaxima)
	{
		this.matricula=matricula;
		this.tipo=tipo;
		this.velocidadMaxima=vMaxima;
	}
}

