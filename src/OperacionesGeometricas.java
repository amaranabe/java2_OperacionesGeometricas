import java.util.Scanner;
import java.lang.String;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

/*
 *Programa para utilizar clases de otros programas.
 */

public class OperacionesGeometricas
{

	public static void main (String args[]) 
	{
				
		System.out.print("\nElige una de estas opciones:");
		System.out.print("\nCirculo, Rectangulo o Terminar: ");
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		String figura;
		figura = new String();
		figura=sc.nextLine();
		//char opcion=;	
	
		while (!figura.equalsIgnoreCase("terminar"))
		{
			double radio=0, base=0, altura=0;
			if (figura.equalsIgnoreCase("circulo"))  
			{

				Circulo operaciones = new Circulo(radio);			
				System.out.print("\nHas elegido circulo"); 
				System.out.print("\nCual es el radio?");
				radio = sc.nextDouble();
		
				operaciones.setRadio(radio);
				double resultadoArea, resultadoCircunferencia;
				resultadoArea = operaciones.area();
				resultadoCircunferencia = operaciones.circunf();
		
				System.out.println("\nEl resultado del AREA es: " + resultadoArea);
				System.out.println("\nEl resultado de la CIRCUNFERENCIA es: "+  resultadoCircunferencia);
				}
				
			else  
			{
				System.out.print("\nHas elegido rectangulo"); 
				System.out.print("\nCual es la base?: ");
				base = sc.nextDouble();
				System.out.print("\nCual es la altura?: ");
				altura = sc.nextDouble();
			
				Rectangulo operaciones = new Rectangulo(base, altura);
				operaciones.setBase(base);
				operaciones.setAltura(altura);
			
				double result;
				result = operaciones.perimetro();
				System.out.println("\nEl resultado del perimetro es: " + result);
				result = operaciones.area();
				System.out.println("\nEl resultado del area es: " + result);
			}
					
		figura="terminar";
			
		}
							
		System.out.println("\n\nEGUN ONA IZAN!!\n");

	}

}
