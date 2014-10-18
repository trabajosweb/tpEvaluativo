package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.Banda;
import org.dominio.Musico;
import org.repositorio.BandaRepositorio;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BandaServicio implements IServicio {
	ApplicationContext context = new AnnotationConfigApplicationContext(claseConfiguracion.class);
	private IRepositorio repositorio;

	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public void guardar() {
		
		Banda banda = (Banda) context.getBean("banda");
		List<Musico> lista= new ArrayList<Musico>();
		lista.add((Musico) context.getBean("musico"));
		lista.add((Musico) context.getBean("musico_1"));
		lista.add((Musico) context.getBean("musico_2"));
		banda.setNombre("Los Cafres");
		banda.setListaMusicos(lista);
		IRepositorio repo= new BandaRepositorio();
		repo.guardar(banda);

	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub

	}

	public List listar() {
		List<Banda> lista = null;
		try {
			BandaRepositorio repo = new BandaRepositorio();
			lista = repo.listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}
