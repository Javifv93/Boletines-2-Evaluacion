package ejercicio1;

public class Indirecta 
{
	public static void main (String[] args)
	{
		int base=2;  //Modificar manualmente para hacer pruebas
		int exp=2;	//Modificar manualmente para hacer pruebas
		System.out.println(potencia(base, exp));
	}
	static int potencia (int base, int exp)
	{				
		/*  En este caso, el proceso es similar, solo que se inicia en "potencia" y, en caso de que el exponente sea distinto de
		 *  0 o 1, pasará a la funcion "operacionesPot", donde se realizará el mismo bucle que en el ejercicio de recursividad
		 *  Directa, hasta que el exponente sea 1, donde volverá a "potencia" para asignar el valor "base" a pot, y continua
		 *  el bucle inverso en "operacionesPot". Al terminar, envia el resultado a "potencia", y esta al main.*/
		int pot;
		if(exp==0)
			pot=1;
		else if(exp==1)
			pot=base;
		else
		{
			pot=operacionesPot(base,exp);
		}
		return pot;
	}
	static int operacionesPot (int base, int exp)
	{
		int pot;
		if(exp == 1)
			pot=potencia(base, exp);
		else
		{
			exp --;
			pot=base*operacionesPot(base, exp);
		}
		return pot;
	}
}
