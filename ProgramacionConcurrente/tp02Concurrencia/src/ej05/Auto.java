package ej05;

public class Auto extends Vehiculo implements Runnable {
	
	private Surtidor unSurtidor;
	public Auto( String patente, String modelo, String marca, double kmFaltantes, double kmActual,Surtidor unSurt) {
		super("auto",patente,modelo,marca,kmFaltantes,kmActual);
		unSurtidor=unSurt;
		
		
	}
	public void run(){
		try {
		
			System.out.println("En service");
			unSurtidor.cargarNafta(kmFaltantesParaElService);
		}catch(Exception e) {
			
		}
	}
	
	public boolean recorrer(double km) {
		kmActual=km;
		boolean service;
		kmActual+=km;
		if(kmFaltantesParaElService<=kmActual) {
			kmActual=0;
			service=true;
		}else {
			service=false;
		}
		return service;
	}
	
	public double getKmActual() {
		return this.kmActual;
	}
	public String getModelo() {
		return this.modelo;
	}

}
