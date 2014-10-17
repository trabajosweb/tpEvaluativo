package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.SUPERCLASS_TABLE) 
public class Trompeta extends Instrumento{
	
	private String tipo;
	public Trompeta(){
	super();}
	
	public Trompeta(String marca, String modelo, String color, String tipo) {
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


	public boolean checkSum(String tipoTrompeta) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
