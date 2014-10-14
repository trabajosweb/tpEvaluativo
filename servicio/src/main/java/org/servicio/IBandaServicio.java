package org.servicio;

import java.util.List;

import org.dominio.Banda;

public interface IBandaServicio {
	
	
		void guardar(ISaveBandaServicioView view);	
		void borrar(ISaveBandaServicioView view);
		public List<Banda> listarBandas();

}
