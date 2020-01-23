package Ejercicio1;

public class Remolque 
{
	public String matricula;
	public int longitud;
	
	public Remolque ()
	{}
	public String getMatricula()
	{
		return matricula;
	}
	public int getLongitud()
	{
		return longitud;
	}
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	public void setLongitud(int longitud)
	{
		this.longitud=longitud;
	}
	@Override
	public String toString() 
	{
		String print="\t- Matricula: "+this.matricula;
		print=print+"\r\t- Longitud: "+this.longitud;
		return print;
	}
}
