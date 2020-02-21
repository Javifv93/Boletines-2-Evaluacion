package Ejercicio4;

public class Usuario 
{
	private String nombre;
	private String psswrd;
	
	public Usuario(String nombreIN, String psswrdIN)
	{
		nombre=nombreIN;
		psswrd=psswrdIN;
	}
	public void setNombre(String nombreX)
	{
		nombre=nombreX;
	}
	public String getNombre()
	{
		return nombre;
	}public void setPsswrd(String psswrdX)
	{
		psswrd=psswrdX;
	}
	public String getPsswrd()
	{
		return psswrd;
	}
	
}
