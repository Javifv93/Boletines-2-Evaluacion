package Ejercicio1;

public class Persona 
{
	private String nombre;
	private String apellidos;
	private int edad;
	
	/**Constructor*/
	public Persona(String nombre, String apellidos, int edad)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}//Persona
	
	/**Getter Nombre*/
	public String getNombre() 
	{
		return nombre;
	}//getNombre
	
	/**Getter Apellidos*/
	public String getApellidos() 
	{
		return apellidos;
	}//getApellidos
	
	/**Getter Edad*/
	public int getEdad() 
	{
		return edad;
	}//getEdad
	/**Apartado 3: Crear en Persona una sobreescritura de toString() para 
	 * imprimir los datos de la Persona.*/
	@Override
	public String toString()
	{
		String str="\tNombre: "+this.getNombre()+" "+
										this.getApellidos()+"\r\tEdad: "+
										this.getEdad()+"\r\r";
		return str;
	}
}//class
