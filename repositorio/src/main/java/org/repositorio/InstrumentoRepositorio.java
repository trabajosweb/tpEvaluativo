package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.dominio.Instrumento;
import org.dominio.Musico;

public class InstrumentoRepositorio implements IRepositorio {

	public void guardar(Object objeto) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.makePersistent(objeto);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
			System.out.println("no se pudo guardar");
		}
	}

	public void borrar(Object objeto) {

		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.deletePersistent(objeto);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		
	}

	public List<Instrumento> listar() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		 try {
			 tx.begin();
			 Query consulta = pm.newQuery(Instrumento.class);
			 consulta.setClass(Instrumento.class);
			 List<Instrumento> res = (List<Instrumento>) consulta.execute();
			 tx.commit();
			 return res;
		 
		 }
		 finally {
		 if (!pm.isClosed())
		 pm.close();
		 
		 }
	}
}
