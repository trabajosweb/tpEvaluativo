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
	@Bean (name="trompeta")
	public Trompeta intrompeta(){
		return new Trompeta();
	}
	
	@Bean(name="banda")
	public Banda intbanda(){
		return new Banda();
	}
	
	@Bean(name="musico")
	public Musico intmusico(){
		return new Musico(null, null, null, null);
	} 
}