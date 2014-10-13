package org.servicio;
import java.util.List;

import org.dominio.Instrumento;


public interface IInstrumentoServicio {
	void guardar(Instrumento instrumento);	
	void borrar(Instrumento instrumento);
	public List<Instrumento> listarInstrumento();
	
}
