package tp01Concurrencia;

public class Test6b {
	public static void main(String[] args) {
		long initialTime = System.currentTimeMillis();
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);

		Thread t1 = new Thread(cajera1);
		Thread t2 = new Thread(cajera2);
		t1.start();
		t2.start();
	}
}
