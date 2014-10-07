/*
 * Clase para obtener resultados del perimetro y area de un rectangulo.
 */
package com.zubiri.geometria;
public class Rectangulo 
{

		private double base = -1;
		private double altura = -1;
				
		public Rectangulo (double valorBase, double valorAltura)
		{
				base=valorBase;
				altura=valorAltura;
		}
				public double getBase() 
				{
								return base;
				} 
				public double getAltura() 
				{
								return altura;
				} 
				public void setBase (double _base) 
				 {
								base=_base;
				 } 
				public void setAltura (double _altura) 
				{
								altura=_altura;
				}
				//Metodo que calcula el perimetro.
				 public double perimetro () 
				 {
								double result;
								result = 2 *(this.getBase() + this.getAltura());
								return result;
				 }
				 
				//Metodo que calcula el area (base*altura).
				 public double area () 
				 {
								double result;
								result	= this.getBase() * this.getAltura();
								return result;
				 }

}

