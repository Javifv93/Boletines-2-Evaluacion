/*Clase de útiles para java*/

//Utiles generales de comprobación de la linea 10 a la 150.
//Utiles del Ejercicio1 de la linea 150 a la 230.
//Utiles del Ejercicio2 de la linea 230 a la 342.
//Utiles del Ejercicio3 de la linea 342 a la 826.

package Utilidades;
import java.util.Scanner;

public class Util 
{
	//-----------------------------------------COMPROBACIONES----------------------------------------//
	
	//--------------------------Comprueba si es número o letra (int)---------------------------//
	
			public static int obtenerNumeroInt()
			{
				Scanner sc=new Scanner(System.in);
				boolean x=false;
				int numeroValido=0;
				while(!x)
				{
					if(sc.hasNextInt())			
					{
						numeroValido=sc.nextInt();
						x=true;
					}
					else
					{
						System.out.println("Introduce un valor numérico válido");
						sc.next();
					}
				}
				return(numeroValido);
			}
			
	//--------------------------Comprueba si es número o letra (double)-----------------------//
			
			public static double obtenerNumeroDouble()
			{
				Scanner sc=new Scanner(System.in);
				boolean x=false;
				double numeroValido=0;
						
				while(!x)
				{
					if(sc.hasNextDouble())
					{
						numeroValido=sc.nextDouble();
						x=true;
					}
					else
					{
						System.out.println("Introduce un valor numérico válido");
						sc.next();
					}
				}
				return(numeroValido);
			}
			
//--------------------------Comprueba si es número o letra (long)---------------------------//
			
			public static long obtenerNumeroLong()
			{
				Scanner sc=new Scanner(System.in);
				boolean x=false;
				long numeroValido=0;
				while(!x)
				{
					if(sc.hasNextLong())
					{
						numeroValido=sc.nextLong();
						x=true;
					}
					else
					{
						System.out.println("Introduce un valor numérico válido");
						sc.next();
					}
				}
				return(numeroValido);
			}
   //-------------Comprobueba si es número o letra, y si es positivo o negativo (Int)---------//
			
			public static int obtenerNumeroPositivoInt()
			{
				Scanner sc=new Scanner(System.in);
				boolean x=false;
				int numeroPositivo=0;
						
				while(!x)
				{
					while(!x)
					{
						if(sc.hasNextInt())
						{
							numeroPositivo=sc.nextInt();
							x=true;
						}
						else
						{
							System.out.println("Introduce un valor numérico válido");
							sc.next();
						}
					}
					if(numeroPositivo<0)
					{
						System.out.println("Introduce un valor positivo");
						x=false;
					}
				}
				return(numeroPositivo);
			}
			
 //-------------Comprobueba si es número o letra, y si es positivo o negativo (Double)---------//
			
			
			public static double obtenerNumeroPositivoDouble()
			{
				Scanner sc=new Scanner(System.in);
				boolean x=false;
				double numeroPositivo=0;
						
				while(!x)
				{
					while(!x)
					{
						if(sc.hasNextDouble())
						{
							numeroPositivo=sc.nextDouble();
							x=true;
						}
						else
						{
							System.out.println("Introduce un valor numérico válido");
							sc.next();
						}
					}
					if(numeroPositivo<0)
					{
						System.out.println("Introduce un valor positivo");
						x=false;
					}
				}
				return(numeroPositivo);
			}
			
			
//-------------------------------------PROCESOS EJERCICIO1---------------------------------------//
			
		//-----------------------------Multiplicación Ej1-------------------------------//
			
			public static int multiplicacion()
			{
				int multiplicando;	//Primer número pedido al usuario.
				int multiplicador;	//Segundo número pedido al usuario.
				int producto=0;		//Resultado multiplicación.
				int x=1;			//Variable de control para el bucle.
				
				System.out.println("Para realizar una múltiplicación, introduce el multiplicando");
				multiplicando=Util.obtenerNumeroPositivoInt();
				System.out.println("Introduce el multiplicador");
				multiplicador=Util.obtenerNumeroPositivoInt();
				
	/*El siguiente while sirve para sumar el multiplicando por si mismo el número de veces 
	 * definidas por el multiplicador, obteniendo el mismo resultado que obtendríamos utilizando
	 * una multiplicación normal.*/
				
				producto=multiplicando;
				while(x<multiplicador) 					//El multiplicador determina el número de veces que se repite 
				{										//el bucle, y por tanto, que el multiplicando se suma a si mismo.
					producto=producto+multiplicando;
					x++;							
				}
				return producto;						//La variable producto se va actualizando dentro del propio
			}											//bucle, almacenando el resultado de la "multiplicación".
			
