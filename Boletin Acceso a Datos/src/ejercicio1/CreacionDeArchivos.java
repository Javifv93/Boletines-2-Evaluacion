package ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

import java.io.File;

import java.io.FileNotFoundException;

public class CreacionDeArchivos 
{
	/**Método y clase para la creación de archivos de texto.
	 * Se trabajará sobre la carpeta directorio introducida al inicio del programa,
	 * creando archivos de texto en base a un nombre que nosotros eligiremos. No es
	 * necesario añadir la extensión .txt al nombre del archivo, ya que esto se contempla
	 * más adelante en distintos métodos de la clase InteraccionesUsuarios, pero también
	 * se contempla la opción de que el usuario añada manualmente esta extensión.*/
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
				/*En mis pruebas, nunca llegé a hacer saltar esta excepción, ya que
				 * el control de que el nombre sea correcto lo hago en el método 
				 * introducirNombre de InteraccionesUsuario, así que en principio
				 * este catch no debería saltar nunca. En caso de que lo haga, hace una
				 * llamada recursiva a crearArchivoNuevo para introducir otro nombre.*/
				System.out.println("Error. Nombre no válido"
						+ "\nDeseas introducir otro nombre distinto?\n"
						+ "y/n");
				boolean siOno = InteraccionesUsuario.YesOrNot();
				if (siOno == true)
				{crearArchivoNuevo(directorio);}
			}
		}
	}
}
