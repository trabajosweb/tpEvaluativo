package org.servicio;
import java.util.List;

import org.dominio.Bajo;
import org.dominio.Instrumento;
import org.repositorio.InstrumentoRepositorio;

public class InstrumentoServicio implements IServicio{

	public List<Instrumento> listarInstrumento() {
		List<Instrumento> lista = null;
		try {
			InstrumentoRepositorio repo = new InstrumentoRepositorio();
			lista = repo.listarInstrumento();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	/*public void guardar(ISaveInstrumentoServicioView view) {
		// TODO Auto-generated method stub
		
		Instrumento instrumento = new Instrumento(view.getMarca(), view.getModelo(), view.getColor());
		instrumentoRepositorio.guardar(instrumento);	
		
	}*/

	//public void borrar(ISaveInstrumentoServicioView view)
	public void borrar(Instrumento instrumento){
		// TODO Auto-generated method stub
		
	}
	public void guardar(Instrumento instrumento){
		//instrumentoRepositorio.guardar(instrumento);
		}

	public void guardar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
