package org.dominio;

import java.util.List;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Banda {
	
	@Persistent
	private String nombre;
	@Persistent
	private List<Musico> listaMusicos;
	
	public Banda() {
		super();
	}
	public Banda(String nombre, List<Musico> listaMusicos) {
		super();
		this.nombre = nombre;
		this.listaMusicos = listaMusicos;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Musico> getListaMusicos() {
		return listaMusicos;
	}
	public void setListaMusicos(List<Musico> listaMusicos) {
		this.listaMusicos = listaMusicos;
	}
	
	
}
