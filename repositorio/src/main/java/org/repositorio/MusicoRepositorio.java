package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.datanucleus.api.jdo.JDOPersistenceManager;
import org.datanucleus.query.typesafe.TypesafeQuery;
import org.dominio.Musico;

public class MusicoRepositorio implements IRepositorio {

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

	public List listar() {

		 PersistenceManager pm = pmf.getPersistenceManager();
		 List<Musico> lista= new ArrayList<Musico>();
		 try {
	     Query consulta = pm.newQuery();
		 consulta.setClass(Musico.class);
		 List<Musico> res = (List<Musico>) consulta.execute();
		 for (Musico musico: res){
			 lista.add(musico);
		 }
		 }
		 finally {
		 if (!pm.isClosed())
		 pm.close();
		 }
		 return lista;
	}

}
