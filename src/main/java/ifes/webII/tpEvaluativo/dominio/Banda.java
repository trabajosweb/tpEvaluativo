package ifes.webII.tpEvaluativo.dominio;

import java.util.List;

public class Banda {

	private String nombre;
	private List<Musico> listaMusicos;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Musico> getListaMusicos() {
		return listaMusicos;
	}
	public void setListaMusicos(List<Musico> listaMusicos) {
		this.listaMusicos = listaMusicos;
	}
	
	
}
