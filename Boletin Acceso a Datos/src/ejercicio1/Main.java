/**En este ejercicio probareis la lectura y escritura de texto en un fichero (Utilizad
FileReader y FileWriter). Para ello debeis:
1. Crear mediante c�digo un directorio de guardado del fichero (por ejemplo en vuestro escritorio)
y que tenga la siguiente estructura: C:\...\Desktop\Boletin2\Ejercicio1\ejercicio1.txt
Debeis crear esa estructura por c�digo, no hacerlo vosotros directamente y luego acceder por
c�digo (Mirad la parte de manejo de ficheros y directorios).
2. En ese directorio, deber�is crear un fichero de nombre ejercicio1.txt en el que escribais de texto
"Prueba de escritura en fichero".
3. La tercera parte ser� leer el contenido de ese fichero y escribirlo por pantalla.
Ten�is que hacer uso de los conocimientos de las dos evaluaciones pasadas para la estructura del
c�digo. No lo hagais todo en el main sino que deb�is usar procedimientos auxiliares (uno para crear el
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
		String directorio = directorioArchivos();	//Selecci�n de directorio
		boolean fin = false;
		while (fin == false)	//Bucle que se repite hasta elegir Salir en primerMenu
		fin = primerMenu(directorio); 
		borrarDirectorio(directorio);
	}
	/**Este m�todo presenta el men� principal del programa, al que volveremos recurrentemente
	 * al finalizar cada una de las acciones propuestas en el.
	 * La �nica manera de salir de este sin interrumpir el programa externamente ser�a seleccionar
	 * el case 0 - Salir en este men�, tras lo cual se borrar� la carpeta creada con los 
	 * archivos creados dentro durante el funcionamiento de este.
	 * Cada una de las dem�s opciones del switch lleva a las distintas clases del programa,
	 * sirviendo este men� como un intermediario y conectando las distintas funciones.*/
	static boolean primerMenu(String directorio) throws FileNotFoundException, IOException
	{
		boolean fin = false;
		System.out.println("Bienvenido al sistema de prueba de L/E ejercicio1\n"
				+ "Pulse el n�mero asociado a la operaci�n que desee hacer:\n\t"
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
	/**Este m�todo devuelve una String con el directorio de la carpeta sobre la que crearemos
	 * y modificaremos archivos durante la ejecuci�n del programa.*/
	static String directorioArchivos()
	{
		System.out.println("Para continuar, se requiere elegir un directorio que pueda ser "
				+ "objeto de creaci�n y/o modificaci�n de archivos");
		String directorio = InteraccionesUsuario.crearDirectorio();
		return directorio;
	}
	/** El siguiente m�todo est�ba pensado para que al salir del programa se borraran
	 * las carpetas y archivos creados.
	 * Lo intente implementar para no tener que andar borrar a mano las doscientasmil carpetas
	 * que hice durante las pruebas, pero por alguna razon que no alcanzo a comprender no
	 * va. Probe de distintas formas, hasta creando archivos temporales, pero no encontr�
	 * manera de arreglarlo y ya perd� un par de tardes solo con esto.
	 * As� que aqu� lo dejo, debugeando lo que alcanz� a comprender es que no debe de tener
	 * los permisos suficientes para borrarlos o algo as�, ya que llegado a cierto punto
	 * da false en una movida de security noseque.
	 * Me hubiera gustado acabarlo, pero no puedo perder m�s tiempo con esto.
	 * Como an�cdota, si las carpetas estan vacias si que las borra.
	 */
	static void borrarDirectorio(String directorio)
	{
		File carpeta = new File(directorio);
		File[] archivosCreados = carpeta.listFiles();
		for (int x=0;x<archivosCreados.length;x++)
		{
			archivosCreados[x].delete(); //El problema est� aqu� en el delete, que no deja borrarlo.
		}
		carpeta.delete();
	}
}