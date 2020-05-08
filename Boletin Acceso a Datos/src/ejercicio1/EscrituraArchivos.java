package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivos 
{
	/**Este método tiene dos partes diferenciadas: 
	 * La primera, similar a leerArchivos,
	 * utiliza leerNombre para comprobar la existencia del archivo y luego muestra por pantalla
	 * su contenido.
	 * La segunda, añade un menú en el que se da la opción de sobreescribir el archivo, 
	 * de forma que se borrará lo anteriormente escrito y se guardará el nuevo texto, o
	 * escribir a continuación, de forma que se concatenarán ambos textos separados con un 
	 * espacio.
	 * Tanto una opción como la otra puede ser usada para escribir por primera vez, teniendo
	 * en cuenta que en el caso de escribir a continuación comenzará con un espacio.
	 * El método sobrescribir puede usarse para simplemente borrar el contenido pulsando intro
	 * en vez de introduciendo un nuevo texto, pero tampoco quise controlarlo por que entiendo
	 * que en este caso, estamos dando libertad al usuario para que escriba lo que quiera en
	 * el archivo, no teniendo pues sentido limitar el número de carácteres mínimos en tal caso.*/
	public static void escribirArchivo(String directorio)
	{
		System.out.println("Introduce el nombre del archivo a modificar");
		String nombre = InteraccionesUsuario.leerNombre(directorio);
		boolean comprobador = false;
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
				leer.close();
				System.out.println("\n");
				comprobador = true;
			}
			catch(FileNotFoundException ArchivoNoEncontrado)
			{
				System.out.println("Archivo no encontrado");
				System.out.println("Deseas introducir otro archivo distinto?\n"
						+ "y/n");
				boolean siOno = InteraccionesUsuario.YesOrNot();
				if (siOno == true)
				{escribirArchivo(directorio);}
			}
			catch(IOException ErrorLectura) 
			{System.out.println("Error de lectura");}
			if (comprobador = true)
			{
				System.out.println("Quieres escribir a continuación o sobreescribirlo?"
						+ "Pulse el número asociado a la operación que desee hacer:\n\t"
						+ "1 - Escribir a continuación\n\t"
						+ "2 - Sobreescribir\n\t");
				int opcion = InteraccionesUsuario.opcionesEscritura();
				switch (opcion)
				{
					case 2:
					{
						try
						{
							FileWriter escribir = new FileWriter(nombre);
							String entrada = InteraccionesUsuario.entradaEscritura();
							escribir.write(entrada);
							escribir.close();
							System.out.println("El archivo ha sido sobreescrito con éxito\n");
						}
						catch(IOException ioe) 
						{System.out.println("Error");ioe.printStackTrace();}
						finally{break;}
					}
					case 1:
					{
						try
						{
							String entrada = InteraccionesUsuario.entradaEscritura();
							BufferedReader lector = new BufferedReader(new FileReader(nombre));
							String linea=""; String textoAntiguo="";
							while((linea = lector.readLine())!=null)
							{
								textoAntiguo = textoAntiguo.concat(linea);
							}
							FileWriter escribir = new FileWriter(nombre);
							escribir.write(textoAntiguo.concat(" "+entrada));
							lector.close();
							escribir.close();
							System.out.println("El texto ha sido añadido con éxito\n");
						}
						catch(IOException ioe) 
						{System.out.println("Error");ioe.printStackTrace();}
						finally{break;}
					}
				}
			}
		}
	}
}
