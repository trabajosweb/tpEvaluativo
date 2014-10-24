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
	ApplicationContext context = new AnnotationConfigApplicationContext(claseConfiguracion.class);

	IRepositorio repositorioInst= (IRepositorio) context.getBean("RepositorioInstrumento");
	public void guardar() {
		Bajo _bajo = (Bajo) context.getBean("bajo");
		Trompeta _trompeta = (Trompeta) context.getBean("trompeta");
		Bateria _bateria = (Bateria) context.getBean("bateria");
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		instrumentos.add(_bajo);
		instrumentos.add(_bateria);
		instrumentos.add(_trompeta);
		for (Instrumento _instrumento : instrumentos) {
			repositorioInst.guardar(_instrumento);
		}
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	public void listar() {

		List<Instrumento> lista = null;
		try {
			lista = repositorioInst.listar();
			System.out.println( lista.size());
			for (Instrumento instrumento: lista){
				System.out.println("******INSTRUMENTO******");
				System.out.println("Marca: "+instrumento.getMarca()+", Modelo: "+instrumento.getModelo()+", Color: "+instrumento.getColor());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
