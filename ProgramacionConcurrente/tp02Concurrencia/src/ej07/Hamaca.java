package ej07;

import java.util.concurrent.Semaphore;

public class Hamaca {

	private Semaphore semHamaca;
	public Hamaca() {
		semHamaca=new Semaphore(1,true);
		
	}
	public void hamacarse(Hamster h) throws Exception {
		semHamaca.acquire();
		System.out.println("\n Hamster en hamaca :  "+h.getNombre());
		Thread.sleep(900);
		semHamaca.release();
		System.out.println("\n Hamster  "+h.getNombre()+" termina de hamacarse ");
	}
}