		//--------------------------División enteros Ej1------------------------------//
			
			public static int division()
			{
				int dividendo;	//Primer número pedido al usuario.
				int divisor;	//Segundo número pedido al usuario.
				int cociente=0;	//Resultado división.
				int sumaDivisor=0;	//Variable de almacenamiento en el bucle.

				System.out.println("Para realizar la división entre dos números enteros,"
						+ " introduce el dividendo");
				dividendo=Util.obtenerNumeroPositivoInt();
				System.out.println("Introduce el divisor");
				divisor=Util.obtenerNumeroPositivoInt();
				do
				{									//En este caso, uso la variable sumaDivisor como condición del bucle
					sumaDivisor=sumaDivisor+divisor;//y para ir sumando el divisor X veces hasta que este iguale o supere
					if(sumaDivisor<=dividendo)
					cociente++;						//al dividendo. A cada una de estas vueltas se va sumando uno a la 
				}									//variable cociente, cuyo valor será retornado como resultado de la
				while(sumaDivisor<=dividendo);
				return cociente;					//división. 
			}										
			
		//-----------------------Cálculo del resto enteros Ej1--------------------------//
			
			public static int resto()
			{
				int dividendo;
				int divisor;
				int resto=0;
				int variableControl=0;
				
				System.out.println("Para calcular el resto de la división de dos números enteros,"
						+ "introduce el dividendo\r");
				dividendo=Util.obtenerNumeroPositivoInt();
				System.out.println("Introduce el divisor");
				divisor=Util.obtenerNumeroPositivoInt();
				do
				{											//Se realiza la suma del divisor en bucle hasta que este
					variableControl=variableControl+divisor;//iguale o supere al dividendo. 
				}
				while(variableControl<=dividendo);			//Si lo supera, se retrocede un paso, o dicho de otra forma,
				if(variableControl>dividendo)				//se resta una vez el divisor.
				{
				variableControl=variableControl-divisor;
				}
				resto=dividendo-variableControl;			//El resto va a ser la diferencia entre dividendo y la variable
				return resto;								//en la que guardamos la suma del divisor.
			}												//En este ejercicio no guardo el cociente por que es irrelevante.
			
	//--------------------------PROCESOS EJERCICIO2-----------------------------------------------------//
			
	//-------------------------Cálculo del área de un triangulo Ej2----------------------------//
			
			public static double areaTriangulo()
			{
				double base;
				double altura;
				double area=0;
				
				System.out.println("Introduce la base del triangulo.");
				base=Util.obtenerNumeroPositivoDouble();
				System.out.println("Introduce la altura del triangulo.");
				altura=Util.obtenerNumeroPositivoDouble();
				
				area=(base*altura)/2;
				return area;				
			}
	//-----------------------Cálculo del área de un Cuadrado Ej2------------------------------//
			
			public static double areaCuadrado()
			{
				double lado;
				double area=0;
				
				System.out.println("Introduce el lado del cuadrado.");
				lado=Util.obtenerNumeroPositivoDouble();
				
				area=lado*lado;
				return area;
			}
			
	//------------------------Cálculo del área de un Rectangulo Ej2-------------------------//
			
			public static double areaRectangulo()
			{
				double base;
				double altura;
				double area=0;
				
				System.out.println("Introduce la base del rectangulo");
				base=Util.obtenerNumeroPositivoDouble();
				System.out.println("Introduce la altura del rectangulo");
				altura=Util.obtenerNumeroPositivoDouble();
				
				area=base*altura;
				return area;
			}
			
	//-----------------------Cálculo del área de un Rombo Ej2--------------------------------//
			
			public static double areaRombo()
			{
				double diagonalMayor;
				double diagonalMenor;
				double area;
				
				System.out.println("Introduce la diagonal mayor del rombo.");
				diagonalMayor=Util.obtenerNumeroPositivoDouble();
				System.out.println("Introduce la diagonal menor del rombo.");
				diagonalMenor=Util.obtenerNumeroPositivoDouble();
				
				area=(diagonalMayor*diagonalMenor)/2;
				return area;
			}
			
	//-----------------------Cálculo del área de un Trapecio Ej2--------------------------------//
			
