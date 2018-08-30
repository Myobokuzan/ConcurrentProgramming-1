package tp01Concurrencia;

public class CajeraThread implements Runnable {
	private String nombre;
	private Cliente cliente;
	private long initialTime;
	
	public CajeraThread(String nombre,Cliente cliente, long initialTime) {
		this.nombre=nombre;
		this.cliente=cliente;
		this.initialTime=initialTime;
	}
	
	private void esperarXsegundos(int i) {
		try{
			Thread.sleep(i*1000);
		}catch(Exception e) {
			
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public Cliente cliente() {
		return this.cliente;
	}
	public long getInitialTime() {
		return this.initialTime;
	}
	public void run() {
		System.out.println("La cajera "+this.nombre+" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "+this.cliente.getNombre()+" EN EL TIEMPO: "+(System.currentTimeMillis()-this.initialTime/1000+" seg"));
		for(int i=0; i<this.cliente.getCarrito().length;i++) {
			this.esperarXsegundos(cliente.getCarrito()[i]);
			System.out.println("Procesado el producto "+(i+1)+" del cliente "+this.cliente.getNombre()+" -->Tiempo: "+(System.currentTimeMillis()-this.initialTime)/1000+" seg");
		}
		System.out.println("La cajera "+this.nombre+" HA TERMINADO DE PROCESAR "+this.cliente.getNombre()+" EN EL TIEMPO "+(System.currentTimeMillis()-this.initialTime)/1000+" seg");
	}
	

}
