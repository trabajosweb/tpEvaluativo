package org.servicio;

import java.util.List;

import org.dominio.Instrumento;

public interface IInstrumentosServicio{

	//void guardar(ISaveInstrumentoServicioView view);	
	//void borrar(ISaveInstrumentoServicioView view);
	void guardar(Instrumento instrumento);	
	void borrar(Instrumento instrumento);
	public List<Instrumento> listarInstrumento();
	
}
