package main;

import java.util.List;

import modelo.Medidor;
import modelo.WeatherChannelService;

public class Main {

	public static void main(String[] args) {
		Medidor medidor= new Medidor(new WeatherChannelService(), List.of(new EnConsola(), new EnDisco("C:\\Users\\Alexis\\Desktop\\Grados.txt")));
		medidor.leerTemperatura();
		medidor.notificar();
	}

}
