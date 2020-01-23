package Ejercicio1;

public class Coche extends Vehiculo
{
	private int numeroPlazas;
	
	public Coche(String matricula, String tipo, int velocidadMaxima, int numeroPlazas)
	{
		this.setMatricula(matricula);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setTipo(tipo);
		this.numeroPlazas=numeroPlazas;
	}
	@Override
	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("\t- Nº de plazas: "+this.numeroPlazas);
		
	}
}
