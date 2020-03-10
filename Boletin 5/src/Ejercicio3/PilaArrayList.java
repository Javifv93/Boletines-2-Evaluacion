package Ejercicio3;

import java.util.ArrayList;

public class PilaArrayList  implements IPila
{
	ArrayList pila;
	
	public PilaArrayList()
	{
		pila=new ArrayList();
	}
	@Override
	public void a_Pilar(Object obj) 
	{
		pila.add(obj);
	}
	@Override
	public Object des_a_Pilar() 
	{
		int ultimoNum=pila.size()-1;
		Object ultimoObject=pila.get(ultimoNum);
		pila.remove(ultimoNum);
		return ultimoObject;
	}
	@Override
	public Object cima() 
	{
		int ultimoNum=pila.size()-1;
		Object ultimoObject=pila.get(ultimoNum);
		return ultimoObject;
	}
	
}
