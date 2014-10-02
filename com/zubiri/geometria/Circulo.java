/*
 * Clase para obtener resultados del area y la circunferencia de un circulo.
 */

package com.zubiri.geometria;
public class Circulo 
{

		//Creo método set y get para...
		private double radio = -1;

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
			result	= 3.1415 * radio * radio;
			return result;
		 }

		//Metodo que calcula la circunferencia.
		 public double circunf () 
		 {
			double result;
			result = 2 * radio * 3.1415;
			return result;
		 }
		 
 }

