
import java.util.List;

import org.dominio.Musico;

public interface IServicio {
	
	void insertData();
	
	void updateData();
	
	//para el delete que id vamos a usar
	
	void deleteData();
	
	public List<Musico> getMusicoList();
	
	//public Musico getAlumnos ()
	

}
