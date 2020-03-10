package Ejercicio2;
enum TipoCombustible {DIESEL, GASOLINA, ELECTRICO, HIBRIDO};

public class Automovil 
{
	private String marca;
	private String modelo;
	public TipoCombustible combustible;
	
	public Automovil(String marcaX, String modeloX, TipoCombustible combustibleX)
	{
		marca=marcaX;
		modelo=modeloX;
		combustible=combustibleX;
	}
	@Override
	public String toString()
	{
		String imprimir="Marca: "+this.marca+
				"\rModelo: "+this.modelo+
				"\rTipo de Combustible: "+this.combustible+"\r\r";
		return imprimir;
	}
}
