package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Bajo;


public interface IInstrumentoRepositorioBajo {
	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	
	
	public void guardar(Bajo bajo);
	public void borrar(Bajo Bajo);
	public List<Bajo> listarInstrumento();


}
