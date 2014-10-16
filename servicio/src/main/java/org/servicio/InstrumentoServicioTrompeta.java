package org.servicio;

import java.util.List;

import org.dominio.Trompeta;
import org.repositorio.IInstrumentoRepositorioTrompeta;
import org.repositorio.InstrumentoRepositorioTrompeta;

public class InstrumentoServicioTrompeta implements IInstrumentoServicioTrompeta{

	public void guardar(Trompeta trompeta) {
		// TODO Auto-generated method stub
		InstrumentoRepositorioTrompeta repo= new InstrumentoRepositorioTrompeta();
		repo.guardar(trompeta);
	}

	public void borrar(Trompeta trompeta) {
		// TODO Auto-generated method stub
		
	}

	public List<Trompeta> listar() {
		List<Trompeta> lista = null;
		try {
			IInstrumentoRepositorioTrompeta repo = new InstrumentoRepositorioTrompeta();
			lista = repo.listarInstrumento();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}
