package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.listener.InstanceLifecycleListener;

import org.dominio.Bateria;
import org.springframework.stereotype.Repository;
@Repository
public class InstrumentoRepositorioBateria implements IInstrumentoRepositorioBateria{
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	public void guardar(Bateria bateria) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(bateria);
    		tx.commit();
       }
    	finally
    	{
    	    if (tx.isActive())
    	    {
    	        tx.rollback();
    	    }
    	    pm.close();
    	}

		
	}

	public void borrar(Bateria bateria) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.deletePersistent(bateria);
    		tx.commit();
       }
    	finally
    	{
    	    if (tx.isActive())
    	    {
    	        tx.rollback();
    	    }
    	    pm.close();
    	}

	}

	public List<Bateria> listarInstrumento() {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
		List<Bateria> lista= new ArrayList<Bateria>();
		try
    	{
    	    tx.begin();
		
			Extent ex = pm.getExtent(Bateria.class,true);
		    
		    Query q= (Query) pm.newQuery(ex);
		    
		    List<Bateria> instrumentos= (List<Bateria>)q.execute();
		    		
		    
		    for(Bateria bateria : instrumentos) {
		    	lista.add(bateria);
		    }
		    
		    tx.commit();
	    	        	
		}
		finally
		{
		    if (tx.isActive())
		    {
		        tx.rollback();
		    }
		    pm.close();
		}
		return lista;


	}

	
	
}
