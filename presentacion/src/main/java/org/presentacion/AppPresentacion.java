package org.presentacion;

import java.io.IOException;

import org.servicio.BandaServicio;
import org.servicio.IServicio;
import org.servicio.InstrumentoServicio;
import org.servicio.MusicoServicio;


public class AppPresentacion{	
	public static void main(String[] args) throws IOException{
	 
		IServicio serviciobanda= new BandaServicio();
		serviciobanda.guardar();
		serviciobanda.listar();
	}


}
