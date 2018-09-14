package ej04;

import java.util.concurrent.Semaphore;

public class Dato {
	private Semaphore mutex;
	private int valor;
	public Dato() {
		valor=3;
		mutex=new Semaphore(1,true);
	}
	public   void setValor(int val,char letra) throws Exception {
		mutex.acquire();
		System.out.println("EN SETVALOR  LETRA  "+letra);
		Thread.sleep(2);
		this.valor=val;
		mutex.release();
		
	}
	public   int getValor(char letra) throws Exception {
		mutex.acquire();
		
		System.out.println("EN GETDATO    LETRA  "+letra);
		Thread.sleep(2);
		mutex.release();
		return this.valor;
		
	}
}
