package ej02;

public class TestImprimirLetras {

	
	public static void main(String [] args) {
		Turno turno=new Turno();
		Impresora impresora=new Impresora();
		Letra lA=new Letra('A',impresora,turno);
		Letra lB=new Letra('B',impresora,turno);
		Letra lC=new Letra('C',impresora,turno);
		Thread hilo1=new Thread(lA);
		Thread hilo2=new Thread(lB);
		Thread hilo3=new Thread(lC);
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
