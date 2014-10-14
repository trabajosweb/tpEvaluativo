package org.servicio;
import java.util.List;

import org.dominio.Banda;
import org.dominio.Musico;
import org.repositorio.BandaRepositorio;
import org.repositorio.IBandaRepositorio;
import org.repositorio.IMusicoRepositorio;
import org.repositorio.MusicoRepositorio;


public class BandaServicio implements IBandaServicio{
	
	private IBandaRepositorio bandaRepositorio = new BandaRepositorio();

	public void guardar(ISaveBandaServicioView view) {
		// TODO Auto-generated method stub
		
		Banda banda = new Banda(view.getNombre(), view.getListaMusicos());
		bandaRepositorio.guardar(banda);
	}

	public void borrar(ISaveBandaServicioView view) {
		// TODO Auto-generated method stub
		
	}

	public List<Banda> listarBandas() {
		// TODO Auto-generated method stub
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
