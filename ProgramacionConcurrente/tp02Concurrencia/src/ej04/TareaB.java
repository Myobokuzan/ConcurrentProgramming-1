package ej04;

public class TareaB implements Runnable{

	private Dato unDato;
	public TareaB(Dato unD) {
		this.unDato=unD;
	}
	public void run() {
		try{
			for(int i=0;i<100;i++){
		
		System.out.println("En test B");
		int val;
		val=unDato.getValor('B');
		val*=2;
		unDato.setValor(val,'B');
		
			}}catch(Exception e) {
		
	}
}
}
