package org.dominio;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.springframework.stereotype.Component;

@Component
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

	public boolean checkSum(int cantidadCuerda) {
		// TODO Auto-generated method stub
		return false;
	}

	public Bajo() {
			super();
		}

	

	
	
	

}
