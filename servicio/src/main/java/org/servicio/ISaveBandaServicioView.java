package org.servicio;

import java.util.List;

import org.dominio.Musico;

public interface ISaveBandaServicioView {


	public String getNombre();
	
	public void setNombre(String nombre);
	
	public List<Musico> getListaMusicos();
	
	public void setListaMusicos(List<Musico> listaMusicos);
		

	
}
