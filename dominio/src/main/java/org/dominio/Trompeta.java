package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Trompeta extends Instrumento{
	
	private String tipo;
	
	public Trompeta(String marca, String modelo, String color, String tipo) {
		super(marca, modelo, color);
		this.tipo=tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return super.toString()+"\n tipo= " + tipo + "";
	}

}
