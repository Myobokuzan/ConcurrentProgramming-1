package ej07;

import java.util.concurrent.Semaphore;

public class Plato {

	private Semaphore semPlato;
	public Plato() {
		semPlato=new Semaphore(1,true);
		
	}
	
	public void comer(Hamster h) throws Exception {
		semPlato.acquire();
		System.out.println("\n Hamster comiendo:  "+h.getNombre());
		Thread.sleep(800);
		semPlato.release();
		System.out.println("\n Hamster  "+h.getNombre()+" termina de comer ");
	}
}
