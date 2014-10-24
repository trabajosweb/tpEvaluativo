package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;



@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Bateria extends Instrumento{
	
	  private int cantPlatos;
	  
	  public Bateria(String marca, String modelo, String color, int cantPlatos) {
			super(marca, modelo, color);
			this.cantPlatos=cantPlatos;
		}

		public int getCantPlatos() {
			return cantPlatos;
		}

		public void setCantPlatos(int cantPlatos) {
			this.cantPlatos = cantPlatos;
		}

		
		

}
