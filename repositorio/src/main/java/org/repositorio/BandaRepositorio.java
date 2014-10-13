package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.dominio.Banda;

public class BandaRepositorio implements IBandaRepositorio{

	public void guardar(Banda banda) {
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(banda);
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

	public void borrar(Banda banda) {
		// TODO Auto-generated method stub
		
	}
	public  List<Banda> listarBanda() {
		Transaction tx=pm.currentTransaction();
		List<Banda> lista= new ArrayList<Banda>();
		try
    	{
    	    tx.begin();
		
			Extent ex = pm.getExtent(Banda.class,true);
		    
		    Query q= (Query) pm.newQuery(ex);
		    
		    List<Banda> bandas = (List<Banda>)q.execute();
		    		
		    
		    for(Banda banda : bandas) {
		    	lista.add(banda);
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