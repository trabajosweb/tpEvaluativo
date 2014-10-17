package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.Bajo;
import org.dominio.Bateria;
import org.dominio.Instrumento;
import org.dominio.Trompeta;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstrumentoServicio implements IServicio {

	private IRepositorio repositorio;

	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}

//	public List<Instrumento> listarInstrumento() {
//	}

	public void guardar() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(
				claseConfiguracion.class);
		Bajo _bajo = (Bajo) context.getBean("bajo");
		Trompeta _trompeta = (Trompeta) context.getBean("trompeta");
		Bateria _bateria = (Bateria) context.getBean("bateria");
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		instrumentos.add(_bajo);
		instrumentos.add(_bateria);
		instrumentos.add(_trompeta);
		repositorio = new InstrumentoRepositorio();
		for (Instrumento _instrumento : instrumentos) {
			getRepositorio().guardar(_instrumento);
		}
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub

	}

	public List listar() {

		List<Instrumento> lista = null;
		try {
			InstrumentoRepositorio repo = new InstrumentoRepositorio();
			lista = repo.listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;

	}

}
