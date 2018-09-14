package ej02;

public class Turno {

	private int turno;
	
	public Turno() {
		turno=0;
	}
	public synchronized int getTurno() {
		return turno;
	}
	public synchronized void incrementarTurno(int tur) {
		turno=tur;
	}
}
