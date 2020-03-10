/**Crear una interfaz para realizar pilas (IPila). Esta interfaz tendrá que 
 * definir los métodos para:
		apilar: Recibirá un objeto y lo apilará en la pila.

		desapilar: Devolverá el elemento de la cima de la pila y lo retirará
		de la misma.

		cima: Devolverá el elemento de la cima de la pila pero no lo retirará
		de la misma.
		
Apartado 1: Realizar una implementación de IPila mediante ArrayList.Para ello:
	• Deberá crearse una clase PilaArrayList con un campo pila de tipo 
		ArrayList.
	• En el constructor por defecto de ArrayList deberá inicializarse la
		pila vacía (hacer un new de la pila).
	• Deberán implementarse los métodos definidos en la interfaz.
	
Apartado 2: Crear un método main en una clase separada (Ejercicio2) en el que
se realizarán pruebas sobre el funcionamiento de la pila (probar a apilar y 
desapilar distintos elementos y ver que funciona correctamente). Para ello 
crear un objeto que implementa la lista de esta forma:
	IPila impPila= new PilaArrayList();
	
Apartado 3: Realizar una implementación de IPila mediante LinkedList de forma
similar a lo hecho con ArrayList, creando una clase PilaLinkedList y con un
campo pila de tipo LinkedList.

Apartado 4: Modificar la implementación usada en las pruebas del apartado 2
para comprobar que,aunque cambie la implementación usada sigue funcionando
correctamente.
	IPila impPila= new PilaLinkedList();*/

package Ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

import Ejercicio1.Persona;

public class Main 
{
	public static void main (String[] args)
	{
	//Pruebas
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		listaPersonas.add(new Persona("Jose","Martinez Granda",55));
		listaPersonas.add(new Persona("Katy","Ruiz Gomez",24));
		listaPersonas.add(new Persona("Jose Manuel","Blanco Garrido",18));
		listaPersonas.add(new Persona("Jose Luis","Rodriguez Vázquez",72));
		listaPersonas.add(new Persona("Borja","López López",11));
		listaPersonas.add(new Persona("Lourdes","Neira Arias",62));
		listaPersonas.add(new Persona("Josefa","Martinez Seoane",57));
		
		//Probar a a_Pilar
			PilaArrayList pili=new PilaArrayList();
			for(int x=0;x<listaPersonas.size();x++)
			pili.a_Pilar(listaPersonas.get(x));
			
			Iterator<Object> it=pili.pila.iterator();
			while(it.hasNext())
			{
				Object obj=it.next();
				System.out.println(obj.toString());
			}
		
		//Probar a des_a_Pilar
			
		
	}

}
