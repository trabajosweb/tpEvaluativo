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
		List<Banda> lista = new ArrayList<Banda>();
		try {
			tx.begin();

			Extent ex = pm.getExtent(Banda.class, true);

			Query q = (Query) pm.newQuery(ex);

			List<Banda> bandas = (List<Banda>) q.execute();
			
			tx.commit();
			return bandas;
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		

	}

}
