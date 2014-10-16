package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Trompeta;

public interface IInstrumentoRepositorioTrompeta {
	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	
	
	public void guardar(Trompeta trompeta);
	public void borrar(Trompeta trompeta);
	public List<Trompeta> listarInstrumento();

}
