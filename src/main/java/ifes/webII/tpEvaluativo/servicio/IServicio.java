package ifes.webII.tpEvaluativo.servicio;


import ifes.webII.tpEvaluativo.dominio.Musico;

import java.util.List;

public interface IServicio {
	
	void insertData();
	
	void updateData();
	
	//para el delete que id vamos a usar
	
	void deleteData();
	
	public List<Musico> getMusicoList();
	
	//public Musico getAlumnos ()
	

}
