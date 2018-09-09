package ej05;

public class Vehiculo {

	protected String tipo, patente,modelo,marca;
	protected double kmFaltantesParaElService,kmActual;
	
	public  Vehiculo(String tipo, String patente, String modelo, String marca, double kmFaltantes, double kmActual) {
		this.tipo=tipo;
		this.patente=patente;
		this.modelo=modelo;
		this.marca=marca;
		this.kmFaltantesParaElService=kmFaltantes;
		this.kmActual=kmActual;
	}
	
}
