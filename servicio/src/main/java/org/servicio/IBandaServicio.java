package org.servicio;
import java.util.List;

import org.dominio.Banda;


public interface IBandaServicio {
	void guardar(Banda banda);	
	void borrar(Banda banda);
	public List<Banda> listarBandas();
}
