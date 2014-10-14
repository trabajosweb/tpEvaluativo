package org.dominio;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class trompeta extends Instrumento{

	@Persistent
	private String tipo;
	
	
	public trompeta(String marca, String modelo, String color, String tipo) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
}
