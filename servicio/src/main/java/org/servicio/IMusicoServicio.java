package org.servicio;

import java.util.List;

import org.dominio.Musico;

public interface IMusicoServicio {
	void guardar(ISaveMusicoServicioView view);	
	void borrar(ISaveMusicoServicioView view);
	public List<Musico> listarMusicos();

	
}
