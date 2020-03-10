/**Crear una clase Automovil con los campos marca, modelo y tipoCombustible.
Apartado1: Definir el tipo de combustible como un enumerado con valores para 
los diferentes tipos de combustible (Diesel, Gasolina, Eléctrico e Híbrido).

Apartado 2: Definir un constructor para el Automovil pasándole como parámetros
valores para los tres campos.

Apartado 3: Crear un procedimiento que reciba un ArrayList de objetos Automovil
y que imprima por pantalla aquellos que son de tipo de combustible Diesel.
La comprobación dentro del procedimiento tendrá que realizarse utilizando el
enumerable, no directamente con el valor.*/

package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main 
{
	public static void main (String[] args)
	{
		ArrayList<Automovil> listaAutomoviles=new ArrayList<Automovil>();
		listaAutomoviles.add(new Automovil("Marca 1","Modelo 1",TipoCombustible.DIESEL));
		listaAutomoviles.add(new Automovil("Marca 2", "Modelo 2", TipoCombustible.GASOLINA));
		listaAutomoviles.add(new Automovil("Marca 3", "Modelo 3", TipoCombustible.DIESEL));
		listaAutomoviles.add(new Automovil("Marca 4", "Modelo 4", TipoCombustible.HIBRIDO));
		listaAutomoviles.add(new Automovil("Marca 5", "Modelo 5", TipoCombustible.ELECTRICO));
		listaAutomoviles.add(new Automovil("Marca 6", "Modelo 6", TipoCombustible.DIESEL));
		
		apartado3(listaAutomoviles);
		
	}
	public static void apartado3(ArrayList<Automovil> lista)
	{
		Iterator<Automovil> it=lista.iterator();
		while(it.hasNext())
		{
			Automovil auto=it.next();
			if(auto.combustible==TipoCombustible.DIESEL)
				System.out.println(auto.toString());
		}
	}
}
