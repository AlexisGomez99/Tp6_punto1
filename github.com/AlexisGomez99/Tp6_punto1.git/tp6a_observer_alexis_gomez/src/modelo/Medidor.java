package modelo;

import java.util.List;

public class Medidor extends Observable{
	private String temperatura;
	private ClimaOnline clima;

	public Medidor(ClimaOnline clima, List<Observer> observable) {
		this.clima = clima;
		for (Observer observer : observable) {
	         this.agregarObservador(observer);
	     }
	}
	
	public void notificar() {
		this.notificar(temperatura);
	}

	public String leerTemperatura() {
		// leo la temperatura del servicio web
		this.temperatura = this.clima.temperatura();
		return this.temperatura;
	}
}