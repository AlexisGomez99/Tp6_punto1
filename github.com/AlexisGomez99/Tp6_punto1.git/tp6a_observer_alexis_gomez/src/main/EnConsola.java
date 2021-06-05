package main;

import modelo.Observer;

public class EnConsola implements Observer{

	@Override
	public void actualizar(String valor) {
		String[] valorNumerico= valor.split("c");
		Integer c= Integer.parseInt(valorNumerico[0]);
		if(c<12) {
			System.out.println("Hace frio, encienda la caldera.");
			System.out.println(valor);
		}
		else
			if(c>17) {
				System.out.println("Hace calor, se encenderá el aire acondicionado.");
				System.out.println(valor);
			}else
			{
				System.out.println(valor);
			}
	}

}
