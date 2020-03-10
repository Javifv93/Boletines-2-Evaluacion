/**Apartado 1: Crear una función que pasado por parámetro un ArrayList y un caracter, devuelva un
nuevo ArrayList con las Personas cuyo nombre comienza por la letra indicada.*/

package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Ap1 
{
	public ArrayList apartado1(ArrayList lista, char caracter)
	{
		Iterator<Persona> it=lista.iterator();
		ArrayList<Persona> nuevaLista=new ArrayList<Persona>();
		while(it.hasNext())
		{
			Persona pers=it.next();
			String nombre=pers.getNombre();
			Character inicial=nombre.charAt(0);
			if(inicial.equals('J'))
				nuevaLista.add(pers);
		}
		return nuevaLista;
	}
}
