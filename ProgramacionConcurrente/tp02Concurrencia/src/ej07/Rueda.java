package ej07;

import java.util.concurrent.Semaphore;

public class Rueda {

	private Semaphore semRueda;
	public Rueda() {
		semRueda=new Semaphore(1,true);
		
	}
	public void usarRueda(Hamster h) throws Exception {
		semRueda.acquire();
		System.out.println("\n Hamster rodando:  "+h.getNombre());
		Thread.sleep(800);
		semRueda.release();
		System.out.println("\n Hamster  "+h.getNombre()+" termina de rodar ");
	
}
}
