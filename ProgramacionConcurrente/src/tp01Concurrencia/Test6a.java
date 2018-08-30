package tp01Concurrencia;

public class Test6a {
	public static void main(String[] args) {
		long initialTime = System.currentTimeMillis();
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		CajeraA cajera1 = new CajeraA("Cajera 1");
		cajera1.procesarCompra(cliente1, initialTime);
		cajera1.procesarCompra(cliente2, initialTime);
	}
}
