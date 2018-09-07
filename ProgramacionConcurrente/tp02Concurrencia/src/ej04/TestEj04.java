package ej04;

public class TestEj04{

	public static void main(String [] args) {
		Dato x= new Dato();
		TareaA tA= new TareaA(x);
		TareaB tB= new TareaB(x);
		Thread hilo1=new Thread(tA);
		Thread hilo2= new Thread(tB);
		hilo1.start();
		hilo2.start();
		
		System.out.println(x.getValor());
		
	}
}
