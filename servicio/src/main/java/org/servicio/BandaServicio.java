package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.Banda;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.repositorio.BandaRepositorio;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BandaServicio implements IServicio {
	ApplicationContext context = new AnnotationConfigApplicationContext(claseConfiguracion.class);
	IRepositorio repositorio= (IRepositorio) context.getBean("RepositorioBanda");
	public void guardar() {
		Musico musico1= (Musico) context.getBean("musico1");
	    Musico musico2= (Musico) context.getBean("musico2");
	    Musico musico3= (Musico) context.getBean("musico3");
	    Banda  banda  = (Banda)  context.getBean("banda");	
		
	    List<Musico> lista= new ArrayList<Musico>();
	    lista.add(musico1);
		lista.add(musico2);
		lista.add(musico3);
		banda.setNombre("Los Cafres");
		banda.setListaMusicos(lista);
	    
		repositorio.guardar(banda);

	}

	public void borrar(Object objeto) {
		repositorio.borrar(objeto);
	}

	
	public void listar() {
		List<Banda> listaBanda = null;
		try {
			listaBanda= repositorio.listar();
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		} 
	}

