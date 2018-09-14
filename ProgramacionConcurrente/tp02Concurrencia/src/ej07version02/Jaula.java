package ej07version02;
import java.util.concurrent.Semaphore;


public class Jaula {
	private Semaphore semRueda,semHamaca,semPlato;

	public Jaula(Semaphore semHam,Semaphore semPl, Semaphore semRu) {
	
		semRueda=semRu;
		semHamaca=semHam;
		semPlato=semPl;
	}
	
	public  void hamacarse(Hamster h) throws Exception{
		
		System.out.println("\n\nHamster amacandose : "+h.getNombre());
		Thread.sleep(1000);
		System.out.println("\n Hamster  "+h.getNombre()+" termina de hamacarse ");
		
		
	}
	public  void comer(Hamster h) throws Exception{
		
		System.out.println("\n\nHamster comiendo : "+h.getNombre());
		Thread.sleep(1000);
		System.out.println("\n Hamster  "+h.getNombre()+" termina de comer ");
		
		
	}
	public  void usarRueda(Hamster h) throws Exception{
		
		System.out.println("\n\n Hamster rodando : "+h.getNombre());
		Thread.sleep(1000);
		System.out.println("\n Hamster  "+h.getNombre()+" termina de rodar ");
		
		
	}
}
