package ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivos 
{
	/**Método y clase para la lectura de archivos de texto.
	 * Es similar al método de crearArchivoNuevo: Recibe la carpeta sobre la que se 
	 * trabaja como String por parámetro, la manda al método leerNombre de 
	 * InteraccionesUsuario, donde se realiza la comprobación de su existencia, y luego
	 * se imprime por pantalla en el while utilizando un FileReader. Igual que en el método
	 * de creación, la excepción de que el archivo no se haya encontrado está controlada
	 * pero no debería saltar nunca, ya que para eso lo pasamos por el método leerNombre.*/
	public static void leerArchivo(String directorio) 
	{
		System.out.println("Introduce el directorio del archivo a leer");
		String nombre = InteraccionesUsuario.leerNombre(directorio);
		if(nombre!=null)
		{
			try
			{
				System.out.println("El contenido del archivo es el siguiente:\n");
				FileReader leer = new FileReader(nombre);
				int bytFR;
				while((bytFR=leer.read())!=-1)
				{
					System.out.print((char)bytFR);
				}
				System.out.println("\n");
			}
			catch(FileNotFoundException ArchivoNoEncontrado)
			{
				System.out.println("Archivo no encontrado");
				System.out.println("Deseas introducir otro archivo distinto?\n"
						+ "y/n");
				boolean siOno = InteraccionesUsuario.YesOrNot();
				if (siOno == true)
				{leerArchivo(directorio);}
			}
			catch(IOException ErrorLectura) 
			{System.out.println("Error de lectura");}
		}
	}
}
