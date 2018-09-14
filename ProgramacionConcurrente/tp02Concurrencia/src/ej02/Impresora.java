package ej02;

public class Impresora {

	public Impresora() {
		
	}
	
	public synchronized void imprimir(String cad) {
		System.out.println(cad);
	}
}
