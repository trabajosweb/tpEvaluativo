package org.presentacion;

import java.io.IOException;

import org.servicio.BandaServicio;
import org.servicio.IServicio;
import org.servicio.InstrumentoServicio;
import org.servicio.MusicoServicio;


public class AppPresentacion{	
	public static void main(String[] args) throws IOException{
	 
		//IServicio servicioint= new InstrumentoServicio();
		//servicioint.guardar();
		//servicioint.listar();
		//IServicio SER = 	new MusicoServicio();
		//SER.listar();
		IServicio serviciobanda= new BandaServicio();
		//serviciobanda.guardar();
		serviciobanda.listar();
		
	}


}
