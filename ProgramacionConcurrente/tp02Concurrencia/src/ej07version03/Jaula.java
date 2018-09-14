package ej07version03;

import java.util.concurrent.Semaphore;

public class Jaula {

	
	private Semaphore semRueda,semHamaca,semPlato;
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Jaula() {
		
		//Haciendo que jaula controle la exclusion mutua, esto hace que un hamster no coma hasta que otro no lo haga.
		//Kira come.....kira termina de comer.... Eren come... ( Eren no puede hamacarse hasta que kira no lo haga primero)
		semRueda=new Semaphore(1,true);
		semHamaca=new Semaphore(1,true);
		semPlato=new Semaphore(1,true);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}
	
	public  void hamacarse(Hamster h) throws Exception{
		semHamaca.acquire();
		System.out.println("\n\nHamster amacandose : "+h.getNombre());
		Thread.sleep(2000);
		System.out.println("\n Hamster  "+h.getNombre()+" termina de hamacarse ");
		semHamaca.release();
		
	}
	public  void comer(Hamster h) throws Exception{
		semPlato.acquire();
		System.out.println("\n\nHamster comiendo : "+h.getNombre());
		Thread.sleep(1000);
		System.out.println("\n Hamster  "+h.getNombre()+" termina de comer ");
		semPlato.release();
		
		
	}
	public  void usarRueda(Hamster h) throws Exception{
		semRueda.acquire();
		System.out.println("\n\n Hamster rodando : "+h.getNombre());
		Thread.sleep(1500);
		System.out.println("\n Hamster  "+h.getNombre()+" termina de rodar ");
		semRueda.release();
		
		
	}
}
