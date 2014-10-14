package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Banda;

public interface IBandaRepositorio {
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	public void guardar(Banda banda);
	public void borrar(Banda banda);
	public List<Banda> listarBanda();
}
