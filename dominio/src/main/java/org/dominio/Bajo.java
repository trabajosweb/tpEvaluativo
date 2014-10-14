package org.dominio;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Bajo extends Instrumento{
	
	@Persistent
	private int cantCuerdas;
	
	public Bajo(String marca, String modelo, String color, int cantCuerdas) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
		this.cantCuerdas= cantCuerdas;
	}

	public int getCantCuerdas() {
		return cantCuerdas;
	}

	public void setCantCuerdas(int cantCuerdas) {
		this.cantCuerdas = cantCuerdas;
	}

	
	
	

}
