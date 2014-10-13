package org.dominio;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Musico {
	
	private String nombre;
	private String apellido;
	private Instrumento instrumento;
    private Banda banda;
    
   
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
