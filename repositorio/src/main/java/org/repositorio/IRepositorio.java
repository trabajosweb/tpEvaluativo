package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;


public interface IRepositorio {

	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	
	public void guardar(Object objeto);
	public void borrar(Object objeto);
	public List listar();
}
