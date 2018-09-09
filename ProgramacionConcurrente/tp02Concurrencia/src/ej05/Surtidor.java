package ej05;

public class Surtidor {
	private double cantCarga;
	
	public Surtidor() {
		cantCarga=5000;
	}
	public synchronized void cargarNafta(double km) {
		cantCarga-=km;
	}
	public double getCantCarga() {
		return this.cantCarga;
	}
}