			public static double areaTrapecio()
			{
				double baseMayor;
				double baseMenor;
				double altura;
				double area;
				
				System.out.println("Introduce la base mayor del trapecio.");
				baseMayor=Util.obtenerNumeroPositivoDouble();
				System.out.println("Introduce la base menor del trapecio.");
				baseMenor=Util.obtenerNumeroPositivoDouble();
				System.out.println("Introduce la altura del trapecio.");
				altura=Util.obtenerNumeroPositivoDouble();
				
				area=(baseMayor+baseMenor)*altura/2;
				return area;
			}
	//-----------------------Cálculo del área de un Círculo Ej2------------------------------//
			
			public static double areaCirculo()
			{
				double radio;
				double area;
				
				System.out.println("Introduce el radio del círculo.");
				radio=Util.obtenerNumeroPositivoDouble();
				area=Math.PI*(radio*radio);
				return area;
			}
			
	//-----------------------Cálculo del área una esfera Ej2------------------------------//
			
			public static double areaEsfera()
			{
				double radio;
				double area;
				
				System.out.println("Introduce el radio de la esfera.");
				radio=Util.obtenerNumeroPositivoDouble();
				area=4*(Math.PI)*(radio*radio);
				return area;
			}
			
			
	//---------------------------PROCESOS EJERCICIO3-----------------------------------------//

	//-------------------------Convertir de decimal a octal---------------------------------//

			public static int pasarDecimalOctal()
			{
				int decimal;
				int octal=0;
				int cociente=0;
				int resto=0;
				String conteo="";
				String conteoReverse="";
				
				System.out.println("Introduce un número en base decimal");
				decimal=Util.obtenerNumeroPositivoInt();
									
				cociente=decimal/8;
				resto=decimal%8;
				conteo=conteo+resto;			//La String conteo es la que va a guardar la cadena de texto de salida
												//Si el número decimal es menor que 8 se guarde e imprime tal cual.
				if(cociente<8)
				{								
					conteo=conteo+cociente;		//Si tras la primera división el cociente es menor a 8, se guarda este en
				}								//el conteo y se imprime después junto al resto.
				else							
				{								//Si no, entramos en el bucle conversor.
					do
					{							//En este bucle, vamos realizando la división en bucle.
						int dividendo=cociente;	//En la definición de cociente de arriba ya realizamos la primera división
						cociente=dividendo/8;	//por lo que realizamos la segunda...
						resto=dividendo%8;		//...y vamos guardando el resto...
						conteo=conteo+resto;	//...en la cadena conteo.
					}
					while(cociente>8);			//Mientras el cociente sea mayor de 8 se repetira el bucle guardando 
					conteo=conteo+cociente;		//sucesivamente los restos. Tras el bucle, se guarda también el cociente.
				}
				for(int x=conteo.length()-1;x>=0;x--)	//Aquí realizamos un bucle for para invertir el orden de la String
				{
					conteoReverse=conteoReverse+conteo.charAt(x);
				}
				octal=Integer.parseInt(conteoReverse);	//Y la pasamos de String a Int. (No es necesario realmente)
				
				return octal;
			}
			
		//-----------------Pasar de Decimal a Hexadecimal-----------------------------------//
			
