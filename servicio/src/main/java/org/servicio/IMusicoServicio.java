package org.servicio;

import java.util.List;

import org.dominio.Musico;

public interface IMusicoServicio {
	void guardar(Musico musico);	
	void borrar(Musico musico);
	public List<Musico> listarMusicos();

	
}
