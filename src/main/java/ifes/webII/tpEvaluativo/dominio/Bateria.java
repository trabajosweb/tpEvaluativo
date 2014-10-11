package ifes.webII.tpEvaluativo.dominio;

public class Bateria extends Instrumento{
	
		private int cantPlatos;
	
		public Bateria(String marca, String modelo, String color, int cantPlatos) {
			super(marca, modelo, color);
			// TODO Auto-generated constructor stub
			this.cantPlatos=cantPlatos;
		}

		public int getCantPlatos() {
			return cantPlatos;
		}

		public void setCantPlatos(int cantPlatos) {
			this.cantPlatos = cantPlatos;
		}
		
		

}
