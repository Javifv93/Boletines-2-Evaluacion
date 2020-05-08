/**En este ejercicio probareis la lectura y escritura de texto en un fichero (Utilizad
FileReader y FileWriter). Para ello debeis:
1. Crear mediante código un directorio de guardado del fichero (por ejemplo en vuestro escritorio)
y que tenga la siguiente estructura: C:\...\Desktop\Boletin2\Ejercicio1\ejercicio1.txt
Debeis crear esa estructura por código, no hacerlo vosotros directamente y luego acceder por
código (Mirad la parte de manejo de ficheros y directorios).
2. En ese directorio, deberéis crear un fichero de nombre ejercicio1.txt en el que escribais de texto
"Prueba de escritura en fichero".
3. La tercera parte será leer el contenido de ese fichero y escribirlo por pantalla.
Tenéis que hacer uso de los conocimientos de las dos evaluaciones pasadas para la estructura del
código. No lo hagais todo en el main sino que debéis usar procedimientos auxiliares (uno para crear el
fichero, uno para leer, uno para escribir,...).*/

package ejercicio1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class Main 
{
	public static void main (String[]args) throws IOException
	{
		String directorio = directorioArchivos();	//Selección de directorio
		boolean fin = false;
		while (fin == false)	//Bucle que se repite hasta elegir Salir en primerMenu
		fin = primerMenu(directorio); 
		borrarDirectorio(directorio);
	}
	/**Este método presenta el menú principal del programa, al que volveremos recurrentemente
	 * al finalizar cada una de las acciones propuestas en el.
	 * La única manera de salir de este sin interrumpir el programa externamente sería seleccionar
	 * el case 0 - Salir en este menú, tras lo cual se borrará la carpeta creada con los 
	 * archivos creados dentro durante el funcionamiento de este.
	 * Cada una de las demás opciones del switch lleva a las distintas clases del programa,
	 * sirviendo este menú como un intermediario y conectando las distintas funciones.*/
	static boolean primerMenu(String directorio) throws FileNotFoundException, IOException
	{
		boolean fin = false;
		System.out.println("Bienvenido al sistema de prueba de L/E ejercicio1\n"
				+ "Pulse el número asociado a la operación que desee hacer:\n\t"
				+ "1 - Crear un archivo de texto\n\t"
				+ "2 - Escribir en un archivo de texto\n\t"
				+ "3 - Leer un archivo de texto\n\t"
				+ "0 - Salir");
		int opcion = InteraccionesUsuario.opcionesPrimerMenu();
		switch (opcion)
		{
			case 1:{CreacionDeArchivos.crearArchivoNuevo(directorio);break;}
			case 2:{EscrituraArchivos.escribirArchivo(directorio);break;}
			case 3:{LecturaDeArchivos.leerArchivo(directorio);break;}
			case 0:{fin = true;break;}
		}
		return fin;
	}
	/**Este método devuelve una String con el directorio de la carpeta sobre la que crearemos
	 * y modificaremos archivos durante la ejecución del programa.*/
	static String directorioArchivos()
	{
		System.out.println("Para continuar, se requiere elegir un directorio que pueda ser "
				+ "objeto de creación y/o modificación de archivos");
		String directorio = InteraccionesUsuario.crearDirectorio();
		return directorio;
	}
	/** El siguiente método está pensado para que al salir del programa se borren
	 * las carpetas y archivos creados. En caso de que no se quieran borrar, hay que
	 * eliminar o "comentar" la linea correspondiente del main.
	 */
	static void borrarDirectorio(String directorio)
	{
		File carpeta = new File(directorio);
		File[] archivosCreados = carpeta.listFiles();
		for (int x=0;x<archivosCreados.length;x++)
		{
			archivosCreados[x].delete(); //El problema está aquí en el delete, que no deja borrarlo.
		}
		carpeta.delete();
	}
}
