package ej04;

public class TestEj04{

	public static void main(String [] args) throws Exception {
		Dato x= new Dato();
		TareaA tA= new TareaA(x);
		TareaB tB= new TareaB(x);
		Thread hilo1=new Thread(tA);
		Thread hilo2= new Thread(tB);
		hilo1.start();
		hilo2.start();
		hilo1.join();
		hilo2.join();
		System.out.println("EN MAIN ,VALOR FINAL DE DATO "+x.getValor('f'));
		
		
	}
}
