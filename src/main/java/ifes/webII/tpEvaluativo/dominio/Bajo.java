package ifes.webII.tpEvaluativo.dominio;

public class Bajo extends Instrumento{
	
	private int cantCuerdas;
	
	public Bajo(String marca, String modelo, String color, int cantCuerdas) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
		this.cantCuerdas= cantCuerdas;
	}

	public int getCantCuerdas() {
		return cantCuerdas;
	}

	public void setCantCuerdas(int cantCuerdas) {
		this.cantCuerdas = cantCuerdas;
	}

	
	
	

}
