package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.Bajo;
import org.dominio.Banda;
import org.dominio.Bateria;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.dominio.Trompeta;
import org.repositorio.BandaRepositorio;
import org.repositorio.IRepositorio;
import org.repositorio.InstrumentoRepositorio;
import org.repositorio.MusicoRepositorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class claseConfiguracion {

	@Bean(name = "bajo")
	public Instrumento bajo() {
		return new Bajo("Fender", "Special", "Negro", 4);
	}

	@Bean(name = "bateria")
	public Instrumento bateria() {
		return new Bateria("Looser", "Lineal", "Blanco", 6);
	}

	@Bean(name = "trompeta")
	public Instrumento trompeta() {
		return new Trompeta("Soplito", "DobleG", "Plateado", "Conclave");
	}

	@Bean(name = "musico1")
	public Musico musico1() {
		return new Musico("Pepe", "Argento", trompeta(),banda());
	}

	@Bean(name = "musico2")
	public Musico musico2() {
		return new Musico("Marcos", "Torres", bajo(),banda());
	}

	@Bean(name = "musico3")
	public Musico musico3() {
		return new Musico("Pablo", "Perez", bateria(),banda());
	}

	@Bean(name = "banda")
	public Banda banda() {
		return new Banda();
	}
	@Bean(name = "RepositorioBanda")
	public IRepositorio iBandaRepositorio() {
		return new BandaRepositorio();
	}
	
	@Bean(name = "RepositorioInstrumento")
	public IRepositorio iInstrumentoRepositorio() {
		return new InstrumentoRepositorio();
	}
	
	@Bean(name = "RepositorioMusico")
	public IRepositorio iMusicaRepositorio() {
		return new MusicoRepositorio();
	}
}
