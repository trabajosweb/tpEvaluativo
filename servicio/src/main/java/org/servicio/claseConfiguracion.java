package org.servicio;

import org.dominio.Bajo;
import org.dominio.Banda;
import org.dominio.Bateria;
import org.dominio.Musico;
import org.dominio.Trompeta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class claseConfiguracion {

	@Bean(name = "bajo")
	public Bajo getBajo() {
		return new Bajo("Fender", "Special", "Negro", 4);
	}

	@Bean(name = "bateria")
	public Bateria getbateria() {
		return new Bateria("Looser", "Lineal", "Blanco", 6);
	}

	@Bean(name = "trompeta")
	public Trompeta setTrompeta() {
		return new Trompeta("Soplito", "DobleG", "Plateado", "Conclave");
	}

	@Bean(name = "banda")
	public Banda setntbanda() {
		return new Banda("Los Tupipas", null);
	}

	@Bean(name = "musico")
	public Musico setntmusico() {
		return new Musico("Pepe", "Argento", null);
	}

	@Bean(name = "musico_1")
	public Musico setntmusico_1() {
		return new Musico("Marcos", "Torres", null);
	}

	@Bean(name = "musico_2")
	public Musico setntmusico_2() {
		return new Musico("Pablo", "Perez", null);
	}
}