package Ejercicio4;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass 
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean todoOK=false;
		
		while(!todoOK)
		{
			try
			{
				System.out.println("Introduce un usuario");
				String nombre=sc.nextLine();
				System.out.println("Introduce una contraseña");
				String psswrd=sc.nextLine();
				Usuario u1=UtilLogueo.realizarLogin(nombre, psswrd);
				todoOK=true;
			}
			catch(LoginUsuarioNoExistente lgUser) 
			{
				System.out.println(lgUser.getMessage());
			}
			catch(LoginUsuarioPassErroneo lgPss)
			{
				System.out.println(lgPss.getMessage());
			}
		}
		System.out.println("ACCESO PERMITIDO");	
	}
	public static void contrastarDB(Usuario logeo) throws LoginUsuarioNoExistente, LoginUsuarioPassErroneo
	{
		boolean existe=false;
		Usuario[] arrayUsuarios=
			{
					new Usuario("fer1", "123456"),
					new Usuario("luis86", "000000"),
					new Usuario("ana_cps2002", "AzLmR56"),
					new Usuario("MariaFernandez", "655786995"),
					new Usuario("JZm46Y", "zxcvbnm"),
					new Usuario("___121aZ", "qwerty"),
					new Usuario("M.Rajoy", "password"),
					new Usuario("", "666666"),
			};
		for(Usuario x:arrayUsuarios)
		{
			String nombre=x.getNombre();
			String nombreLogeo=logeo.getNombre();
			existe=UtilLogueo.contrastarNombre(nombre, nombreLogeo);
			if(existe==true)
				break;
		}
		if(!existe)
			throw new LoginUsuarioNoExistente("Usuario no encontrado");
		existe=false;
		for(Usuario x:arrayUsuarios)
		{
			String psswrd=x.getPsswrd();
			String psswrdLogeo=logeo.getPsswrd();
			boolean existePsswrd=UtilLogueo.contrastarPsswrd(psswrd, psswrdLogeo);
			if(existePsswrd==true)
			{
				String nombre=x.getNombre();
				String nombreLogeo=logeo.getNombre();
				existe=UtilLogueo.contrastarNombre(nombre, nombreLogeo);
			}
			if(existe==true)
				break;
		}
		if(!existe)
			throw new LoginUsuarioNoExistente("Contraseña incorrecta");
	}
}
