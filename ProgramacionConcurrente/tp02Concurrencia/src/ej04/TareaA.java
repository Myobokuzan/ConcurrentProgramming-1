package ej04;

public class TareaA implements Runnable{
	private Dato unDato;
	public TareaA(Dato unD){
		this.unDato=unD;
	}
	public void run() {
		int val;
		try {
		for(int i=0;i<100;i++){
		System.out.println("en testA ");
		val=unDato.getValor('A');
		val++;
		unDato.setValor(val,'A');
		
		}
		}catch(Exception e) {
			
		}
	}
}
