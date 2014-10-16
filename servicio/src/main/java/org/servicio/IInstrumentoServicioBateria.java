package org.servicio;

import java.util.List;
import org.dominio.Bateria;

public interface IInstrumentoServicioBateria {
	void guardar(Bateria bateria);
	void borrar(Bateria bateria);
	public List<Bateria> listarbaBaterias();
}
