package Ejercicio1;

import java.time.LocalDate;
import java.util.Arrays;

public class main 
{
		//Apartado 1
	
	public static void main (String[] args)			
	{
		Persona p1=new Persona();
		p1.setNombre("Jose");
		p1.setApellidos("Rodriguez Mata");
		p1.setFechaNacimiento(LocalDate.parse("1965-01-15"));
		p1.setEstatura(165);
		p1.setEdad(Persona.calcularEdad(p1.getFechaNacimiento()));
		
		Persona p2=new Persona();
		p2.setNombre("María");
		p2.setApellidos("Sánchez Gómez");
		p2.setFechaNacimiento(LocalDate.parse("1980-11-26"));
		p2.setEstatura(170);
		p2.setEdad(Persona.calcularEdad(p1.getFechaNacimiento()));
		
		Persona p3=new Persona();
		p3.setNombre("Alejandro");
		p3.setApellidos("Gómez Gómez");
		p3.setFechaNacimiento(LocalDate.parse("2001-10-01"));
		p3.setEstatura(190);
		p3.setEdad(Persona.calcularEdad(p1.getFechaNacimiento()));
		
		Persona p4=new Persona();
		p4.setNombre("Jose Manuel");
		p4.setApellidos("Pérez Pons");
		p4.setFechaNacimiento(LocalDate.parse("2010-04-01"));
		p4.setEstatura(127);
		p4.setEdad(Persona.calcularEdad(p1.getFechaNacimiento()));
		
		//Apartado 3
		
		Persona p5=new Persona("Lorena","Remeseiro Neira",LocalDate.parse("2000-06-12"));
		p5.setEstatura(160);
		p5.setFechaNacimiento(LocalDate.parse("2000-06-12"));
		
		
		Persona p6=new Persona("Patricia","Seoane Alvarez",LocalDate.parse("1976-08-23"));
		p6.setEstatura(175);
		p6.setFechaNacimiento(LocalDate.parse("1976-08-23"));
		
		int[] arrayPersonas= {p1.getEdad(),p2.getEdad(),p3.getEdad(),p4.getEdad(),p5.getEdad(),p6.getEdad()};
		Persona.obtenerMasMayor(arrayPersonas);
		
		//PARA PROBAR
		p6.mostrarDatos();
	}
}
