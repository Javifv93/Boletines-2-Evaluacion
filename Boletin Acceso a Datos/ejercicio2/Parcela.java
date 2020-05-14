package ejercicio2;

class Parcela 
{
	//Atributos
	private String calle;
	private int numero;
	private String poblacion;
	private String provincia;
	private int mCuadrados;
	
	//Getters
	String getCalle() {return calle;}
	int getNumero() {return numero;}
	String getPoblacion() {return poblacion;}
	String getProvincia() {return provincia;}
	int getMCuadrados() {return mCuadrados;}
	
	/**Constructor de la clase Parcela con todos los atributos por parametro*/
	Parcela(String calle, int numero, String poblacion, String provincia, int mCuadrados)
	{
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.mCuadrados = mCuadrados;
	}
	@Override //de toString
	public String toString()
	{
		System.out.println("Calle: "+this.calle+
							"\nNumero: "+this.numero+
							"\nPoblacion: "+this.poblacion+
							"\nProvincia: "+this.provincia+
							"\nMetros Cuadrados: "+this.mCuadrados+"\n");
		return super.toString();
	}
}
	
	
