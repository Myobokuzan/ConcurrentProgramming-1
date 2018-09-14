package ej07version02;

import java.util.concurrent.Semaphore;

public class TestJaula {

	public static void main(String [] args) {
		Hamster h1,h2,h3;
		
		Semaphore sH,sP,sR;
		sH=new Semaphore(1,true);
		sP=new Semaphore(1,true);
		sR=new Semaphore(1,true);
		Jaula jaula=new Jaula(sH,sP,sR);
		h1= new Hamster("Kira",sH,sP,sR,jaula);
		h2= new Hamster("Eren",sH,sP,sR,jaula);
		h3= new Hamster("Light",sH,sP,sR,jaula);
		Thread hilo1 =new Thread(h1);
		Thread hilo2 =new Thread(h2);
		Thread hilo3 =new Thread(h3);
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
