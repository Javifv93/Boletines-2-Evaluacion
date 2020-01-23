package Ejercicio1;

public class Main 
{
	public static final String CAMION ="CAMION";
	public static final String COCHE ="COCHE";
	
	public static void main(String[] args)
	{
		Coche coche1=new Coche("6666STN","COCHE", 210, 5);
		Conductor conductor1=new Conductor("54323234243", "Manolo");
		coche1.setConductor(conductor1);
		
		Remolque remolque1=new Remolque();
		remolque1.matricula="5678WRD";
		remolque1.longitud=12;
		Camion camion1=new Camion("1234PSS", "CAMION", 190, remolque1);
		camion1.setAltura(5);
		
		//Apartado 3
		//coche1.mostrarDatos();
		//System.out.print(conductor1);
		//camion1.mostrarDatos();
		//System.out.println(remolque1);
		
		//Apartado4
		//Vehiculo v1=new Vehiculo(); //Pruebas
		//impresionPolimorfismo(v1);
		//impresionRemolque(camion1);
		
		//Apartado5.3
		//Camion camion2=new Camion("123123", "CAMION", 180, 6);
		//camion2.mostrarDatos();
		
	}
	public static void impresionPolimorfismo(Vehiculo vehiculo)
	{
		vehiculo.mostrarDatos();
	}
	public static void impresionRemolque (Vehiculo vehiculo)
	{
		if(vehiculo.getTipo()=="CAMION")
		{
			((Camion)vehiculo).mostrarDatos();
			System.out.print(((Camion)vehiculo).getRemolque());
		}
	}
}
