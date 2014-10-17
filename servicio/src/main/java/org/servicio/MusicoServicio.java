package org.servicio;
import java.util.ArrayList;
import java.util.List;

import org.dominio.Bajo;
import org.dominio.Bateria;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.dominio.Trompeta;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.repositorio.MusicoRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MusicoServicio implements IServicio{

	private IRepositorio repositorio;

	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public void borrar(Musico musico) {
		// TODO Auto-generated method stub
		
	}

	public void guardar() {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				claseConfiguracion.class);
		Musico musico = (Musico) context.getBean("musico");
		
		List<Musico> musicos = new ArrayList<Musico>();
		musicos.add(musico);
		
		repositorio = new InstrumentoRepositorio();
		for (Musico _musico : musicos) {
			getRepositorio().guardar(_musico);
		}
		
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	public List listar() {
		List<Musico> lista = null;
		try {
			IRepositorio repo= new MusicoRepositorio();
			lista = repo.listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	
	}
}
