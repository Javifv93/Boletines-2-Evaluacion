package Ejercicio4;

public class UtilLogueo 
{
	public static Usuario realizarLogin (String usuarioIN, String psswrdIN)throws LoginUsuarioNoExistente, LoginUsuarioPassErroneo
	{
		Usuario u1=new Usuario(usuarioIN, psswrdIN);
		MainClass.contrastarDB(u1);
		return u1;		
	}
	public static boolean contrastarNombre(String nombre, String nombreLogeo)
	{
		boolean existe=false;
		if(nombre.contentEquals(nombreLogeo))
		{
			existe=true;
		}
		return existe;
	}
	public static boolean contrastarPsswrd(String psswrd, String psswrdLogeo)
	{
		boolean existe=false;
		if(psswrd.contentEquals(psswrdLogeo))
		{
			existe=true;
		}
		return existe;
	}
}
