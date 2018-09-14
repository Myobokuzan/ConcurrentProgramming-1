package ej07version03;

import java.util.concurrent.Semaphore;

public class TestJaulaHamsters {

	
	public static void main(String [] args) {
		
		 // La jaula crea y controla los semaforos
		 
		Jaula jaula=new Jaula();
		Hamster h1,h2,h3;
		h1= new Hamster("Kira",jaula);
		h2= new Hamster("Eren",jaula);
		h3= new Hamster("Light",jaula);
		Thread hilo1 =new Thread(h1);
		Thread hilo2 =new Thread(h2);
		Thread hilo3 =new Thread(h3);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		
			}
}
