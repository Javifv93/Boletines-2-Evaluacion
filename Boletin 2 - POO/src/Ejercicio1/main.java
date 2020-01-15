package Ejercicio1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Arrays;

public class main 
{
		//Apartado 1
	
	public static void main (String[] args)			
	{
		Persona p1=new Persona();
		p1.nombre="Jose";
		p1.apellidos="Rodriguez Mata";
		p1.fechaNacimiento=LocalDate.parse("1965-01-15");
		p1.estatura=165;
		p1.edad=Persona.calcularEdad(p1.fechaNacimiento);
		
		Persona p2=new Persona();
		p2.nombre="María";
		p2.apellidos="Sánchez Gómez";
		p2.fechaNacimiento=LocalDate.parse("1980-11-26");
		p2.estatura=170;
		p2.edad=Persona.calcularEdad(p2.fechaNacimiento);
		
		Persona p3=new Persona();
		p3.nombre="Alejandro";
		p3.apellidos="Gómez Gómez";
		p3.fechaNacimiento=LocalDate.parse("2001-10-01");
		p3.estatura=190;
		p3.edad=Persona.calcularEdad(p3.fechaNacimiento);
		
		Persona p4=new Persona();
		p4.nombre="Jose Manuel";
		p4.apellidos="Pérez Pons";
		p4.fechaNacimiento=LocalDate.parse("2010-04-01");
		p4.estatura=127;
		p4.edad=Persona.calcularEdad(p4.fechaNacimiento);
		
		//Apartado 3
		
		Persona p5=new Persona("Lorena","Remeseiro Neira",LocalDate.parse("2000-06-12"));
		p5.estatura=160;
		p5.fechaNacimiento=LocalDate.parse("2000-06-12");
		
		
		Persona p6=new Persona("Patricia","Seoane Alvarez",LocalDate.of(1976, 8, 23));
		p6.estatura=175;
		p6.fechaNacimiento=LocalDate.parse("1976-08-23");
		
		int[] arrayPersonas= {p1.edad,p2.edad,p3.edad,p4.edad,p5.edad,p6.edad};
		Persona.obtenerMasMayor(arrayPersonas);
		
		//PARA PROBAR
		
		Persona.mostrarDatos(p5);
	}
}
