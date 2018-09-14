package ej07;

public class Hamster implements Runnable{

	private Hamaca hamaca;
	private Plato plato;
	private Rueda rueda;
	private String nombre;
	
	public Hamster(Hamaca unaHam,Plato unPlato, Rueda unaRueda, String unNombre) {
		this.hamaca=unaHam;
		this.plato=unPlato;
		this.rueda=unaRueda;
		this.nombre=unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void run() {
		
		try{
			while(true) {
				
			hamaca.hamacarse(this);
			plato.comer(this);
			rueda.usarRueda(this);
			}
			}catch(Exception e) {
			
		}
		
		
	}
	
	
	
}
