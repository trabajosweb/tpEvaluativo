package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;


import org.dominio.Instrumento;

public interface IInstrumentoRepositorio {
	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	
	public void guardar(Instrumento instrumnto);
	public void borrar(Instrumento instrumnto);
	public List<Instrumento> listarInstrumento();

}
