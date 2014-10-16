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

import org.dominio.Trompeta;
import org.springframework.stereotype.Repository;
@Repository
public class InstrumentoRepositorioTrompeta implements IInstrumentoRepositorioTrompeta  {
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	public void guardar(Trompeta trompeta) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(trompeta);
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

	public void borrar(Trompeta trompeta) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.removeInstanceLifecycleListener((InstanceLifecycleListener) trompeta);
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

	public List<Trompeta> listarInstrumento() {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
		List<Trompeta> lista= new ArrayList<Trompeta>();
		try
    	{
    	    tx.begin();
		
			Extent ex = pm.getExtent(Trompeta.class,true);
		    
		    Query q= (Query) pm.newQuery(ex);
		    
		    List<Trompeta> trompetas= (List<Trompeta>)q.execute();
		    		
		    
		    for(Trompeta trompeta : trompetas) {
		    	lista.add(trompeta);
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
