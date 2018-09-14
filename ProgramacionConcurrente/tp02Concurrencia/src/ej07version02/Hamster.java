package ej07version02;
import java.util.concurrent.Semaphore;
public class Hamster implements Runnable{
	private Jaula jaula;
	private Semaphore semHamaca,semPlato,semRueda;
	private String nombre;
	public Hamster(String unNombre, Semaphore sHam,Semaphore sPl, Semaphore sRu,Jaula unaJaula) {
		this.nombre=unNombre;
		semHamaca=sHam;
		semPlato=sPl;
		semRueda=sRu;
		jaula=unaJaula;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void run() {
		
		try{
			while(true) {
			if(semHamaca.tryAcquire()) {
				jaula.hamacarse(this);
				semHamaca.release();
				if(semPlato.tryAcquire()) {
					jaula.comer(this);
					semPlato.release();
				
					if(semRueda.tryAcquire()) {
						jaula.usarRueda(this);
						semRueda.release();
					}
				}
			}
			
			}
			}catch(Exception e) {
			
		}
		
		
	}
	
	
	
}
