package Ejercicio1;

public class Conductor 
{
	public String dni;
	public String name;
	
	public Conductor () {}
	public Conductor (String dni, String name)
	{
		this.dni=dni;
		this.name=name;
	}
	public String getDni()
	{
		return dni;
	}
	public String getName()
	{
		return name;
	}
	public void setDni(String dni)
	{
		this.dni=dni;
	}
	public void setName (String name)
	{
		this.name=name;
	}
	
	@Override
	public String toString() 
	{
		String print="\t- DNI: "+this.dni;
		print=print+"\r\t- Nombre: "+this.name;
		return print;
	}
}