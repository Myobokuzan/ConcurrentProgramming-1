package ej04;

public class Dato {
	private int valor;
	public Dato() {
		valor=3;
	}
	public synchronized void setValor(int val) {
		this.valor=val;
	}
	public synchronized int getValor() {
		return this.valor;
	}
}
