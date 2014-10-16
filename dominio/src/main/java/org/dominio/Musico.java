package org.dominio;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.springframework.stereotype.Component;
@Component
@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE) 
@Discriminator(strategy=DiscriminatorStrategy.CLASS_NAME)  
public class Musico {
	
	@Persistent
	private String nombre;
	@Persistent
	private String apellido;
	@Persistent
	private Instrumento instrumento;
	@Persistent
	private Banda banda;
    
	public Musico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Musico(String nombre, String apellido, Instrumento instrumento,
			Banda banda) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.instrumento = instrumento;
		this.banda = banda;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Instrumento getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	public Banda getBanda() {
		return banda;
	}
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
    
    
	

}
