/*
 * Clase para obtener resultados del area y la circunferencia de un circulo.
 */

package com.zubiri.geometria;
public class Circulo 
{
	public static double PI=3.1415;
	private double radio;
	
	public Circulo (double valorRadio)
	{
		radio=valorRadio;
	}

		//Creo método set y get para...
		public double getRadio() 
		{
				return radio;
		} 
		 
		public void setRadio (double _radio) 
		 {
				radio=_radio;
		 } 

		//Metodo que calcula el area.
		 public double area () 
		 {
			double result;
			result	= PI * radio * radio;
			return result;
		 }

		//Metodo que calcula la circunferencia.
		 public double circunf () 
		 {
			double result;
			result = 2 * radio * PI;
			return result;
		 }
		 
 }

