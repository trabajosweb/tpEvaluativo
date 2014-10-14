package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Bateria;


public interface IInstrumentoRepositorioBateria {
	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	
	public void guardar(Bateria bateria);
	public void borrar(Bateria bateria);
	public List<Bateria> listarInstrumento();

}
