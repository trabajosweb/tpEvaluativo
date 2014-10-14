package org.servicio;
import java.util.List;

import org.dominio.Instrumento;
import org.dominio.Musico;
import org.repositorio.IInstrumentoRepositorio;
import org.repositorio.IMusicoRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.repositorio.MusicoRepositorio;


public class MusicoServicio implements IMusicoServicio{

	private IMusicoRepositorio musicorepositorio = new MusicoRepositorio();
	
	
	public List<Musico> listarMusicos() {
		List<Musico> lista = null;
		try {
			IMusicoRepositorio repo= new MusicoRepositorio();
			lista = repo.listarMusico();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	public void guardar(ISaveMusicoServicioView view) {
		// TODO Auto-generated method stub
		
		Musico musico = new Musico(view.getNombre(), view.getApellido(), view.getInstrumento(), view.getBanda());
		
		musicorepositorio.guardar(musico);
	}

	public void borrar(ISaveMusicoServicioView view) {
		// TODO Auto-generated method stub
		
	}
}
