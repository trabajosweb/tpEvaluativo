package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.Banda;
import org.repositorio.BandaRepositorio;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BandaServicio implements IServicio {

	private IRepositorio repositorio;

	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public void guardar() {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				claseConfiguracion.class);
		Banda banda = (Banda) context.getBean("banda");
		
		List<Banda> bandas = new ArrayList<Banda>();
		bandas.add(banda);
		
		repositorio = new InstrumentoRepositorio();
		for (Banda _banda : bandas) {
			getRepositorio().guardar(_banda);
		}

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
