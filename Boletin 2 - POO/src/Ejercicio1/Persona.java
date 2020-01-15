package Ejercicio1;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;

import Ejercicio1.Persona;
import Ejercicio1.util;

public class Persona
{
	public String nombre;
	public String apellidos;
	public LocalDate fechaNacimiento=LocalDate.now();
	public int estatura;
	public int edad;
	
	//Apartado 2
	
	public static void mostrarDatos(Persona p1)		
	{
			System.out.println("Nombre: "+p1.nombre);
			System.out.println("Apellidos: "+p1.apellidos);
			System.out.println("Fecha de Nacimiento: "+p1.fechaNacimiento);
			System.out.println("Estatura: "+p1.estatura+"cm");
			System.out.println("Edad: "+p1.edad);
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
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=calcularEdad(fechaNacimiento);
	}
	
	//Apartado 4
	
	public static void obtenerMasMayor(int[] arrayPersonas)
	{
		Arrays.sort(arrayPersonas);
		int masMayor=arrayPersonas.length-1; masMayor=arrayPersonas[masMayor];
		
		System.out.println("El mas mayor tiene "+masMayor);
	}
}
