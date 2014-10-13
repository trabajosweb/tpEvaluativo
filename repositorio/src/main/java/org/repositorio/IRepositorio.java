package org.repositorio;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import java.util.*;

import org.dominio.Musico;
import org.springframework.context.annotation.Configuration;


public interface IRepositorio {
	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite");
	PersistenceManager pm = pmf.getPersistenceManager();
	
	public void insertData(Object objeto);
	
	public void updateData(Object objeto);
	
	//para el delete que id vamos a usar
	
	public void deleteData();
	
	public List<Object> getList();
	
	//public Musico getAlumnos ()

}
