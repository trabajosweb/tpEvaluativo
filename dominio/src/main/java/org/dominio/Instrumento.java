package org.dominio;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;


@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE) 
public class Instrumento {
	
	private String marca;
	private String modelo;
	private String color;
	
	public Instrumento ( String marca, String modelo, String color){
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
