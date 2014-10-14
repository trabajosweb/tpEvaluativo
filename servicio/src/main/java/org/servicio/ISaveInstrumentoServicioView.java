package org.servicio;

public interface ISaveInstrumentoServicioView {
	
	//instrumentos get y set
	public String getMarca();
	
	public void setMarca(String marca);
	
	public String getModelo();
	
	public void setModelo(String modelo);
	
	public String getColor();
	
	public void setColor(String color);
	
	//bajo get y set para view

	public int getCantCuerdas();
	
	public void setCantCuerdas(int cantCuerdas);
	
}
