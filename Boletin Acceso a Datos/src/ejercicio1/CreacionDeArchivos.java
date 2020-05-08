package ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

import java.io.File;

import java.io.FileNotFoundException;

public class CreacionDeArchivos 
{
	/**M�todo y clase para la creaci�n de archivos de texto.
	 * Se trabajar� sobre la carpeta directorio introducida al inicio del programa,
	 * creando archivos de texto en base a un nombre que nosotros eligiremos. No es
	 * necesario a�adir la extensi�n .txt al nombre del archivo, ya que esto se contempla
	 * m�s adelante en distintos m�todos de la clase InteraccionesUsuarios, pero tambi�n
	 * se contempla la opci�n de que el usuario a�ada manualmente esta extensi�n.*/
	public static void crearArchivoNuevo(String directorio)
	{
		System.out.println("Introduce el nombre del archivo a crear");
		String nombre = InteraccionesUsuario.introducirNombre(directorio);
		if (nombre != null)
		{
			try
			{
			FileWriter escribir = new FileWriter(nombre);
				System.out.println("Archivo creado");
			}
			catch(IOException error) 
			{
				/*En mis pruebas, nunca lleg� a hacer saltar esta excepci�n, ya que
				 * el control de que el nombre sea correcto lo hago en el m�todo 
				 * introducirNombre de InteraccionesUsuario, as� que en principio
				 * este catch no deber�a saltar nunca. En caso de que lo haga, hace una
				 * llamada recursiva a crearArchivoNuevo para introducir otro nombre.*/
				System.out.println("Error. Nombre no v�lido"
						+ "\nDeseas introducir otro nombre distinto?\n"
						+ "y/n");
				boolean siOno = InteraccionesUsuario.YesOrNot();
				if (siOno == true)
				{crearArchivoNuevo(directorio);}
			}
		}
	}
}
