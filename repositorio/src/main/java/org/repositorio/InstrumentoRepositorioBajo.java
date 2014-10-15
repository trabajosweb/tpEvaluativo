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
public class InstrumentoRepositorioBajo implements IInstrumentoRepositorioBajo {

	public void guardar(Bajo bajo) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(bajo);
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

	public void borrar(Bajo Bajo) {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.removeInstanceLifecycleListener((InstanceLifecycleListener) Bajo);
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

	public List<Bajo> listarInstrumento() {
		// TODO Auto-generated method stub
		Transaction tx=pm.currentTransaction();
		List<Bajo> lista= new ArrayList<Bajo>();
		try
    	{
    	    tx.begin();
		
			Extent ex = pm.getExtent(Bajo.class,true);
		    
		    Query q= (Query) pm.newQuery(ex);
		    
		    List<Bajo> bajos= (List<Bajo>)q.execute();
		    		
		    
		    for(Bajo bajo : bajos) {
		    	lista.add(bajo);
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