			public static String pasarDecimalHexadecimal()
			{
				int decimal;
				int cociente=0;
				int resto=0;
				String conteo="";
				String conteoReverse="";
				char restoChar=0;
				char cocienteChar=0;
				
				System.out.println("Introduce un número en base decimal");
				decimal=Util.obtenerNumeroPositivoInt();
				
				cociente=decimal/16;			//Inicializamos cociente y resto igual que en el proceso anterior.
				resto=decimal%16;
				if((resto<16)&&(resto>9))		//En esta parte, si el resto es mayor que 9 y menor que 16, introducimos
				{								//en la variable restoChar la letra equivalente al valor del resto en
					switch(resto)				//hexadecimal...
					{
						case 10:
							restoChar='A';
							break;
						case 11:
							restoChar='B';
							break;
						case 12:
							restoChar='C';
							break;
						case 13:
							restoChar='D';
							break;
						case 14:
							restoChar='E';
							break;
						case 15:
							restoChar='F';
							break;
					}
					conteo=conteo+restoChar;	//...y la guardamos en la String conteo.
				}
				else
				{
					conteo=conteo+resto;		//En caso contrario, el resto, que va a tener un valor entre 0 y 9, se
				}								//se guarda tal cual.
				if((cociente<16)&&(cociente>9))
				{
					switch(cociente)			//Aplicamos el switch para convertir los valores entre 9 y 16 en chars
					{							//igual que antes, pero para el cociente.
							case 10:				//Este if se va a aplicar solo en caso de que el cociente tras la
								cocienteChar='A';	//primera división sea menor de 16, por lo que se guardaria en la 
								break;				//String conteo para imprimirlo posteriormente junto al resto.
							case 11:
								cocienteChar='B';
								break;
							case 12:
								cocienteChar='C';
								break;
							case 13:
								cocienteChar='D';
								break;
							case 14:
								cocienteChar='E';
								break;
							case 15:
								cocienteChar='F';
								break;
					}
					conteo=conteo+cocienteChar;
				}
				else
				{										//En caso de que tras la primera división el resto sea mayor de 
					do									//16, se seguira dividiendo en bucle hasta que este sea menor.
					{
						int dividendo=cociente;			//En este caso, la conversion del resto a letras y su adición
						cociente=dividendo/16;			//a la String conteo tiene que hacerse en cada vuelta del bucle
						resto=dividendo%16;				//(En caso de que sea necesario).
						if((resto<16)&&(resto>9))
						{
							switch(resto)
							{
								case 10:
									restoChar='A';
									break;
								case 11:
									restoChar='B';
									break;
								case 12:
									restoChar='C';
									break;
								case 13:
									restoChar='D';
									break;
								case 14:
									restoChar='E';
									break;
								case 15:
									restoChar='F';
									break;
							}
							conteo=conteo+restoChar;
							
						}
						else
						{
							conteo=conteo+resto;
						}
					}
					while(cociente>16);
					if((cociente<16)&&(cociente>9))			//Se hace la ultima conversion de letras a números si es
					{										//necesario, y si no se agrega al String sin más.
						switch(cociente)
						{
								case 10:
									cocienteChar='A';
									break;
								case 11:
									cocienteChar='B';
									break;
								case 12:
									cocienteChar='C';
									break;
								case 13:
									cocienteChar='D';
									break;
								case 14:
									cocienteChar='E';
									break;
								case 15:
									cocienteChar='F';
									break;
						}
						conteo=conteo+cocienteChar;
					}
					else
					{
						conteo=conteo+cociente;
					}
				}
				for(int x=conteo.length()-1;x>=0;x--)	//Como en el anterior proceso, se invierte el orden del String
				{
					conteoReverse=conteoReverse+conteo.charAt(x);
				}				
				return conteoReverse;
			}
			
	//----------------------Pasar de decimal a binario---------------------------------------//
			
			public static long pasarDecimalBinario()
			{
				int decimal=0;
				long binario=0;
				int resto=0;
				String conteo="";
				String conteoReverse="";
				boolean comprobacionCifras=false;
				
				while(!comprobacionCifras)
				{
				System.out.println("Introduce un número en base decimal (MAX. 5 cifras)");	//De 6 cifras en adelante peta.
				decimal=Util.obtenerNumeroPositivoInt();	
				
				if(decimal<99999)
					comprobacionCifras=true;
				else
					System.out.println("Error. Introduce un número de 5 cifras como máximo");
				}
				do
				{								//La ejecución del proceso es similar a las dos anteriores, solo que en
					resto=decimal%2;			//base 2. 
					conteo=conteo+resto;
					decimal=decimal/2;
				}
				while(decimal>1);
				conteo=conteo+decimal;
				
				for(int x=conteo.length()-1;x>=0;x--)
				{
					conteoReverse=conteoReverse+conteo.charAt(x);
				}
				
				binario=Long.parseLong(conteoReverse);		//Se utiliza el Long por la longitud de la String de salida.
															
				return binario;
			}
	
	//--------------------Introducir número binario-------------------------------------------//
			
			public static long obtenerNumeroBinario()		//Este proceso bien podría ir al principio del util, por que
			{												//no es un ejercicio, si no un subproceso del punto siguiente 
				String binarioString="";					//que necesita introducir un número binario en String.
				long binario;								//Este subproceso sirve para hacer la comprobación.
				boolean noBinario=false;
				char charComprobacionFor;
			
				do
				{	
					noBinario=false;
					System.out.println("Introduce un número en base binaria");
					binario=Util.obtenerNumeroLong();	//En este proceso se aplica un hasNextLong para evitar que se
					binarioString=String.valueOf(binario);	//introduzcan caracteres que no sean numericos...
					for(int x=binarioString.length()-1;x>=0;x--)
					{
						charComprobacionFor=binarioString.charAt(x);
						if								//..y ahora comprobamos que la cadena de texto entrante solo
						((charComprobacionFor!='1')		//contenta 1's y 0's. (En char)
								&&
						(charComprobacionFor!='0'))
						{
							noBinario=true;				//En caso contrario, noBinario pasa a verdadero y salta el if
						}								//siguiente en cuanto salimos del for.
					}
					if(noBinario==true)
					{
						System.out.println("El número introducido no es correcto");
					}		
				}
				while(noBinario==true);
				return binario;
			}
			
