package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;


@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.SUPERCLASS_TABLE) 
public class Bateria extends Instrumento{
	
	@Persistent	
	private int cantPlatos;
	public Bateria() {
		super();
	}
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

		public boolean checkSum(int cantidaPlatos) {
			// TODO Auto-generated method stub
			return false;
		}
		
		

}
