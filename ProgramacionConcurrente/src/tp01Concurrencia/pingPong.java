package tp01Concurrencia;

public class pingPong extends Thread {
private String cadena;
private int delay;

public pingPong(String cartel, int ms) {
	this.cadena=cartel;
	this.delay=ms;
}
public void run() {
	for(int i=1; i <3;i++) {
		System.out.println(cadena+" ");
		try {
			Thread.sleep(delay);
		}catch(InterruptedException e){
			System.out.println("osea wey, no mames pinche pendejo");
			
		}
	}
}
}
