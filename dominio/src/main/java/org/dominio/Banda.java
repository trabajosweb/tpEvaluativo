package org.dominio;

import java.util.List;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Banda {

	
	private String nombre;
	
    @Persistent(mappedBy="banda")
    @Join
	private List<Musico> listaMusicos;

	public Banda(String nombre, List<Musico> listaMusicos) {
		super();
		this.nombre = nombre;
		this.listaMusicos = listaMusicos;
	}

	public Banda() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		String datos="";
		for (Musico m : listaMusicos) {
			datos+= m.toString()+"\n";
			}
		String cad = "\n nombre=" + nombre + " \n lista musicos \n" +  datos + "";
		return cad;
	}
}
