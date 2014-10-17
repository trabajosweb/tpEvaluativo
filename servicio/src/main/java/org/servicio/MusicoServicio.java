package org.servicio;
import java.util.List;

import org.dominio.Instrumento;
import org.dominio.Musico;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.repositorio.MusicoRepositorio;


public class MusicoServicio implements IServicio{

	
	
	public List<Musico> listarMusicos() {
		List<Musico> lista = null;
		try {
			IRepositorio repo= new MusicoRepositorio();
			lista = repo.listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	public void guardar(Musico musico) {
		// TODO Auto-generated method stub
		
		Musico nuevo = new Musico(musico.getNombre(), musico.getApellido(), musico.getBanda(), musico.getInstrumento());
		//musicorepositorio.guardar(nuevo);
	}

	public void borrar(Musico musico) {
		// TODO Auto-generated method stub
		
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
