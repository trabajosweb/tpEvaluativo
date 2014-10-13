package org.servicio;
import java.util.List;

import org.dominio.Instrumento;
import org.repositorio.IInstrumentoRepositorio;
import org.repositorio.InstrumentoRepositorio;

public class InstrumentoServicio implements IInstrumentoServicio{

	public void guardar(Instrumento instrumento) {
		try {
			IInstrumentoRepositorio repo =  new InstrumentoRepositorio();
			repo.guardar(instrumento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void borrar(Instrumento instrumento) {
		// TODO Auto-generated method stub
		
	}

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

	
}
