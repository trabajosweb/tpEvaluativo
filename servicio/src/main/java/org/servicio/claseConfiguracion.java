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
import org.dominio.Trompeta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class claseConfiguracion {
	
	@Bean(name="bajo") 
	public Bajo inBajo() { 
		return new Bajo();
	}
	@Bean(name="bateria")
	public Bateria inbateria(){
		return new Bateria();
	}
	@Bean (name="trompleta")
	public Trompeta intrompeta(){
		return new Trompeta();
	}
	@Bean(name="Musico")
	public Musico intmusico(){
		return new Musico();
	} 
	@Bean(name="Banda")
	public Banda intbanda(){
		return new Banda();
	}
	
	
}