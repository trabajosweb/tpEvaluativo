package org.servicio;
import java.util.List;

import org.dominio.Instrumento;
import org.repositorio.IInstrumentoRepositorio;
import org.repositorio.InstrumentoRepositorio;

public class InstrumentoServicio implements IInstrumentosServicio{

	private IInstrumentoRepositorio instrumentoRepositorio = new InstrumentoRepositorio();
	
	public List<Instrumento> listarInstrumento() {
		List<Instrumento> lista = null;
		try {
			IInstrumentoRepositorio repo = new InstrumentoRepositorio();
			lista = repo.listarInstrumento();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	public void guardar(ISaveInstrumentoServicioView view) {
		// TODO Auto-generated method stub
		
		Instrumento instrumento = new Instrumento(view.getMarca(), view.getModelo(), view.getColor());
		instrumentoRepositorio.guardar(instrumento);	
		
	}

	public void borrar(ISaveInstrumentoServicioView view) {
		// TODO Auto-generated method stub
		
	}

	
}
