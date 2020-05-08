package ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivos 
{
	/**M�todo y clase para la lectura de archivos de texto.
	 * Es similar al m�todo de crearArchivoNuevo: Recibe la carpeta sobre la que se 
	 * trabaja como String por par�metro, la manda al m�todo leerNombre de 
	 * InteraccionesUsuario, donde se realiza la comprobaci�n de su existencia, y luego
	 * se imprime por pantalla en el while utilizando un FileReader. Igual que en el m�todo
	 * de creaci�n, la excepci�n de que el archivo no se haya encontrado est� controlada
	 * pero no deber�a saltar nunca, ya que para eso lo pasamos por el m�todo leerNombre.*/
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
