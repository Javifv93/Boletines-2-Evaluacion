package ejercicio1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InteraccionesUsuario 
{
	/**Booleano para los menús de si o no. Excluye cualquier otra respuesta distinta
	 * a 'y' o 'n' o tenga un tamaño distinto a 1. Devuelve true por los "y" y false
	 * por los "n". */
	public static boolean YesOrNot()
	{
		boolean eleccion = false;
		boolean comprobador = false;
		Scanner sc = new Scanner(System.in);
		while (comprobador == false)
		{
			try
			{
				String r = sc.nextLine();
				Character respuesta = r.charAt(0);
				respuesta = respuesta.toLowerCase(respuesta);
				if ((r.length()==1)
						&&
					((respuesta.charValue()=='y')||(respuesta.charValue()=='n')))
				{
					if (respuesta.charValue()=='y')
					{
						eleccion = true;
						comprobador = true;
					}
					else
					{
						eleccion = false;
						comprobador = true;
					}
				}
				else
				{
					System.out.println("Ha introducido un carácter erroneo\nResponda a la siguiente pregunta con "
							+ "\n| 'y' = Confirmar |\n\to\n| 'n' = Cancelar |");
				}
			}
			catch(StringIndexOutOfBoundsException errorDimension)
			{
				System.out.println("Ha introducido una respuesta erronea.\n"
						+ "Responda a la siguiente pregunta con \n| 'y' = Confirmar |\n"
						+ "\to\n| 'n' = Cancelar |");
				sc.reset();
			}
		}
		return eleccion;
	}
	/**Método para controlar la entrada por consola y limitarla al número de respuestas
	 * previsto. Misma estructura que YesOrNot*/
	public static int opcionesPrimerMenu() 
	{
		int opcion=0;
		boolean control = false;
		while (control ==false)
		{
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt())
			{
				opcion = sc.nextInt();
				if ((opcion!=0)
						&&
					(opcion!=1)
						&&
					(opcion!=2)
						&&
					(opcion!=3))
				System.out.println("Error, Introduce un número válido");
				else
					control = true;

			}
			else
				System.out.println("Error, Introduce un número válido");
		}
		return opcion;
	}
	/**Método que intenta crear un objeto FileReader en base al directorio indicado, 
	 * dando positivo en caso de que sea posible y por tanto que ese archivo exista,
	 * o negativo en caso de que no.*/
	public static boolean existeNombre(String nombre) throws FileNotFoundException, IOException
	{
		boolean existe = false;
		try
		{
			FileReader lector = new FileReader(nombre);
			existe = true; lector.close();
		}
		catch(FileNotFoundException ArchivoNoEncontrado)
		{
			existe = false;
		}
		finally {return existe;}
	}
	/**Método que recibe una String con el directorio de la carpeta. Primero se pasa
	 * por tres filtros: En el primero se pide un nombre para el archivo y se comprueba
	 * que tenga un tamaño mayor que 0, por lo tanto que no se pulse intro directamente.
	 * En el segundo, en caso de que la dirección NO acabe con "\" se le añade, con la 
	 * intención de evitar que se concatene directamente el nombre del archivo al de la
	 * carpeta.
	 * El tercer filtro le añade la extensión .txt para que sea un archivo de texto en 
	 * caso de que el usuario no se la haya puesto previamente.
	 * Tras estos filtros, se pasa por el método existeNombre para comprobar que no existe
	 * ningún archivo con ese nombre, y en caso de que así sea se devuelve por String
	 * la dirección de la carpeta con el nombre añadido a CreacionDeArchivos para que
	 * lo cree.*/
	public static String introducirNombre(String directorio)
	{
		Scanner sc = new Scanner(System.in);
		String nombre;
		String preNombre="";
		boolean tamanhOK = false;
		while(tamanhOK == false)
		{
			String scnnr = sc.nextLine();
			if(scnnr.length()<1){System.out.println("Introduce mínimo un carácter");}
			else {tamanhOK=true;preNombre = scnnr;}
		}
		if(directorio.endsWith("\\"))
			nombre = directorio.concat(preNombre);
		else
			nombre = directorio.concat("\\"+preNombre);
		if(nombre.endsWith(".txt")==false)
			nombre = nombre.concat(".txt");
		try
		{
			boolean existe = existeNombre(nombre);
			if (existe == true)
			{
				System.out.println("Este archivo ya existe."
						+ "\nDeseas introducir otro archivo distinto?\n"
						+ "y/n");
				boolean siOno = YesOrNot();
				if (siOno == true)
				{System.out.println("Introduce el nombre del archivo");
					nombre = introducirNombre(directorio);}
				else
					nombre = null;
			}
		}
		finally {return nombre;}
	}
	/**Método parecido a introducirNombre, ya que los dos se basan en concatenar a la
	 * String del directorio un nombre introducido por scanner pasandolo por diversos
	 * filtros, siendo el más importante existeNombre. La mayor diferencia, es que en 
	 * introducirNombre se busca que existeNombre sea false y en leerNombre sea true.*/
	public static String leerNombre(String directorio)
	{
		Scanner sc = new Scanner(System.in);
		String nombre;
		if(directorio.endsWith("\\"))
			nombre = directorio.concat(sc.nextLine());
		else
			nombre = directorio.concat("\\"+sc.nextLine());
		if(nombre.endsWith(".txt")==false)
			nombre = nombre.concat(".txt");
		try
		{
			boolean existe = existeNombre(nombre);
			if (existe == false)
			{
				System.out.println("Este archivo no existe."
						+ "\nDeseas introducir otro archivo distinto?\n"
						+ "y/n");
				boolean siOno = YesOrNot();
				if (siOno == true)
				{System.out.println("Introduce el nombre del archivo a leer");
					nombre = leerNombre(directorio);}
				else
					nombre = null;
			}
		}
		finally {return nombre;}
	}
	/**Método estilo YesOrNot o opcionesPrimerMenu para limitar la entrada de datos
	 * del usuario a los dos números requeridos.*/
	public static int opcionesEscritura() 
	{
		int opcion=0;
		boolean control = false;
		while (control == false)
		{
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt())
			{
				opcion = sc.nextInt();
				if ((opcion!=1)
						&&
					(opcion!=2))
				System.out.println("Error, Introduce un número válido");
				else
					control = true;
			}
			else
				System.out.println("Error, Introduce un número válido");
		}
		return opcion;
	}
	/**Pide un texto al usuario y lo pasa por medio del Scanner a una String*/
	public static String entradaEscritura()
	{
		System.out.println("Introduce el texto a escribir");
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		return entrada;
	}
	/**Este método sirve para crear una carpeta nueva sobre la que trabajaremos más
	 * adelante, de forma que luego, concatenando la dirección de esta carpeta al nombre
	 * de los archivos creados podamos seleccionarlos por medio del menú de forma más
	 * simple, sin tener que introducir manualmente la ubicación completa de estos.
	 * En este método utilizo el tipo File, ya que lo necesitaba para acceder al método
	 * mkdir para crear un directorio.*/
	public static String crearDirectorio()
	{
		boolean valido = false;
		String directorio="";
		while (valido == false)
		{
			try
			{
				System.out.println("Introduce un directorio");
				Scanner sc = new Scanner(System.in);
				String path = sc.nextLine();
				File nuevoArchivo = new File(path);
				if(nuevoArchivo.mkdir())
				{
					System.out.println("Directorio creado"); 
					valido = true; directorio = path;
				}
				else 
				{System.out.println("Directorio ya existente");}
			}
			catch(NullPointerException errorEnCreacionDeFile)
			{
				System.out.println("Error de argumentación en la creación de File.");
				errorEnCreacionDeFile.printStackTrace();
			}
			catch (SecurityException errorMkdir) 
			{
				System.out.println("Error de seguridad");
				errorMkdir.printStackTrace();
			}
		}
		return directorio;
	}
}

