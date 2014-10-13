package org.repositorio;

import java.util.List;
import java.util.ArrayList;

import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.Transaction;
import org.dominio.Instrumento;

public class InstrumentoRepositorio implements IInstrumentoRepositorio {

	public void guardar(Instrumento instrumento) {
		Transaction tx=pm.currentTransaction();
    	try
    	{
    		tx.begin();
    		pm.makePersistent(instrumento);
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

	public void borrar(Instrumento instrumento) {
		// TODO Auto-generated method stub
		
	}
	public  List<Instrumento> listarInstrumento() {
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
