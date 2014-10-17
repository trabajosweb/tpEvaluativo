package org.repositorio;

import java.util.ArrayList;
import java.util.List;
import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.Transaction;
import org.dominio.Musico;

public class MusicoRepositorio implements IRepositorio {

	public void guardar(Object objeto) {
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
		List<Musico> lista = new ArrayList<Musico>();
		try {
			tx.begin();

			Extent ex = pm.getExtent(Musico.class, true);

			Query q = (Query) pm.newQuery(ex);

			List<Musico> musicos = (List<Musico>) q.execute();

			for (Musico musico : musicos) {
				lista.add(musico);
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
