package org.servicio;

import java.util.List;

import org.dominio.Bajo;
import org.dominio.Instrumento;

public interface IInstrumentoServicioBajo {
	void guardar(Bajo bajo);
	void borrar(Bajo bajo);
	public List<Bajo> listarbaBajos();
}
