import java.util.Scanner;
//import java.lang.String; NO HACE FALTA LLAMAR A ESTA CLASE
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

/*
 *Programa para utilizar clases de otros programas.
 */

public class OperacionesGeometricas
{

	public static void main (String args[]) //linea de arranque que permite que se ejecute
	{
				
	//1.Pedir los datos al usuario
		
		System.out.print("\nQue figura geométrica quieres, circulo o rectangulo?: "); //Utilizo la salida estandar (stdout) (pantalla)
		
	//2.Leer datos que introduce el usuario
		Scanner sc;
		sc = new Scanner(System.in);//Reservar espacio en memoria para una variable de clase. Tiene una funcion que permite leer lo que se introduce por el teclado
		String figura; //reservo espacio para la referencia figura
		figura = new String(); //reservo el espacio para un variable de tipo String, y le asigno a figura (asi "figura" referencia a ese espacio, esto es, accedemos a ese espacio
		figura=sc.nextLine();
		//llamo al metodo nextLine de la clase scanner (previamente) reservada y asigno el valor que devuelve al objeto figura
		
		double radio=0, base=0, altura=0;
	//3.Decir que hacer con esos datos
		if (figura.equalsIgnoreCase("circulo"))  
		{

			com.zubiri.geometria.Circulo operaciones = new com.zubiri.geometria.Circulo(radio);//disponible la variable			
			System.out.print("\nHas elegido circulo"); 
			System.out.print("\nCual es el radio?");
			radio = sc.nextDouble();
		
			operaciones.setRadio(radio);//aqui le da el valor del radio (HAY Q APLICAR SET Y GET EN LA CLASE CIRCULO)
			double resultadoArea, resultadoCircunferencia;
			resultadoArea = operaciones.area();//area devuelve un valor
			resultadoCircunferencia = operaciones.circunf();
		
			System.out.println("\nEl resultado del AREA es: " + resultadoArea);
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
		}
		else
		{
			System.out.print("\nHas elegido rectangulo"); 
			System.out.print("\nCual es la base?: ");
			base = sc.nextDouble();
			System.out.print("\nCual es la altura?: ");
			altura = sc.nextDouble();
			
			com.zubiri.geometria.Rectangulo operaciones = new com.zubiri.geometria.Rectangulo(base, altura);
			operaciones.setBase(base);
			operaciones.setAltura(altura);
			
			double result;
			result = operaciones.perimetro();
			System.out.println("\nEl resultado del perímetro es: " + result);
			result = operaciones.area();
			System.out.println("\nEl resultado del área es: " + result);
		}
							
			System.out.println("\n\nEGUN ONA IZAN!!\n");

	}

}
