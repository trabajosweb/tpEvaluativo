package org.servicio;

import java.util.List;


public interface IServicio {

	void guardar(Object objeto);	
	void borrar (Object objeto);
	public List listar();
}
