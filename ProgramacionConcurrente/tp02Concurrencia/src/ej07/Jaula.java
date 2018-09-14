package ej07;

public class Jaula {

	public static void main(String [] args) {
		Hamster h1,h2,h3;
		Hamaca hamaca=new Hamaca();
		Rueda rueda=new Rueda();
		Plato plato=new Plato();
		h1= new Hamster(hamaca,plato,rueda,"Kira");
		h2= new Hamster(hamaca,plato,rueda,"Eren");
		h3= new Hamster(hamaca,plato,rueda,"Light");
		Thread hilo1 =new Thread(h1);
		Thread hilo2 =new Thread(h2);
		Thread hilo3 =new Thread(h3);
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
