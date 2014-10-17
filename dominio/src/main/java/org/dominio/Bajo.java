package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;


@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.SUPERCLASS_TABLE)
public class Bajo extends Instrumento {

	
	private int cantCuerdas;

	public Bajo(String marca, String modelo, String color, int cantCuerdas) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
		this.cantCuerdas = cantCuerdas;
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
