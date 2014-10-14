package org.servicio;

import org.dominio.Banda;
import org.dominio.Instrumento;

public interface ISaveMusicoServicioView {
public String getNombre();
	
	public void setNombre(String nombre);
	
	public String getApellido();
	
	public void setApellido(String apellido);
	
	public Instrumento getInstrumento();
	
	public void setInstrumento(Instrumento instrumento);
	
	public Banda getBanda();
	
	public void setBanda(Banda banda);
	   

}
