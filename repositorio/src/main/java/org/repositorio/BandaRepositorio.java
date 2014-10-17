package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.annotations.Transactional;
import javax.jdo.listener.InstanceLifecycleListener;

import org.dominio.Banda;
import org.springframework.stereotype.Repository;

@Repository
public class BandaRepositorio implements IRepositorio{
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	PersistenceManager pm = pmf.getPersistenceManager();
	//@Transactional
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
	
	@Transactional
	public void borrar(Banda banda) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
		try
    	{
    		tx.begin();
    		pm.deletePersistent(banda);
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
	
	//@Transactional
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

	public void guardar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	public void borrar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
