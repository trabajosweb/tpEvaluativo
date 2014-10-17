package org.servicio;

import java.util.List;

import org.dominio.Banda;
import org.repositorio.BandaRepositorio;


public class BandaServicio implements IServicio {

	public void guardar() {
		// TODO Auto-generated method stub

	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub

	}

	public List listar() {
		List<Banda> lista = null;
		try {
			BandaRepositorio repo = new BandaRepositorio();
			lista = repo.listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}
