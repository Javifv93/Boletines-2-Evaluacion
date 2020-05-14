package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

class Main 
{
	public static void main (String[]args)
	{		
		//Apartado 1:
		//Leemos parcelas.txt y procesamos sus datos hasta hacer un Arraylist de Parcelas
		//{
			String path = "src/ejercicio2/parcelas.txt";	
			String[] texto = leerArchivoDeTxT(path);
			ArrayList<Parcela> listaParcelas = procesarTexto(texto);
		//}
			
		//Apartado 2:
		//Creamos un archivo y guardamos en el los datos de las parcelas.
		//{
			String path2 = "src/ejercicio2/escribirParcelas.txt";
			File nuevoArchivo = new File(path2);
			guardarParcelas(nuevoArchivo, listaParcelas);
			String[] texto2 = leerArchivoDeTxT(path2);
			ArrayList<Parcela> listaParcelas2 = procesarTexto(texto2);
			Iterator<Parcela> it = listaParcelas2.iterator();
			while(it.hasNext())
				{
					it.next().toString();
				}
		//}
		//Bonus track:
		//Procedimiento para borrar el archivo nuevo al finalizar la ejecución
			borrarPruebas(nuevoArchivo);
	}
						////////// Metodos Apartado 1 //////////
	/**Método para leer el archivo de texto y copiar su contenido en un array de Strings */
	static String[] leerArchivoDeTxT(String archivoDeTxT)
	{
		/*Crea un BufferedReader, un FileReader y un File en la misma declaración, y 
		 * utiliza tanto el BufferedReader como el FileReader para leer el archivo y
		 * copiar su contenido en la String texto.*/
		//{
			String texto = "";
			try 
			{
				BufferedReader lectorBuff = new BufferedReader(new FileReader(archivoDeTxT));
				String x;
				while((x = lectorBuff.readLine())!=null)
				{texto = texto.concat(x);}
				lectorBuff.close();
			} 
			catch (FileNotFoundException fnf) {fnf.printStackTrace();}
			catch (IOException ioe) {ioe.printStackTrace();}
		//}
		//Utiliza la función split para separar la String texto en un array de Strings
		//{
			String[] arrayTexto = texto.split(";");
			return arrayTexto;
		//}
	}
	/**Convierte el array de String en una ArrayList de Parcela, invocando a la función
	 * convertirEnParcela y pasandole cada String.
	 * Recibe un objeto Parcela de esa función y lo añade a una ArrayList<Parcela>.*/
	static ArrayList<Parcela> procesarTexto(String[] texto)
	{
		ArrayList<Parcela> listaParcelas = new ArrayList<Parcela>();
		for(String x:texto)
		{
			listaParcelas.add(convertirEnParcela(x));
		}
		return listaParcelas;
	}
	/**Recibe las String recibidas desde procesarTexto, separa sus datos y los introduce
	 * en los campos de un nuevo objeto Parcela.*/
	static Parcela convertirEnParcela(String datosParcela)
	{
		Parcela nuevaParcela;
		String[] textoDividido = datosParcela.split("-");
		//Introduce las String en variables para pasarlas por parámetro al nuevo objeto
		//{
			String parcelaCalle = textoDividido[0];
			int parcelaNumero = Integer.parseInt(textoDividido[1]);
			String parcelaPoblacion = textoDividido[2];
			String parcelaProvincia = textoDividido[3];
			int parcelaMCuadrados = Integer.parseInt(textoDividido[4]);
		//}

		nuevaParcela = new Parcela(		parcelaCalle,
										parcelaNumero,
										parcelaPoblacion,
										parcelaProvincia,
										parcelaMCuadrados
								  );
		return nuevaParcela;
	}
						////////// Metodos Apartado 2 //////////
	/**Recibe el nuevo archivo File y el ArrayList<Parcela>. 
	 * En el for each, coge cada objeto Parcela del ArrayList y escribe sus atributos
	 * añadiendo un guión tras cada uno y un punto y coma al final para respetar el 
	 * formato del texto*/
	static void guardarParcelas(File nuevoArchivo, ArrayList<Parcela> listaParcelas)
	{
		BufferedWriter escritorBuff;
		try
		{
			escritorBuff = new BufferedWriter(new FileWriter(nuevoArchivo));
			for (Parcela x:listaParcelas)
			{
				escritorBuff.write(x.getCalle()+"-"); 
					escritorBuff.newLine();
				escritorBuff.write(x.getNumero()+"-");; 
					escritorBuff.newLine();
				escritorBuff.write(x.getPoblacion()+"-");
					escritorBuff.newLine();
				escritorBuff.write(x.getProvincia()+"-");
					escritorBuff.newLine();
				escritorBuff.write(x.getMCuadrados()+";");;
					escritorBuff.newLine();
				escritorBuff.flush();
			}
			escritorBuff.close();
		}
		catch (FileNotFoundException fnf) {fnf.printStackTrace();}
		catch (IOException ioe) {ioe.printStackTrace();}
	}
	//procedimiento opcional para eliminar el archivo al finalizar la ejecución.
	static void borrarPruebas (File archivo)
	{
		archivo.deleteOnExit();
	}
}
