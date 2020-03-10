/**Apartado 2: Crear una función que pasado un ArrayList y una edad por 
 * parámetros devuelva el mismo ArrayList sin los objetos de tipo Persona
 * que superan esa edad.*/
package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Ap2 
{
	public ArrayList apartado2(ArrayList<Persona> lista, int edad)
	{
		Iterator<Persona> it=lista.iterator();
		ArrayList<Persona> nuevaLista=new ArrayList<Persona>();
		while(it.hasNext())
		{
			Persona pers=it.next();
			int whileEdad=pers.getEdad();
			if(whileEdad<edad)
				nuevaLista.add(pers);
		}
		return nuevaLista;
	}
}
