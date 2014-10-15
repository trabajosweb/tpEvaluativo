package org.servicio;

import java.util.List;

import org.dominio.Bajo;
import org.repositorio.IInstrumentoRepositorioBajo;
import org.repositorio.InstrumentoRepositorioBajo;

public class InstrumentoServicioBajo implements IInstrumentoServicioBajo{

	public void guardar(Bajo bajo) {
		// TODO Auto-generated method stub
			IInstrumentoRepositorioBajo repo= new InstrumentoRepositorioBajo();
			repo.guardar(bajo);
	}

	public void borrar(Bajo bajo) {
		// TODO Auto-generated method stub
		
	}

	public List<Bajo> listarbaBajos() {
		List<Bajo> lista = null;
		try {
			IInstrumentoRepositorioBajo repo = new InstrumentoRepositorioBajo();
			lista = repo.listarInstrumento();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}
