package org.servicio;

import java.util.List;
import org.dominio.Trompeta;

public interface IInstrumentoServicioTrompeta {
	void guardar(Trompeta trompeta);
	void borrar(Trompeta trompeta);
	public List<Trompeta> listar();
}
