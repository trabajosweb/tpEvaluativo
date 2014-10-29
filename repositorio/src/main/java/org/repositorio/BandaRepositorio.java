package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.dominio.Banda;
import org.dominio.Instrumento;
import org.dominio.Musico;

public class BandaRepositorio implements IRepositorio {
	
	public void guardar(Object objeto) {

		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.makePersistent(objeto);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
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

	public List listar() {

		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
				tx.begin();
				Query consulta = pm.newQuery(Banda.class);
				 consulta.setClass(Banda.class);
				 List<Banda> res = (List<Banda>) consulta.execute();
				 
				 for(Banda b: res){
					 System.out.println(b.toString());
				 }
				 tx.commit();
				 return res;
				 
				 
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		

	}

}
