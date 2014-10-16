package org.servicio;

import java.util.List;
import org.dominio.Bateria;
import org.repositorio.IInstrumentoRepositorioBateria;
import org.repositorio.InstrumentoRepositorioBateria;

public class InstrumentoServicioBateria implements IInstrumentoServicioBateria{

	
	
	public void guardar(Bateria bateria) {
		IInstrumentoRepositorioBateria repo= new InstrumentoRepositorioBateria();
		repo.guardar(bateria);}

	public void borrar(Bateria bateria) {
		// TODO Auto-generated method stub
		
	}

	public List<Bateria> listarbaBaterias() {
		List<Bateria> lista = null;
		try {
			IInstrumentoRepositorioBateria repo = new InstrumentoRepositorioBateria();
			lista = repo.listarInstrumento();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}
