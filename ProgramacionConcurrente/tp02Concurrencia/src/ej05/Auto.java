package ej05;

public class Auto extends Vehiculo implements Runnable {
	
	private double kmActual,kmFaltantesParaService;
	private Surtidor unSurti;
	
	public Auto(String patente, String modelo, String marca,double kmFaltantes, Surtidor surt) {
		super(patente , modelo, marca);
		kmActual=0;
		kmFaltantesParaService=kmFaltantes;
		unSurti=surt;
	}
	
	public void run() {
		try {
		while(true) {
			System.out.println("Auto : "+this.getModelo()+" ha recorrido  : "+this.getKmActual()+"\n le faltan :  "+(this.getKmFaltantes()-this.getKmActual()+" km para el Service \n \n"));

			this.recorrerKm(40);
			Thread.sleep(1000);
		}
		}catch(Exception e) {
			
		}
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public double getKmActual() {
		return this.kmActual;
	}
	public double getKmFaltantes() {
		return this.kmFaltantesParaService;
	}
	
	public void recorrerKm(int km) throws Exception{
		System.out.println("\nAuto: "+this.getModelo()+" RECORRIENDO \n\n");
		this.kmActual+=km;
		
		if(kmActual>=kmFaltantesParaService) {
			System.out.println("Auto "+this.getModelo()+"\n NECESITA SERVICE \n\n");
			unSurti.realizarService(this);
		}
	}
	public void reiniciarKilometraje() {
		this.kmActual=0;
	}
	
}
	