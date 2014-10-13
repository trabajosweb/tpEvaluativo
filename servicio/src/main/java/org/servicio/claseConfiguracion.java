package org.servicio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.dominio.Bajo;
import org.dominio.Banda;
import org.dominio.Bateria;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.dominio.trompeta;
import org.repositorio.InstrumentoRepositorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class claseConfiguracion {
	
	@Bean(name="bajo") 
	public Bajo inBajo() { 
		return new Bajo("gibson", "gibsonsa", "rojo", 4);
	}
	@Bean(name="bateria")
	public Bateria inbateria(){
		return new Bateria("tama","Swingstar", "negro",4);
	}
	@Bean (name="trompleta")
	public trompeta intrompeta(){
		return new trompeta("yamaha","150", "dorada", "Bb");
	}
	@Bean
	public Musico intmusico(){
		return new Musico("juan", "Perez", inbateria(),intbanda());
	} 
	public Banda intbanda(){
		List<Musico> musicos= new ArrayList<Musico>();
		musicos.add(intmusico());
		musicos.add(inmusico());
		musicos.add(imusico());
		return new Banda("la moto", musicos);
	}
	@Bean
	public Musico inmusico(){
		return new Musico("dario", "gonzalez", inBajo(), intbanda());
		
	}
	@Bean
	public Musico imusico(){
		return new Musico("carlos", "rodrigez", intrompeta(), intbanda());
		
	}
	
}