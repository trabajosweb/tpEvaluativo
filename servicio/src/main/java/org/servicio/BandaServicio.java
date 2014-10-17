package org.servicio;
import java.util.List;

import org.dominio.Banda;
import org.dominio.Musico;
import org.repositorio.BandaRepositorio;
import org.repositorio.MusicoRepositorio;


public class BandaServicio implements IServicio{
	
	//public void guardar(ISaveBandaServicioView view)
	public void guardar(Banda banda)
	{
		// TODO Auto-generated method stub
		
		//Banda banda = new Banda(view.getNombre(), view.getListaMusicos());
		//BandaRepositorio.guardar(banda);
	}

	//public void borrar(ISaveBandaServicioView view)
	public void borrar(Banda banda)
	{
		// TODO Auto-generated method stub
		
	}

	public List<Banda> listarBandas() {
		// TODO Auto-generated method stub
		List<Banda> lista = null;
		try {
			BandaRepositorio repo= new BandaRepositorio();
			lista = repo.listarBanda();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
