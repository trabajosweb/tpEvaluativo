package org.servicio;
import java.util.List;

import org.dominio.Banda;
import org.dominio.Musico;
import org.repositorio.BandaRepositorio;
import org.repositorio.IBandaRepositorio;
import org.repositorio.IMusicoRepositorio;
import org.repositorio.MusicoRepositorio;


public class BandaServicio implements IBandaRepositorio{

	public void guardar(Banda banda) {
		try {
			IBandaRepositorio repo= new BandaRepositorio();
			repo.guardar(banda);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void borrar(Banda banda) {
		// TODO Auto-generated method stub
		
	}

	public List<Banda> listarBanda() {
		List<Banda> lista = null;
		try {
			IBandaRepositorio repo= new BandaRepositorio();
			lista = repo.listarBanda();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}
