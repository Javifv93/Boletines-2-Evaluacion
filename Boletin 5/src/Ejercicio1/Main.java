/** Dada la siguiente clase Persona
public class Persona {
private String nombre;
private String apellidos;
private int edad;
public Persona(String nombre, String apellidos, int edad)
{
this.nombre=nombre;
this.apellidos=apellidos;
this.edad=edad;
}//Persona
public String getNombre() {
return nombre;
}//getNombre
public String getApellidos() {
return apellidos;
}//getApellidos
public int getEdad() {
return edad;
}//getEdad
}//class
Apartado 1: Crear una función que pasado por parámetro un ArrayList y un caracter, devuelva un
nuevo ArrayList con las Personas cuyo nombre comienza por la letra indicada.
Apartado 2: Crear una función que pasado un ArrayList y una edad por parámetros devuelva el mismo
ArrayList sin los objetos de tipo Persona que superan esa edad.
Apartado 3: Crear en Persona una sobreescritura de toString() para imprimir los datos de la Persona.
Apartado 4, Probar los métodos realizados mediante la ejecución del siguiente main. Completar el
código de los comentarios.
public class Ejercicio1 {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
listaPersonas.add(new Persona("Jose","Martinez Granda",55));
listaPersonas.add(new Persona("Katy","Ruiz Gomez",24));
listaPersonas.add(new Persona("Jose Manuel","Blanco Garrido",18));
listaPersonas.add(new Persona("Jose Luis","Rodriguez Vázquez",72));
listaPersonas.add(new Persona("Borja","López López",11));
listaPersonas.add(new Persona("Lourdes","Neira Arias",62));
listaPersonas.add(new Persona("Josefa","Martinez Seoane",57));
//llamada al método de obtener personas cuyo nombre comience por 'J'
//Llamada al método de obtener personas con edad menor a 60 años
//Impresión de las Personas restantes en la lista por medio de un foreach y
utilización del toString()
}//main
}//class
*/
package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		listaPersonas.add(new Persona("Jose","Martinez Granda",55));
		listaPersonas.add(new Persona("Katy","Ruiz Gomez",24));
		listaPersonas.add(new Persona("Jose Manuel","Blanco Garrido",18));
		listaPersonas.add(new Persona("Jose Luis","Rodriguez Vázquez",72));
		listaPersonas.add(new Persona("Borja","López López",11));
		listaPersonas.add(new Persona("Lourdes","Neira Arias",62));
		listaPersonas.add(new Persona("Josefa","Martinez Seoane",57));
		Iterator<Persona> it=listaPersonas.iterator();
		
		//llamada al método de obtener personas cuyo nombre comience por 'J'
		System.out.println("Apartado 1\rLlamada al método de obtener personas cuyo nombre comience por 'J'\r");
		char caracter='J';
		Ap1 ap1=new Ap1();
		ArrayList<Persona> listaPersonasAp1=ap1.apartado1(listaPersonas, caracter);
		Iterator<Persona> it1=listaPersonasAp1.iterator();
		while(it1.hasNext())
		{
			Persona imprimirPersona=it1.next();
				System.out.println("\tNombre: "+imprimirPersona.getNombre()+" "+
									imprimirPersona.getApellidos()+"\r\tEdad: "+
									imprimirPersona.getEdad()+"\r\r");
		}
		//Llamada al método de obtener personas con edad menor a 60 años
		System.out.println("Apartado 2\rLlamada al método de obtener personas con edad menor a 60 años\r");
		Ap2 ap2=new Ap2();
		int edad=60;
		ArrayList<Persona> listaPersonasAp2=ap2.apartado2(listaPersonas, edad);
		Iterator<Persona> it2=listaPersonasAp2.iterator();
		while(it2.hasNext())
		{
			Persona imprimirPersona=it2.next();
			System.out.println("\tNombre: "+imprimirPersona.getNombre()+" "+
								imprimirPersona.getApellidos()+"\r\tEdad: "+
								imprimirPersona.getEdad()+"\r\r");
		}
		
		//Impresión de las Personas restantes en la lista por medio de un foreach y
		//utilización del toString()
		System.out.println("Apartado 3\rImpresión de las Personas restantes en la lista por medio de un foreach y utilización del toString()\r");
		for(Persona p:listaPersonas)
		{
			if(p.getEdad()>=edad)
			System.out.println(p.toString());
		}
		
	}
}
