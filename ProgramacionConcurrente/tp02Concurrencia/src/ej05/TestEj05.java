package ej05;

public class TestEj05 {

	
	
	public static void main(String []args) throws InterruptedException {
		Surtidor surt=new Surtidor();
		Auto auto1,auto2,auto3,auto4,auto5;
		auto1=new Auto("EHH283","Onix","Chevrolet",70,surt);
		auto2=new Auto("FDA704","Prisma","Chevrolet",70,surt);
		auto3=new Auto("ASD555","Cruce5","Chevrolet",150,surt);
		auto4=new Auto("QEW685","Spin","Chevrolet",100,surt);
		auto5=new Auto("POO124","Cobalt","Chevrolet",70,surt);
		

		Thread hilo1=new Thread(auto1);
		Thread hilo2=new Thread(auto2);
		Thread hilo3=new Thread(auto3);
		Thread hilo4=new Thread(auto4);
		Thread hilo5=new Thread(auto5);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo1.join();
		hilo2.join();
		hilo3.join();
		hilo4.join();
		hilo5.join();
	}
	
}
