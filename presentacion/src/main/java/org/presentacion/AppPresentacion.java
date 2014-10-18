package org.presentacion;



import java.io.IOException;

import org.servicio.BandaServicio;
import org.servicio.IServicio;
import org.servicio.InstrumentoServicio;


public class AppPresentacion{
      
	
	public static void main(String[] args) throws IOException{
	 
		IServicio servicioint= new InstrumentoServicio();
		servicioint.guardar();
		IServicio serviciobanda= new BandaServicio();
		serviciobanda.guardar();
		serviciobanda.listar();
	}


}