	//----------------------Pasar de binario a decimal---------------------------------------//
	
			
			public static long pasarBinarioDecimal()
			{
				long decimal=0;
				long binario;
				String binarioString="";
				String binarioStringReverse="";
				int base=2;
				int exponente=0;
				int multiplicadorDecimal;
				
				binario=Util.obtenerNumeroBinario();			//Llamada al proceso anterior de comprobación.
				binarioString=String.valueOf(binario);			//Pasa de long a String.
				for(int x=binarioString.length()-1;x>=0;x--)
				{												//for para invertir el orden de la cadena.
					binarioStringReverse=binarioStringReverse+binarioString.charAt(x);
				}												
				for(int x=binarioStringReverse.length()-1;x>=0;x--)	 
				{												
					exponente=x;						//El exponente es la posición en la que se encuentra en el String
					multiplicadorDecimal=binarioStringReverse.charAt(x);	
					if(multiplicadorDecimal==48)		//El valor ASCII del carácter 0 es 48, por lo que si hay un 0 en
						multiplicadorDecimal=0;			//esa posición va a tomar ese valor, y aqui lo convierto a 0
					else
						multiplicadorDecimal=1;			//Y si no hay un 0 va a haber un 1. Por algo hize la comprobación.
					int potencia=(int) Math.pow(base,exponente);	//Se aplica la fórmula de cambio de base.
					decimal=decimal+(potencia*multiplicadorDecimal);//Y se va utilizando la variable decimal como sumatorio
				}
				return decimal;
			}
			
//--------------------Introducir número octal-----------------------------------------------//
			
			public static int obtenerNumeroOctal()
			{
				String octalString="";			//Lo mismo que con obtener número binario, subproceso para comprobar que 
				int octal;						//lo que pida el ejercicio siguiente va a ser un octal, sin que se cuelen
				boolean noOctal=false;			//carácteres distintos.
				char charComprobacionFor;
			
				do
				{	
					noOctal=false;
					System.out.println("Introduce un número en base octal");
					octal=Util.obtenerNumeroPositivoInt();
					octalString=String.valueOf(octal);
					for(int x=octalString.length()-1;x>=0;x--)
					{
						charComprobacionFor=octalString.charAt(x);
						if((int)charComprobacionFor>55)	//En ASCII el 55 es un 7, por lo que si es más de 7 va a saltar
						{								//el if y reiniciar el do.
							noOctal=true;				//Los valores ASCII por debajo del 48 (0) se obvian por que el
						}								//int octal lo obtube con un subproceso con hasNextInt.
					}
					if(noOctal==true)
					{
						System.out.println("El número introducido no es correcto");
					}		
					
				}
				while(noOctal==true);
				return octal;
			}
			
			
	/*----------------------------Pasar de octal a decimal-----------------------------------*/	
			public static int pasarOctalDecimal()
			{
				int octal=0;
				int decimal=0;
				String octalString="";
				String octalStringReverse="";
				int base=8;
				int exponente=0;
				int multiplicadorDecimal;
				
				octal=Util.obtenerNumeroOctal();
				octalString=String.valueOf(octal);
				for(int x=octalString.length()-1;x>=0;x--)
				{
					octalStringReverse=octalStringReverse+octalString.charAt(x);
				}
				for(int x=octalStringReverse.length()-1;x>=0;x--)
				{
					exponente=x;
					multiplicadorDecimal=octalStringReverse.charAt(x);		//Hasta aquí el proceso es muy parecido al de
					switch(multiplicadorDecimal)							//pasar de binario a decimal.
					{	
					case 48:												//Switch para pasar de ASCII a numérico.
						multiplicadorDecimal=0;
						break;
					case 49:
						multiplicadorDecimal=1;
						break;
					case 50:
						multiplicadorDecimal=2;
						break;
					case 51:
						multiplicadorDecimal=3;
						break;
					case 52:
						multiplicadorDecimal=4;
						break;
					case 53:
						multiplicadorDecimal=5;
						break;
					case 54:
						multiplicadorDecimal=6;
						break;
					case 55:
						multiplicadorDecimal=7;
						break;
					}
					int potencia=(int) Math.pow(base,exponente);		//Igual que en el anterior, se va aplicando la
					decimal=decimal+(potencia*multiplicadorDecimal);	//formula y guardando el resultado.
				}
				return decimal;
			}
			
//--------------------Introducir número hexadecimal-----------------------------------------------//
			
