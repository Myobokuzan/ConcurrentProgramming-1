package ej05;

import java.util.concurrent.Semaphore;

public class Surtidor {
	private Semaphore mutex;
	public Surtidor() {
		mutex=new Semaphore(1,true);
		
	}
	
	public  void realizarService(Auto autoEnService) throws Exception {
		mutex.acquire();
		System.out.println("AUTO INGRESA SERVICE : \n "+autoEnService.getModelo()+"\n");
		Thread.sleep(1000);
		autoEnService.reiniciarKilometraje();
		System.out.println("Auto : "+autoEnService.getModelo()+"\n SERVICE FINALIZADO \n");
		mutex.release();
	}

}
