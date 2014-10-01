import java.util.Scanner;
import java.lang.String;
//import com.zubiri.geometria.Circulo;
//import com.zubiri.geometria.Rectangulo;

/*
 *Programa para utilizar clases de otros programas.
 */

public class OperacionesGeometricas
{

	public static void main (String args[]) 
	{
		
		
//1.Pedir los datos al usuario
		
		System.out.print("\n�Qu� figura geom�trica quieres, circulo o rect�ngulo?: "); //Utilizo la salida estandar (stdout) (pantalla)
		
//2.Leer datos que introduce el usuario
		Scanner sc;
		sc = new Scanner(System.in);//Reservar espacio en memoria para una variable de clase. Tiene una funci�n que permite leer lo que se introduce por el teclado
		String figura; //reservo espacio para la referencia figura
		figura = new String(); //reservo el espacio para un variable de tipo String, y le asigno a figura (as� "figura" referencia a ese espacio, esto es, accedemos a ese espacio
		figura=sc.nextLine();
		//llamo al metodo nextLine de la clase scanner (previamente) reservada y asigno el valor que devuelve al objeto figura
		
		double radio, base, altura;
	
		if (figura.equalsIgnoreCase("circulo") == 1)  
		{
			System.out.print("\nHas elegido circulo"); 
			System.out.print("\n�C�al es el radio?");
			radio = sc.nextInt();

			com.zubiri.geometria.Circulo operaciones = new com.zubiri.geometria.Circulo();//disponible la variable
		
			System.out.print("\n�Cu�l es el radio?: ");
			radio = sc.nextInt();
		
			double resultadoArea, resultadoCircunferencia;
			resultadoArea = operaciones.area(radio);
			resultadoCircunferencia = operaciones.circunf(radio);
		
			System.out.println("\nEl resultado del AREA es: " + resultadoArea);
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
		}
		else 
		{
			System.out.print("\nHas elegido rectangulo"); 
			System.out.print("\n�Cu�l es la base?: ");
			base = sc.nextDouble();
			System.out.print("\n�Cu�l es la altura?: ");
			altura = sc.nextDouble();
			
			com.zubiri.geometria.Rectangulo operaciones = new com.zubiri.geometria.Rectangulo();
			operaciones.setBase(base);
			operaciones.setAltura(altura);
			
			double result;
			result = operaciones.perimetro();
			System.out.println("\nEl resultado del per�metro es: " + result);
			
			result = operaciones.area();
			System.out.println("\nEl resultado del �rea es: " + result);
		}
							
			System.out.println("\n\nEGUN ONA IZAN!!\n");

	}

}