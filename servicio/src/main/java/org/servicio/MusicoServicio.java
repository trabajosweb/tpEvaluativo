package org.servicio;
import java.util.List;

import org.dominio.Instrumento;
import org.dominio.Musico;
import org.repositorio.IInstrumentoRepositorio;
import org.repositorio.IMusicoRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.repositorio.MusicoRepositorio;


public class MusicoServicio {

	public void guardar(Musico musico) {
		try {
			IMusicoRepositorio repo= new MusicoRepositorio();
			repo.guardar(musico);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void borrar(Musico musico) {
		// TODO Auto-generated method stub
		
	}

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
}
