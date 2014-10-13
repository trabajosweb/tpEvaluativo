package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Instrumento;

public interface IInstrumentoRepositorio {
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("MiUnidadSQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	public void guardar(Instrumento instrumento);
	public void borrar(Instrumento instrumento);
	public List<Instrumento> listarInstrumento();
}
