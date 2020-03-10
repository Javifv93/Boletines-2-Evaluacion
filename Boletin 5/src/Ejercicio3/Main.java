/**Crear una interfaz para realizar pilas (IPila). Esta interfaz tendr� que 
 * definir los m�todos para:
		apilar: Recibir� un objeto y lo apilar� en la pila.

		desapilar: Devolver� el elemento de la cima de la pila y lo retirar�
		de la misma.

		cima: Devolver� el elemento de la cima de la pila pero no lo retirar�
		de la misma.
		
Apartado 1: Realizar una implementaci�n de IPila mediante ArrayList.Para ello:
	� Deber� crearse una clase PilaArrayList con un campo pila de tipo 
		ArrayList.
	� En el constructor por defecto de ArrayList deber� inicializarse la
		pila vac�a (hacer un new de la pila).
	� Deber�n implementarse los m�todos definidos en la interfaz.
	
Apartado 2: Crear un m�todo main en una clase separada (Ejercicio2) en el que
se realizar�n pruebas sobre el funcionamiento de la pila (probar a apilar y 
desapilar distintos elementos y ver que funciona correctamente). Para ello 
crear un objeto que implementa la lista de esta forma:
	IPila impPila= new PilaArrayList();
	
Apartado 3: Realizar una implementaci�n de IPila mediante LinkedList de forma
similar a lo hecho con ArrayList, creando una clase PilaLinkedList y con un
campo pila de tipo LinkedList.

Apartado 4: Modificar la implementaci�n usada en las pruebas del apartado 2
para comprobar que,aunque cambie la implementaci�n usada sigue funcionando
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
		listaPersonas.add(new Persona("Jose Luis","Rodriguez V�zquez",72));
		listaPersonas.add(new Persona("Borja","L�pez L�pez",11));
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
