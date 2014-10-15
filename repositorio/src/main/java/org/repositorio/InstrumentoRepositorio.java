package org.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.listener.InstanceLifecycleListener;

import org.dominio.Bajo;
import org.dominio.Instrumento;
import org.springframework.stereotype.Repository;
@Repository
public class InstrumentoRepositorio implements IInstrumentoRepositorio{

	public void guardar(Instrumento instrumnto) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(instrumnto);
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

	public void borrar(Instrumento instrumnto) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.removeInstanceLifecycleListener((InstanceLifecycleListener) instrumnto);
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

	public List<Instrumento> listarInstrumento() {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
		List<Instrumento> lista= new ArrayList<Instrumento>();
		try
    	{
    	    tx.begin();
		
			Extent ex = pm.getExtent(Instrumento.class,true);
		    
		    Query q= (Query) pm.newQuery(ex);
		    
		    List<Instrumento> instrumentos= (List<Instrumento>)q.execute();
		    		
		    
		    for(Instrumento instrumento : instrumentos) {
		    	lista.add(instrumento);
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
