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

	public void guardar(Musico musico) {
		// TODO Auto-generated method stub
		
		Musico nuevo = new Musico(musico.getNombre(), musico.getApellido(), musico.getBanda(), musico.getInstrumento());
		musicorepositorio.guardar(nuevo);
	}

	public void borrar(Musico musico) {
		// TODO Auto-generated method stub
		
	}
}
