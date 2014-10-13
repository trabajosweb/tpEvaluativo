package org.repositorio;

import java.util.*;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Musico;

public interface IMusicoRepositorio {
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("MiUnidadSQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	public void guardar(Musico musico);
	public void borrar(Musico musico);
	public List<Musico> listarMusico();
}