			public static String obtenerNumeroHexadecimal()
			{
				Scanner sc=new Scanner(System.in);			//Lo mismo que octal y binario pero en hexadecimal.
				String hexString="";
				boolean noHex=false;
				char charComprobacionFor;
			
				do
				{	
					noHex=false;
					System.out.println("Introduce un número en base hexadecimal.");
					hexString=sc.nextLine();
					hexString=hexString.replace('a','A');
					hexString=hexString.replace('b','B');	//Ya que más adelante hago la criba de carácteres basandome
					hexString=hexString.replace('c','C');	//en el valor ASCII, y para no complicarme mucho más la vida,
					hexString=hexString.replace('d','D');	//reemplazo de primeras todas las minúsculas que pudiera haber
					hexString=hexString.replace('e','E');	//de las 6 letras del  hexadecimal por mayúsculas, ya que
					hexString=hexString.replace('f','F');	// tienen valor ASCII distinto y habría que contemplarlo o
					for(int x=hexString.length()-1;x>=0;x--)	//modificarlo después.
					{
						charComprobacionFor=hexString.charAt(x);
						/*Aquí lo que hago es cribar cualquier signo ASCII que no esté entre el 48 y el 57 (de 0 a 9) 
						 * o entre el 65 y el 70 (de A a F). De esta forma también descarto valores negativos, ya que 
						 * el simbolo '-' tiene valor numérico en ASCII*/
						if(
							 ((int)charComprobacionFor<48)||((int)charComprobacionFor>70)
														  &&
							(((int)charComprobacionFor>57)||((int)charComprobacionFor<65)))
						/*Si entra en el if aunque sea una sola vez, el valor de noHex pasa a positivo y cuando sale 
						  del bucle for entra en el siguiente if que manda un mensaje de aviso y vuelve al principio
						  del do-while, reiniciando el proceso y pidiendo de nuevo que introduzca número.*/
						{
							noHex=true;		
						}
					}
					if(noHex==true)
					{
							System.out.println("El número introducido no es correcto");
					}		
				}
				while(noHex==true);
				return hexString;
			}
			
			
	/*---------------------------Pasar de hexadecimal a decimal-------------------------------*/

	
		public static int pasarHexadecimalDecimal()
		{
			int decimal=0;
			String hexString="";
			String hexStringReverse="";
			int base=16;
			int exponente=0;
			int multiplicadorDecimal;
			
			hexString=Util.obtenerNumeroHexadecimal();
			for(int x=hexString.length()-1;x>=0;x--)
			{
				hexStringReverse=hexStringReverse+hexString.charAt(x);
			}
			for(int x=hexStringReverse.length()-1;x>=0;x--)
			{
				exponente=x;
				multiplicadorDecimal=hexStringReverse.charAt(x);
				switch(multiplicadorDecimal)						//Mismo proceso que los anteriores.
				{								
				case 48:											//Con un switch más largo.
					multiplicadorDecimal=0;
					break;
				case 49:
					multiplicadorDecimal=1;
					break;
				case 50:
					multiplicadorDecimal=2;
					break;
				case 51:
					multiplicadorDecimal=3;
					break;
				case 52:
					multiplicadorDecimal=4;
					break;
				case 53:
					multiplicadorDecimal=5;
					break;
				case 54:
					multiplicadorDecimal=6;
					break;
				case 55:
					multiplicadorDecimal=7;
					break;
				case 56:
					multiplicadorDecimal=8;
					break;
				case 57:
					multiplicadorDecimal=9;
					break;
				case 58:
					multiplicadorDecimal=8;
					break;
				case 59:
					multiplicadorDecimal=9;
					break;
				case 65:
					multiplicadorDecimal=10;	//A
					break;
				case 66:
					multiplicadorDecimal=11;	//B
					break;
				case 67:
					multiplicadorDecimal=12;	//C
					break;
				case 68:
					multiplicadorDecimal=13;	//D
					break;
				case 69:
					multiplicadorDecimal=14;	//E
					break;
				case 70:
					multiplicadorDecimal=15;	//F
					break;
				}
				int potencia=(int) Math.pow(base,exponente);
				decimal=decimal+(potencia*multiplicadorDecimal);
			}
			return decimal;
		}		
}			