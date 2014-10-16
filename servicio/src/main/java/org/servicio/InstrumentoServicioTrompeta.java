package org.servicio;

import java.util.List;

import org.dominio.Trompeta;
import org.repositorio.IInstrumentoRepositorioTrompeta;
import org.repositorio.InstrumentoRepositorioTrompeta;

public class InstrumentoServicioTrompeta implements IInstrumentoServicioTrompeta{
	
	private IInstrumentoRepositorioTrompeta trompetarepo = new InstrumentoRepositorioTrompeta();
	
	public void guardar(Trompeta trompeta) {
		// TODO Auto-generated method stub
		//InstrumentoRepositorioTrompeta repo= new InstrumentoRepositorioTrompeta();
		//repo.guardar(trompeta);
		Trompeta nuevo = new Trompeta(trompeta.getColor(), trompeta.getMarca(), trompeta.getModelo(), trompeta.getTipo());
						
		trompetarepo.guardar(nuevo);
		
		System.out.println(nuevo);
		
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
