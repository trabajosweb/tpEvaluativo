package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.annotations.Transactional;
import javax.jdo.listener.InstanceLifecycleListener;

import org.dominio.Musico;
import org.springframework.stereotype.Repository;


@Repository
public class MusicoRepositorio implements IMusicoRepositorio{

	//@Transactional
	public void guardar(Musico musico) {
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(musico);
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
	public void borrar(Musico musico) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.removeInstanceLifecycleListener((InstanceLifecycleListener) musico);
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
	public  List<Musico> listarMusico() {
		Transaction tx=pm.currentTransaction();
		List<Musico> lista= new ArrayList<Musico>();
		try
    	{
    	    tx.begin();
		
			Extent ex = pm.getExtent(Musico.class,true);
		    
		    Query q= (Query) pm.newQuery(ex);
		    
		    List<Musico> musicos= (List<Musico>)q.execute();
		    		
		    
		    for(Musico musico : musicos) {
		    	lista.add(musico);
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
