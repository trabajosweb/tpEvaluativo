package org.repositorio;

import java.util.ArrayList;
import java.util.List;
import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.Transaction;
import org.dominio.Instrumento;

public class InstrumentoRepositorio implements IRepositorio {

	
	public void guardar(Object objeto) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		Transaction tx = pm.currentTransaction();
		List<Instrumento> lista = new ArrayList<Instrumento>();
		try {
			tx.begin();

			Extent ex = pm.getExtent(Instrumento.class, true);

			Query q = (Query) pm.newQuery(ex);

			List<Instrumento> instrumentos = (List<Instrumento>) q.execute();

			for (Instrumento instrumento : instrumentos) {
				lista.add(instrumento);
			}

			tx.commit();

		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return lista;
	}

}
