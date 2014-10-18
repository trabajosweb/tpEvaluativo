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

	public void listar() {
		try {
			IRepositorio repoInstrumento=new InstrumentoRepositorio();
			IRepositorio repoMusica= new InstrumentoRepositorio();
			IRepositorio repoBanda= new BandaRepositorio();
			List<Musico> listaMusico = new ArrayList<Musico>();
			List<Instrumento> listaInstrumento = new ArrayList<Instrumento>();
			List<Banda> listaBanda = new ArrayList<Banda>();
			listaMusico= repoMusica.listar();
			listaBanda= repoBanda.listar();
			listaInstrumento= repoInstrumento.listar();
			
			for(Banda banda: listaBanda){
				for(Musico musico: listaMusico){
					if(musico.getBanda()==banda){
						System.out.println("*******BANDA********");
						System.out.println("nombre:"+ banda.getNombre().toString());
						System.out.println("*******MUSICO********");
						System.out.println("nombre:"+musico.getNombre());
						System.out.println("apellido: "+musico.getApellido().toString());
						for(Instrumento instrumento: listaInstrumento){
							if(musico.getInstrumento()==instrumento){
								System.out.println("*******INSTRUMENTO********");
								System.out.println("Nombre: "+instrumento.getModelo().toString());
							}
							}
					}
					}
				}
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		} 
	}

