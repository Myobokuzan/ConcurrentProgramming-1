package ej02;

public class Letra implements Runnable {

	private char letra;
	private Turno turno;
	private Impresora impresora;
	public Letra(char l,Impresora imp,Turno tur) {
		letra=l;
		impresora=imp;
		turno=tur;
	}
	
	public void run() {
		try {
			while(true) {
				if(turno.getTurno()==0) {
					impresora.imprimir("A");
					turno.incrementarTurno(1);
				}else {
					if(turno.getTurno()==1) {
						impresora.imprimir("BB");
						turno.incrementarTurno(2);
					}else {
						if(turno.getTurno()==2) {
							impresora.imprimir("CCC");
							turno.incrementarTurno(3);
						}
					}
				}
				
			}
		}catch(Exception e) {
			
		}
	}
	
	
}
