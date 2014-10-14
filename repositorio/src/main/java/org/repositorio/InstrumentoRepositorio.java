package org.repositorio;

import java.util.List;
import java.util.ArrayList;

import javax.jdo.Extent;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.annotations.Transactional;

import org.dominio.Instrumento;
import org.springframework.stereotype.Repository;

@Repository
public class InstrumentoRepositorio implements IInstrumentoRepositorio {

	//@Transactional
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

	@Transactional
	public void borrar(Instrumento instrumento) {
		// TODO Auto-generated method stub
		
	}
	
	//@Transactional
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
