package ej04;

public class TareaB implements Runnable{

	private Dato unDato;
	public TareaB(Dato unD) {
		this.unDato=unD;
	}
	public void run() {
		try{
			Thread.sleep(5);
		}catch(Exception e) {
			
		}
		System.out.println("En test B");
		int val;
		val=unDato.getValor();
		val*=2;
		unDato.setValor(val);
		System.out.println("en testB "+unDato.getValor());
	}
}
