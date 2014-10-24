package org.servicio;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.LineListener;

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

	ApplicationContext context = new AnnotationConfigApplicationContext(claseConfiguracion.class);
	IRepositorio repositorioMus= (IRepositorio) context.getBean("RepositorioMusico");
	public void guardar() {
		repositorioMus.guardar((Musico) context.getBean("musico1"));
		repositorioMus.guardar((Musico) context.getBean("musico2"));
		repositorioMus.guardar((Musico) context.getBean("musico3"));
		
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("unchecked")
	public void listar() {
		List<Musico> lista = null;
		try {
			lista = repositorioMus.listar();
			for(Musico musico:lista){
				System.out.println("nombre: "+musico.getApellido()+", apellido: "+musico.getNombre());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}
