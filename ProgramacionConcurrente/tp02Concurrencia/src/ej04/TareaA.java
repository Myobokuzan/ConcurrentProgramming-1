package ej04;

public class TareaA implements Runnable{
	private Dato unDato;
	public TareaA(Dato unD){
		this.unDato=unD;
	}
	public void run() {
		int val;
		System.out.println("en testA ");
		val=unDato.getValor();
		val++;
		unDato.setValor(val);
		System.out.println("Valor en testA "+unDato.getValor());
		
	}
}
