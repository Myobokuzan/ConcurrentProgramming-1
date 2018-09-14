package ej07version03;

public class Hamster implements Runnable{

	private String nombre;
	private Jaula jaula;
	
	public Hamster(String unNombre,Jaula unaJaula) {
		this.nombre=unNombre;
		this.jaula=unaJaula;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void run() {
		
		try{
			while(true) {
				
			jaula.hamacarse(this);
			jaula.comer(this);
			jaula.usarRueda(this);
			}
			}catch(Exception e) {
			
		}
		
		
	}
	
	
	
}