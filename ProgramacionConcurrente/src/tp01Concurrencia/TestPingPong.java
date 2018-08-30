package tp01Concurrencia;

public class TestPingPong {
	public static void main(String[] args) {
		pingPong p1=new pingPong("PING",33);
		pingPong p2=new pingPong("PONG",10);
		pingPong p3=new pingPong("PANG",20);
	pingPong p4=new pingPong("PUNG",25);
	
		
		
		p1.start();
		p2.start();
	p3.start();
	p4.start();
		
	for(int i=0;i<1000;i++) {
		System.out.println("vayne");
			try {
			Thread.sleep(30);
		}catch(InterruptedException e) {				
		}
		
	}
	}
}
