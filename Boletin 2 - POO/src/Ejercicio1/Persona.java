package Ejercicio1;

import java.time.LocalDate;
import java.util.Arrays;

import Ejercicio1.Persona;

public class Persona
{//gguk
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private int estatura;
	private int edad;
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getApellidos()
	{
		return apellidos;
	}
	public void setApellidos(String apellidos)
	{
		this.apellidos=apellidos;
	}
	public LocalDate getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento)
	{
		this.fechaNacimiento=fechaNacimiento;
	}
	public int getEstatura()
	{
		return estatura;
	}
	public void setEstatura(int estatura)
	{
		this.estatura=estatura;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	//Apartado 2
	
	public void mostrarDatos()		
	{
			System.out.println("Nombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
			System.out.println("Estatura: "+estatura+"cm");
			System.out.println("Edad: "+edad);
	}
	public static int calcularEdad(LocalDate fechaNacimiento)
	{
		/*Importo el objeto p y paso sus valores (year,month,day) a variables int*/
		int year=fechaNacimiento.getYear();
		int month=(fechaNacimiento.getMonthValue())-1;	 
		int day=fechaNacimiento.getDayOfMonth();
		
		/*Obtengo la fecha de hoy*/
		LocalDate FechaHoy=LocalDate.now();
		
		/*Lo mismo que en el bloque anterior pero con la fecha de hoy*/
		int yearNow=FechaHoy.getYear();
		int monthNow=(FechaHoy.getMonthValue())-1;
		int dayNow=FechaHoy.getDayOfMonth();
		
		/*Voy restando una fecha a otra*/
		LocalDate edad=FechaHoy.minusDays(day);
		edad=edad.minusMonths(month);
		edad=edad.minusYears(year);
		
		return edad.getYear();
	}
	
	//Apartado 3
	
	public Persona() 		
	{}
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento)	//Apartado3
	{
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEdad(calcularEdad(fechaNacimiento));
	}
	
	//Apartado 4
	
	public static void obtenerMasMayor(int[] arrayPersonas)
	{
		Arrays.sort(arrayPersonas);
		int masMayor=arrayPersonas.length-1; masMayor=arrayPersonas[masMayor];
		
		System.out.println("El mas mayor tiene "+masMayor);
	}
}
