package org.repositorio;

import java.util.List;

import org.dominio.Musico;

public interface IRepositorio {
	
    public void insertData(Musico musico);
	
	public void updateData(Musico musico);
	
	//para el delete que id vamos a usar
	
	public void deleteData();
	
	public List<Musico> getMusicoList();
	
	//public Musico getAlumnos ()

}
