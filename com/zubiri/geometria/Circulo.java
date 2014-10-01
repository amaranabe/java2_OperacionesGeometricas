/*
 * Clase para obtener resultados del area y la circunferencia de un circulo.
 */

package com.zubiri.geometria;
public class Circulo {


//Metodo que calcula el area.
 public double area (double radio) {

	double result;
	result	= 3.1415 * radio * radio;
	return result;
 }

//Metodo que calcula la circunferencia.
 public double circunf (double radio) {

	double result;
	result = 2 * radio * 3.1415;
	return result;
 }
 
 }

